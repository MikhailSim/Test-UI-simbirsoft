package org.example;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PostTest {
    public static LoginPage loginPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage")); }

    @Test
    public void postTest() throws InterruptedException {
        loginPage.inputLogin(ConfProperties.getProperty("SimbirsoftQAtest@yandex.ru"));
        loginPage.clickLoginBtn();
        loginPage.inputPasswd(ConfProperties.getProperty("Qwerty_123456+"));
        loginPage.clickPasswdBtn();
        loginPage.clickMenuBtn();
        loginPage.clickDriveBtn();
        loginPage.clickCreateBtn();
        loginPage.clickFolderBtn();
        loginPage.inputItem(ConfProperties.getProperty(" Test QA"));
        loginPage.clickSaveBtn();
        Thread.sleep(2000);
        loginPage.clickClickBtn();
        WebElement myElement = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div/div/div[3]/div/div[1]"));
        myElement.sendKeys(Keys.RETURN);
        loginPage.clickNewBtn();
        loginPage.clickTxtBtn();
        loginPage.inputTxt(ConfProperties.getProperty("New txt file"));
        loginPage.clickNewtxtBtn();

        String first = driver.getWindowHandle();
        Set <String> set = driver.getWindowHandles();
        set.remove(first);
        assert set.size()==1;
        driver.switchTo().window(set.toArray(new String[0])[0]);
        driver.close();
        driver.switchTo().window(first);

        List<WebElement> Name = driver.findElements(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div/div/div[3]/div/div[1]"));
        int name = Name.size();
        System.out.println("Find files: " + name);

    } }
