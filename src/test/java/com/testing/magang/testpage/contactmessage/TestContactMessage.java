package com.testing.magang.testpage.contactmessage;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.magang.libtest.LibraryTest;
import com.testing.magang.pages.contactmessages.FilterPage;
import com.testing.magang.utils.Regular;
import com.testing.magang.utils.RegularPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestContactMessage {
    public static WebDriver driver;
    public static FilterPage fp;
    public static ExtentTest ext;

    public TestContactMessage() {
        driver = LibraryTest.driver;
        fp = new FilterPage();
        ext = LibraryTest.extentTest;
    }

    @Given("Admin open web")
    public void admin_open_web() {
        ext.log(LogStatus.PASS, "Admin open web");
        driver.get(Regular.URL);
    }

    @When("Admin login web juara coding")
    public void admin_login_web_juara_coding() {
        ext.log(LogStatus.PASS, "Admin login web juara coding");
        fp.login();
    }

    @When("Admin klik tombol contact messages")
    public void admin_klik_tombol_contact_messages() {
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Admin klik tombol contact messages");
        fp.btnClick(RegularPage.tombolContactMessages);
    }

    @And("Admin klik filter combo box")
    public void admin_klik_filter_combo_box() {
        ext.log(LogStatus.PASS, "Admin klik filter combo box");
        fp.btnClick(RegularPage.tombolComboBox);
    }

    @And("Admin select nama")
    public void admin_select_nama() {
        RegularPage.delayDuration(2);
        ext.log(LogStatus.PASS, "Admin select nama");
        fp.btnClick(RegularPage.tombolComboBox);

    }

    @When("Admin select email")
    public void admin_select_email() {
        RegularPage.delayDuration(2);
        ext.log(LogStatus.PASS, "Admin select email");
        fp.btnClick(RegularPage.tombolComboBox);
    }

    @When("Admin select phone number")
    public void admin_select_phone_number() {
        RegularPage.delayDuration(2);
        ext.log(LogStatus.PASS, "Admin select phone number");
        fp.btnClick(RegularPage.tombolComboBox);
    }

    @When("Admin select subject")
    public void admin_select_subject() {
        RegularPage.delayDuration(2);
        ext.log(LogStatus.PASS, "Admin select subject");
        fp.btnClick(RegularPage.tombolComboBox);
    }

}

