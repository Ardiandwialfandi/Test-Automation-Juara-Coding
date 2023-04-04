package com.testing.magang.testpage.rincianbiaya;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.magang.libtest.LibraryTest;
import com.testing.magang.pages.benefit.BenefitPages;
import com.testing.magang.pages.rincianbiaya.RincianBiayaPages;
import com.testing.magang.utils.RegularPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class TestTambahBenefit {
    public static WebDriver driver;
    public static BenefitPages bp;
    public static ExtentTest ext;
    public static RincianBiayaPages rbp;


    public TestTambahBenefit() {
        driver = LibraryTest.driver;
        bp = new BenefitPages();
        ext = LibraryTest.extentTest;
        rbp = new RincianBiayaPages();
    }
    @When("Admin isi Judul 1")
    public void admin_isi_judul_1(){
        ext.log(LogStatus.PASS, "Admin isi Judul 1");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.Judul1, "<<");
    }
    @When("input judul 1")
    public void input_judul_1(){
        ext.log(LogStatus.PASS, "Admin isi judul 1");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.Judul1, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.Judul1, "123456");
    }

    @When("Admin isi Judul1")
    public  void admin_isi_judul1(){
        ext.log(LogStatus.PASS, "Admin isi Judul 1");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.Judul1, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.Judul1, ">>");
    }
    @When("Admin input Judul1")
    public void admin_input_judul1(){
        ext.log(LogStatus.PASS, "Admin input Judul1");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.Judul1, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.Judul1, "|\"|");
    }
    @When("Admin input Judul 1")
    public void admin_input_judul_1(){
        ext.log(LogStatus.PASS, "Admin input Judul 1");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.Judul1, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.Judul1, "|'|");
    }
    @When("input judul2")
    public void input_judul2() {
        ext.log(LogStatus.PASS, "input judul2");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.Judul2, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.Judul2, "Grup Diskusi");
    }
    @When("admin klik search")
    public void admin_klik_search() {
        ext.log(LogStatus.PASS, "admin klik search");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.searchBenefit, "Judul 1");
    }
    @And("input Deskripsi 1")
    public void input_deskripsi_1(){
        ext.log(LogStatus.PASS, "Admin input Deskripsi 1");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.deskripsi1, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.deskripsi1, "|'|");
    }
    @And("Admin input deskripsi 1")
    public void admin_input_deskripsi_1(){
        ext.log(LogStatus.PASS, "Admin input deskripsi 1");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.deskripsi1, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.deskripsi1, "12347");
        bp.valueSendkey(RegularPage.Judul2, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.Judul2, Keys.DELETE + "");
    }
    @And("Admin input deskripsi2")
    public void admin_input_deskripsi2(){
        ext.log(LogStatus.PASS, "Admin input deskripsi2");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.deskripsi2, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.deskripsi2, "Mendapatkan sarana diskusi");
    }
    @And("Admin input judul3")
    public void admin_input_judul3(){
        ext.log(LogStatus.PASS, "Admin input judul3");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.Judul3, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.Judul3, "Sarana Belajar");
    }
    @And("Admin input deskripsi3")
    public void admin_input_deskripsi3(){
        ext.log(LogStatus.PASS, "Admin input deskripsi3");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.deskripsi3, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.deskripsi3, "memudahkan siswa untuk belajar");
    }
    @And("Admin input judul4")
    public void admin_input_judul4(){
        ext.log(LogStatus.PASS, "Admin input judul4");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.Judul4, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.Judul4, "Kesempatan Bekerja");
    }
    @And("Admin input deskripsi4")
    public void admin_input_deskripsi4(){
        ext.log(LogStatus.PASS, "Admin input deskripsi4");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.deskripsi4, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.deskripsi4, "Peluang Bekerja");
    }
    @And("Admin pilih publish active")
    public void admin_pilih_publish_active(){
        ext.log(LogStatus.PASS, "Admin pilih publish active");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.pilihpublish, "Active");
    }
    @And("klik tombol simpan")
    public void klik_tombol_simpan(){
        ext.log(LogStatus.PASS, "klik tombol simpan");
        RegularPage.delayDuration(2);
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(2);
        bp.btnClick(RegularPage.buttonSimpan);
    }
    @And("klik simpan")
    public void klik_simpan(){
        ext.log(LogStatus.PASS, "klik simpan");
        RegularPage.delayDuration(1);
        RegularPage.scrollPage("0","1000");
        RegularPage.delayDuration(1);
        bp.btnClick(RegularPage.buttonSimpan);
    }
    @And("Admin klik simpan")
    public void admin_klik_tombol_simpan(){
        ext.log(LogStatus.PASS, "Admin klik simpan");
        RegularPage.delayDuration(1);
        RegularPage.scrollPage("0", "1000");
        RegularPage.delayDuration(2);
        bp.btnClick(RegularPage.buttonSimpan);
    }
    @And("Admin isi Deskripsi 1")
    public void admin_isi_deskripsi_1(){
        ext.log(LogStatus.PASS, "Admin isi Deskripsi 1");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.deskripsi1, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.deskripsi1, "<<");
    }
    @And("Admin input Deskripsi1")
    public  void admin_input_deskripsi1(){
        ext.log(LogStatus.PASS, "Admin input Deskripsi1");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.deskripsi1, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.deskripsi1, "|'|");
    }
    @And("Admin isi Deskripsi1")
    public  void admin_isi_deskripsi1(){
        ext.log(LogStatus.PASS, "Admin isi Deskripsi 1");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.deskripsi1, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.deskripsi1, ">>");
    }
    @And("Admin isi Deskripsi 2")
    public void admin_isi_deskripsi_2(){
        ext.log(LogStatus.PASS, "Admin isi Deskripsi 2");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.deskripsi2, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.deskripsi2, "<<");
    }
    @And("Admin isi Deskripsi 3")
    public void admin_isi_deskripsi_3(){
        ext.log(LogStatus.PASS, "Admin isi Deskripsi 3");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.deskripsi3, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.deskripsi3, "<<");
    }
    @And("Admin isi Deskripsi 4")
    public void admin_isi_deskripsi_4(){
        ext.log(LogStatus.PASS, "Admin isi Deskripsi 4");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.deskripsi4, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.deskripsi4, "<<");
    }
    @And("Admin isi Judul 2")
    public void admin_isi_judul_2(){
        ext.log(LogStatus.PASS, "Admin isi Judul 2");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.Judul2, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.Judul2, "<<");
    }
    @And("Admin isi Judul 3")
    public void admin_isi_judul_3(){
        ext.log(LogStatus.PASS, "Admin isi Judul 3");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.Judul3, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.Judul3, "<<");
    }
    @And("Admin isi Judul 4")
    public void admin_isi_judul_4(){
        ext.log(LogStatus.PASS, "Admin isi Judul 4");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.Judul4, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.Judul4, "<<");
    }
    @And("input value")
    public void input_value() {
    ext.log(LogStatus.PASS, "input value");
    RegularPage.delayDuration(1);
    bp.valueSendkey(RegularPage.Search, "Trainer Profesional");
    }
    @And("klik tombol search")
    public void klik_tombol_search() {
        ext.log(LogStatus.PASS, "klik tombol search");
        RegularPage.delayDuration(1);
        bp.btnClick(RegularPage.tombolSearch);
    }
    @And("Admin klik button simpan")
    public void admin_klik_button_simpan() {
        ext.log(LogStatus.PASS, "Admin klik button simpan");
        RegularPage.delayDuration(1);
        bp.btnClick(RegularPage.tombolSimpan);
    }
    @And("Admin klik button simpan edit")
    public void admin_klik_button_simpan_edit() {
        ext.log(LogStatus.PASS, "Admin klik button simpan edit");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.Judul1,Keys.ENTER+"");
    }
    @And("update judul 1")
    public void update_judul_1() {
        ext.log(LogStatus.PASS, "update judul 1");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.Judul1, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.Judul1, "Trainer Berpengalaman");
        RegularPage.scrollPage("0","1000");

    }
    @And("update deskripsi 1")
    public void update_deskripsi_1() {
        ext.log(LogStatus.PASS, "update deskripsi 1");
        RegularPage.delayDuration(1);
        bp.valueSendkey(RegularPage.deskripsi1, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.deskripsi1, "memiliki sertifikat BNSP");
    }
    @When("Admin klik tombol edit benefit")
    public void Admin_klik_tombol_edit_benefit() {
        ext.log(LogStatus.PASS, "Admin klik tombol edit benefit");
//        RegularPage.scrollElement(rbp.txtAksi);
        RegularPage.delayDuration(1);
        bp.btnClick(RegularPage.editBenefit);
    }
    @Then("Admin berhasil menampilkan value")
    public void admin_berhasil_menampilkan_value(){
        ext.log(LogStatus.PASS, "Admin berhasil menampilkan value");
        RegularPage.delayDuration(2);
        try {
            Assert.assertEquals(bp.result(RegularPage.textJudul1), "Judul 1");
        }catch (NoSuchElementException e){
            System.out.println("Elemen tidak ditemukan");
            Assert.fail();
        }

    }
   @Then("berhasil updated")
   public void berhasil_updated(){
       ext.log(LogStatus.PASS, "berhasil updated");
       RegularPage.delayDuration(2);
       Assert.assertEquals(bp.result(RegularPage.alertSukses), "Data berhasil di update");
   }

    @Then("Menampilkan label harap isi judul 1")
    public void menampilkan_label_harap_isi_judul_1(){
        ext.log(LogStatus.PASS, "Menampilkan label harap isi judul 1");
        RegularPage.delayDuration(2);
        Assert.assertEquals(bp.result(RegularPage.AlertJudul1), "Harap isi judul 1");
    }
    @Then("menampilkan label karakter tidak diijinkan")
    public void menampilkan_label_karakter_tidak_diijinkan(){
        ext.log(LogStatus.PASS, "menampilkan label karakter tidak diijinkan");
        RegularPage.delayDuration(1);
        Assert.assertEquals(bp.result(RegularPage.AlertKarakter), "Karakter (<|>|'|\") tidak diizinkan");
    }
    @Then("menampilkan label harap pilih publish")
    public void menampilkan_label_harap_pilih_publish(){
        ext.log(LogStatus.PASS, "menampilkan label harap pilih publish");
        RegularPage.delayDuration(1);
        Assert.assertEquals(bp.result(RegularPage.textTambahBenefit), "Harap pilih publish");
    }
    @Then("menampilkan label harap isi judul2")
    public void menampilkan_label_harap_isi_judul2(){
        ext.log(LogStatus.PASS, "menampilkan label harap isi judul2");
        RegularPage.delayDuration(2);
        RegularPage.scrollPage("0","10");
        Assert.assertEquals(bp.result(RegularPage.AlertJudul2), "Harap isi judul 2");
    }
    @Then("Admin berhasil tambah benefit")
    public void admin_berhasil_tambah_benefit(){
        ext.log(LogStatus.PASS, "Admin berhasil tambah benefit");
        RegularPage.delayDuration(2);
        Assert.assertEquals(bp.result(RegularPage.alertSukses), "Data berhasil di tambah");
    }

}
