package com.testing.magang.testpage.rincianbiaya;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.magang.libtest.LibraryTest;
import com.testing.magang.pages.rincianbiaya.RincianBiayaPages;
import com.testing.magang.utils.Regular;
import com.testing.magang.utils.RegularPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestHalamanRincianBiaya {
    public static WebDriver driver;
    public static RincianBiayaPages rbp;
    public static ExtentTest ext;

    public TestHalamanRincianBiaya(){
        driver = LibraryTest.driver;
        rbp = new RincianBiayaPages();
        ext = LibraryTest.extentTest;
    }

    @Given("Admin open web")
    public void Admin_open_web(){
        ext.log(LogStatus.PASS, "Admin Open Web");
        driver.get(Regular.URL);
    }
    @When("Admin login web juara coding")
    public void admin_login_web_juara_coding(){
        ext.log(LogStatus.PASS,"Admin login web juara coding");
        rbp.login();
    }
    @When("Admin klik tombol home")
    public void admin_klik_tombol_home() {
        ext.log(LogStatus.PASS, "Admin klik tombol home");
        RegularPage.delayDuration(2);
        rbp.btnClick(RegularPage.tombolMenuHome);
    }
    @And("Admin klik tombol rincian biaya")
    public void admin_klik_tombol_rincian_biaya(){
        ext.log(LogStatus.PASS, "Admin klik tombol rinciann biaya");
        RegularPage.delayDuration(1);
        rbp.btnClick(RegularPage.tombolRincianBiaya);
    }
    @And("Admin mengklik tombol tambah")
    public void admin_klik_tombol_tambah(){
        ext.log(LogStatus.PASS, "Admin klik tombol tambah");
        RegularPage.delayDuration(1);
        rbp.btnClick(RegularPage.tombolTambah);
    }
    @Then("Admin berhasil ke halaman tambah rincian biaya")
    public void admin_berhasil_ke_halaman_tambah_rincian_biaya(){
        ext.log(LogStatus.PASS,"Admin berhasil ke halaman tambah rincian biaya");
        Assert.assertEquals(rbp.result(RegularPage.textTambahRincianBiaya),"Tambah Rincian Biaya");
        RegularPage.delayDuration(1);
    }
}





