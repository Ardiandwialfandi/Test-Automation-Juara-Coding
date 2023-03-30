package com.testing.magang.pages.login;


import com.testing.magang.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;
    @FindBy(xpath = "//i[@class='middle fa fa-angle-down']")
    WebElement pageLogout;
    @FindBy(xpath = "//span[normalize-space()='Log Out']")
    WebElement btnLogout;
    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    WebElement txtDashboard;
    @FindBy(xpath = "//h1[normalize-space()='Admin Login']")
    WebElement loginTitle;
    @FindBy(xpath = "//p[@class='alert alert-warning']")
    WebElement txtUsernameAtauPasswordSalah;

    public String getLoginTitle(){
        return loginTitle.getText();
    }
    public String getTxtDashboard(){
        return txtDashboard.getText();
    }
    public String getTxtUsernameAtauPasswordSalah(){
        return txtUsernameAtauPasswordSalah.getText();
    }
    public void enterUsername(String username){
        this.username.sendKeys(username);
    }
    public void enterPassword(String password){
        this.password.sendKeys(password);
    }
    public void buttonLogin() {
        btnLogin.click();
    }
    public void btnLogout() {
        btnLogout.click();
        pageLogout.click();
    }
}
