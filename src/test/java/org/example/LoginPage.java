package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[contains(@id, 'passp-field-login')]")
    private WebElement loginField;

    @FindBy(xpath = "//*[contains(@id, 'passp:sign-in')]")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[contains(@id, 'passp-field-passwd')]")
    private WebElement passwdField;

    @FindBy(xpath = "//*[contains(@id, 'passp:sign-in')]")
    private WebElement passwdBtn;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/header/div[2]/div[2]/div/div/a[1]/div")
    private WebElement menuBtn;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/header/div[2]/div[2]/div/div/div/ul/ul/li[3]/a/span")
    private WebElement driveBtn;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[1]/div[1]/div/div/span[2]/button")
    private WebElement createBtn;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[1]/div[3]/div/button[1]/span[1]")
    private WebElement folderBtn;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div/div/div/div[1]/div/form/span/input")
    private WebElement itemField;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div/div/div/div[2]/button")
    private WebElement saveBtn;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[2]/div[1]/div/div/div[3]/div/div[1]")
    private WebElement clickBtn;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[1]/div[1]/div/div/span[2]/button")
    private WebElement newBtn;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div[1]/div[3]/div/button[2]")
    private WebElement txtBtn;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div/div/div/div[1]/div/form/span/input")
    private WebElement txtField;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div/div/div/div[2]/button")
    private WebElement newtxtBtn;


    public void inputLogin(String login) {
        loginField.sendKeys("SimbirsoftQAtest@yandex.ru"); }
    public void inputPasswd(String passwd) {
        passwdField.sendKeys("Qwerty_123456+"); }
    public void clickLoginBtn() {
        loginBtn.click(); }
    public void clickPasswdBtn() {
        passwdBtn.click(); }
    public void clickMenuBtn() {
        menuBtn.click(); }
    public void clickDriveBtn() {
        driveBtn.click(); }
    public void clickCreateBtn() {
        createBtn.click(); }
    public void clickFolderBtn() {
        folderBtn.click(); }
    public void inputItem(String item) {
        itemField.sendKeys(" Test QA"); }
    public void clickSaveBtn() {
        saveBtn.click(); }
    public void clickClickBtn() {
        clickBtn.click(); }
    public void clickNewBtn() {
        newBtn.click(); }
    public void clickTxtBtn() {
        txtBtn.click(); }
    public void inputTxt(String login) {
        txtField.sendKeys("New txt file"); }
    public void clickNewtxtBtn() {
        newtxtBtn.click(); }
}
