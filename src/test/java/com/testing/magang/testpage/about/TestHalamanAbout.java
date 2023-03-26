package com.testing.magang.testpage.about;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.magang.libtest.LibraryTest;
import com.testing.magang.pages.about.AboutPage;
import com.testing.magang.utils.Regular;
import com.testing.magang.utils.RegularPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestHalamanAbout {

    public static WebDriver driver;
    public static AboutPage ap;
    public static ExtentTest ext;

    public TestHalamanAbout(){
        driver = LibraryTest.driver;
        ap = new AboutPage();
        ext = LibraryTest.extentTest;
    }

    @Given("Admin open web")
    public void admin_open_web(){
        ext.log(LogStatus.PASS,"Admin open web");
        driver.get(Regular.URL);
    }
    @When("Admin login web juara coding")
    public void admin_login_web_juara_coding(){
        ext.log(LogStatus.PASS,"Admin login web juara coding");
        ap.login();
    }
    @When("Admin klik tombol about")
    public void admin_klik_tombol_about(){
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Admin klik tombol about");
        ap.btnClick(RegularPage.tombolAbout);
    }

    @And("Admin klik tombol tambah")
    public void admin_klik_tombol_tambah(){
        ext.log(LogStatus.PASS, "Admin klik tombol tambah");
        ap.btnClick(RegularPage.tombolTambah);
    }

    @Then("Admin berhasil ke halaman tambah trainer")
    public void admin_berhasil_ke_halaman_tambah_trainer(){
        ext.log(LogStatus.PASS,"Admin berhasil ke halaman tambah trainer");
        Assert.assertEquals(ap.result(RegularPage.textTambahTrainer),"Tambah Trainer");
        RegularPage.delayDuration(1);
    }

}
