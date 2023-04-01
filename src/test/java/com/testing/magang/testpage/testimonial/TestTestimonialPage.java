package com.testing.magang.testpage.testimonial;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.magang.libtest.LibraryTest;
import com.testing.magang.utils.Regular;
import com.testing.magang.utils.RegularPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTestimonialPage {

    public static WebDriver driver;
    public static TestimonialPage ap;
    public static ExtentTest ext;

    public TestHalamanAbout(){
        driver = LibraryTest.driver;
        ap = new TestimonialPage();
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
    @When("Admin klik tombol testimonial")
    public void admin_klik_tombol_about(){
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Admin klik tombol about");
        ap.btnClick(RegularPage.tombolTestimonial);
    }

    @And("Admin klik tombol tambah")
    public void admin_klik_tombol_tambah(){
        ext.log(LogStatus.PASS, "Admin klik tombol tambah");
        ap.btnClick(RegularPage.tombolTambah);
    }

    @Then("Admin berhasil ke halaman tambah peserta")
    public void admin_berhasil_ke_halaman_tambah_peserta(){
        ext.log(LogStatus.PASS,"Admin berhasil ke halaman tambah peserta");
        Assert.assertEquals(ap.result(RegularPage.textTambahTrainer),"Tambah Peserta");
        RegularPage.delayDuration(1);
    }

}
