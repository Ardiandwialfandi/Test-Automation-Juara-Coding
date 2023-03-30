package com.testing.magang.testpage.login;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.magang.drivers.DriverSingleton;
import com.testing.magang.libtest.LibraryTest;
import com.testing.magang.pages.login.LoginPage;
import com.testing.magang.utils.RegularPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    public static WebDriver driver;
    public static LoginPage pageLog;
    public static ExtentTest ext;

    public TestLogin() {
        driver = LibraryTest.driver;
        pageLog = new LoginPage();
        ext = LibraryTest.extentTest;
    }

    @Given("Admin open browser and url")
    public void admin_open_browser_and_url() {
        ext.log(LogStatus.PASS, "Admin open browser and url");
        driver.get("https://dev.ptdika.com/web_jc_v2/admin/login");
    }

    @When("Admin enter valid username")
    public void admin_enter_valid_username() {
        ext.log(LogStatus.PASS, "Admin enter valid username");
        pageLog.enterUsername("ucen1315@gmail.com");
    }

    @And("Admin enter valid password")
    public void admin_enter_valid_password() {
        ext.log(LogStatus.PASS, "Admin enter valid password");
        pageLog.enterPassword("a");
    }

    @And("Admin click button sign-in")
    public void admin_click_button_signin() {
        ext.log(LogStatus.PASS, "Admin click button sign-in");
        pageLog.buttonLogin();
    }

    @Then("Admin go to page Dashboard")
    public void admin_go_to_page_Dashboard() {
        ext.log(LogStatus.PASS, "Admin go to page Dashboard");
        RegularPage.delayDuration(2);
        Assert.assertEquals(pageLog.getTxtDashboard(), "Dashboard");
    }

    @When("Admin click button logout")
    public void admin_click_button_logout() {
        ext.log(LogStatus.PASS, "Admin click button logout");
        pageLog.btnLogout();
    }

    @And("Admin enter invalid username")
    public void admin_enter_invalid_username() {
        ext.log(LogStatus.PASS, "Admin enter invalid username");
        pageLog.enterUsername("ucen1315@gmail.com");
    }

    @And("Admin enter invalid password")
    public void admin_enter_invalid_password() {
        ext.log(LogStatus.PASS, "Admin enter invalid password");
        pageLog.enterPassword("aaa");
    }

    @Then("Admin invalid login")
    public void admin_invalid_login() {
        ext.log(LogStatus.PASS, "Admin enter invalid login");
    }

    @Then("Admin get message username atau password salah")
    public void admin_get_message_username_atau_password_salah() {
        ext.log(LogStatus.PASS, "Admin get message username atau password salah");
        Assert.assertEquals(pageLog.getTxtUsernameAtauPasswordSalah(), "Username Atau Password Salah");
    }
}
