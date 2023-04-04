package com.testing.magang.testpage.rincianbiaya;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.magang.libtest.LibraryTest;
import com.testing.magang.pages.benefit.BenefitPages;
import com.testing.magang.utils.RegularPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestHalamanBenefit {
    public static WebDriver driver;
    public static BenefitPages bp;
    public static ExtentTest ext;
    public  TestHalamanBenefit(){
        driver = LibraryTest.driver;
        bp = new BenefitPages();
        ext = LibraryTest.extentTest;
    }
    @And("Admin klik tombol benefit")
    public void Admin_klik_tombol_benefit(){
        ext.log(LogStatus.PASS, "Admin klik tombol benefit");
        RegularPage.delayDuration(1);
        bp.btnClick(RegularPage.tombolBenefit);
    }
    @Then("Admin berhasil ke halaman tambah benefit")
    public void Admin_berhasil_ke_halaman_tambah_benefit(){
        ext.log(LogStatus.PASS, "Admin berhasil ke halaman tambah benefit");
        RegularPage.delayDuration(1);
        Assert.assertEquals(bp.result(RegularPage.textTambahBenefit),"Tambah Benefit");
    }


}
