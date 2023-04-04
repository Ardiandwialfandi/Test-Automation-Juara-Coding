package com.testing.magang.testpage.rincianbiaya;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.magang.libtest.LibraryTest;
import com.testing.magang.pages.rincianbiaya.RincianBiayaPages;
import com.testing.magang.utils.RegularPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTambahRincianBiaya {
    public static WebDriver driver;
    public static RincianBiayaPages rbp;
    public static ExtentTest ext;

    public TestTambahRincianBiaya() {
        driver = LibraryTest.driver;
        rbp = new RincianBiayaPages();
        ext = LibraryTest.extentTest;
    }
    @Given("klik tombol home")
    public void admin_klik_tombol_home() {
        ext.log(LogStatus.PASS, "Admin klik tombol home");
        RegularPage.delayDuration(1);
        rbp.btnClick(RegularPage.tombolMenuHome);
    }

    @When("Admin klik tombol tambah")
    public void admin_klik_tombol_tambah() {
        ext.log(LogStatus.PASS, "Admin klik tombol tambah");
        RegularPage.delayDuration(1);
        rbp.btnClick(RegularPage.tombolTambah);
    }

    @When("Admin pilih select name diskon")
    public void Admin_pilih_select_name_diskon() {
        ext.log(LogStatus.PASS, "Admin pilih select name diskon");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.pilihselectname, "Diskon%");
    }
    @When("Admin pilih select name harga normal")
    public void Admin_pilih_select_name_harga_normal() {
        ext.log(LogStatus.PASS, "Admin pilih select name harga normal");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.pilihselectname, "Harga-Normal");
    }
    @When("Admin pilih select name harga diskon")
    public void Admin_pilih_select_name_harga_diskon() {
        ext.log(LogStatus.PASS, "Admin pilih select name harga diskon");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.pilihselectname, "Harga-Diskon");
    }

    @When("Admin menambahkan rincian biaya")
    public void admin_menambahkan_rincian_biaya() {
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Admin menambahkan rincian biaya");
    }
    @When("Admin pilih select name")
    public void Admin_pilih_select_name() {
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Admin pilih select name");
        rbp.valueSendkey(RegularPage.pilihselectname, "nama program");
    }
    @When("Admin isi Keunggulan 2")
    public void Admin_isi_Keunggulan_2() {
        RegularPage.delayDuration(1);
        ext.log(LogStatus.PASS, "Admin isi Keunggulan 2");
        rbp.valueSendkey(RegularPage.isikeunggulan2, "Sertifikasi");
    }
    @When("Admin isi nama program")
    public void Admin_isi_nama_program() {
        ext.log(LogStatus.PASS, "Admin isi nama program");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.inputnamaProgram,"Test");
    }
    @When("Admin input harga normal")
    public void admin_input_harga_normal() {
        ext.log(LogStatus.PASS, "admin input harga normal");
        RegularPage.scrollPage("0", "900");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.inputHarga,"14500000");
    }
    @When("Admin isi keunggulan 1")
    public void admin_isi_keunggulan_1() {
        ext.log(LogStatus.PASS, "Admin isi keunggulan 1");
        RegularPage.scrollPage("0", "900");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.isikeunggulan1, "Trainer Profesional");
    }
    @When("Admin isi Keunggulan 3")
    public void admin_isi_keunggulan_3() {
        ext.log(LogStatus.PASS, "Admin isi keunggulan 3");
        RegularPage.scrollPage("0", "900");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.isikeunggulan3, "Silabus");
    }
    @When("Admin isi Keunggulan 4")
    public void admin_isi_keunggulan_4() {
        ext.log(LogStatus.PASS, "Admin isi keunggulan 4");
        RegularPage.scrollPage("0", "900");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.isikeunggulan4, "Trainer Profesional");
    }
    @When("Admin isi Keunggulan 5 dengan angka")
    public void admin_isi_keunggulan_5_dengan_angka() {
        ext.log(LogStatus.PASS, "Admin isi keunggulan 5");
        RegularPage.scrollPage("0", "900");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.isikeuntungan5, "12345");
    }

    @And("Admin klik tombol simpan")
    public void admin_klik_tombol_simpan() {
        ext.log(LogStatus.PASS, "Admin klik tombol simpan");
        RegularPage.scrollPage("0", "1000");
        RegularPage.delayDuration(2);
        rbp.btnClick(RegularPage.tombolSimpan);
        RegularPage.delayDuration(2);
    }
    @And("Admin isi nama program menggunakan karakter")
    public void Admin_isi_nama_program_menggunakan_karakter() {
        ext.log(LogStatus.PASS, "Admin isi nama program menggunakan karakter");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.inputnamaProgram,"@<<!");
    }


    @And("Admin menambahkan harga program")
    public void admin_menambahkan_harga_program() {
        ext.log(LogStatus.PASS, "Admin menambahkan harga program");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.inputHarga,"155000");
    }
    @And("Admin isi diskon")
    public void admin_isi_diskon() {
        ext.log(LogStatus.PASS, "Admin isi diskon");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.inputDiskon,"10");
    }
    @And("Admin isi keunggulan 1 menggunakan karakter")
    public void admin_isi_keunggulan_1_menggunakan_karakter() {
        ext.log(LogStatus.PASS, "Admin isi keunggulan 1 menggunakan karakter");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.isikeunggulan1, "@<<!");
    }
    @And("Admin isi keunggulan 2 menggunakan karakter")
    public void admin_isi_keunggulan_2_menggunakan_karakter() {
        ext.log(LogStatus.PASS, "Admin isi keunggulan 2 menggunakan karakter");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.isikeunggulan2, "@<<!");
    }
    @And("Admin isi keunggulan 3 menggunakan karakter")
    public void admin_isi_keunggulan_3_menggunakan_karakter() {
        ext.log(LogStatus.PASS, "Admin isi keunggulan 3 menggunakan karakter");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.isikeunggulan3, "@<<!");
    }
    @And("Admin isi keunggulan 4 menggunakan karakter")
    public void admin_isi_keunggulan_4_menggunakan_karakter() {
        ext.log(LogStatus.PASS, "Admin isi keunggulan 4 menggunakan karakter");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.isikeunggulan4, "@<<!");
    }
    @And("Admin isi keunggulan 5 menggunakan karakter")
    public void admin_isi_keunggulan_5_menggunakan_karakter() {
        ext.log(LogStatus.PASS, "Admin isi keunggulan 4 menggunakan karakter");
        RegularPage.scrollPage("0", "100");
        RegularPage.delayDuration(1);
        rbp.valueSendkey(RegularPage.isikeuntungan5, "@<<!");
    }


    @And("Admin pilih publish")
    public void Admin_pilih_publish() {
        ext.log(LogStatus.PASS, "Admin pilih publish");
        RegularPage.delayDuration(3);
        rbp.valueSendkey(RegularPage.pilihPublish, "inActive");
    }
    @And("Admin klik tombol edit")
    public void Admin_klik_tombol_edit() {
        ext.log(LogStatus.PASS, "Admin klik tombol edit");
//        RegularPage.scrollElement(rbp.txtAksi);
        RegularPage.delayDuration(1);
        rbp.btnClick(RegularPage.tombolEdit);
    }
    @And("masukan value kelas karyawan pada search")
    public void masukan_value_kelas_karyawan_pada_search() {
        ext.log(LogStatus.PASS, "masukan value kelas karyawan pada search");
        rbp.valueSendkey(RegularPage.Search, "Kelas Karyawan");
    }
    @And("masukan value 10 pada search")
    public void masukan_value_10_pada_search() {
        ext.log(LogStatus.PASS, "masukan value 10 pada search");
        RegularPage.delayDuration(3);
        rbp.valueSendkey(RegularPage.Search, Keys.CONTROL + "a");
        rbp.valueSendkey(RegularPage.Search, "10");
    }
    @And("masukan value 10000000 pada search")
    public void masukan_value_10000000_pada_search() {
        ext.log(LogStatus.PASS, "masukan value 10000000 pada search");
        RegularPage.delayDuration(3);
        rbp.valueSendkey(RegularPage.Search, Keys.CONTROL + "a");
        rbp.valueSendkey(RegularPage.Search, "10000000");
    }
    @And("masukan value 13500000 pada search")
    public void masukan_value_13500000_pada_search() {
        ext.log(LogStatus.PASS, "masukan value 13500000 pada search");
        RegularPage.delayDuration(3);
        rbp.valueSendkey(RegularPage.Search, Keys.CONTROL + "a");
        rbp.valueSendkey(RegularPage.Search, "13500000");
    }
    @And("Admin klik tombol search")
    public void Admin_klik_tombol_search() {
        ext.log(LogStatus.PASS, "Admin klik tombol search");
        RegularPage.delayDuration(3);
        rbp.btnClick(RegularPage.tombolSearch);
    }
    @And("Admin input nama program")
    public void Admin_input_nama_program() {
        ext.log(LogStatus.PASS, "Admin input nama program");
        RegularPage.delayDuration(3);
        rbp.valueSendkey(RegularPage.inputnamaProgram, "SQA RPA");
    }
    @And("Admin input jumlah diskon")
    public void Admin_input_jumlah_diskon() {
        ext.log(LogStatus.PASS, "Admin input jumlah diskon");
        RegularPage.delayDuration(3);
        rbp.valueSendkey(RegularPage.inputDiskon, "15");
    }
    @And("Admin input keunggulan 1")
    public void Admin_input_keunggulan_1() {
        ext.log(LogStatus.PASS, "Admin input keunggulan 1");
        RegularPage.delayDuration(3);
        rbp.valueSendkey(RegularPage.isikeunggulan1, "Trainer Profesional");
    }
    @Then("Admin berhasil menampilkan nama program")
    public void Admin_berhasil_menampilkan_nama_program() {
        ext.log(LogStatus.PASS, "Admin berhasil menampilkan nama program");
        RegularPage.delayDuration(1);
        Assert.assertEquals(rbp.result(RegularPage.txtSearchnama), "Kelas Karyawan");
    }
    @Then("Admin berhasil menampilkan harga normal")
    public void Admin_berhasil_menampilkan_harga_normal() {
        ext.log(LogStatus.PASS, "Admin berhasil menampilkan harga normal");
        RegularPage.delayDuration(1);
        Assert.assertTrue(rbp.result(RegularPage.sepuluhjuta).contains( "Rp 10.000.000"));
    }
    @Then("Admin berhasil menampilkan harga diskon")
    public void Admin_berhasil_menampilkan_hsrga_diskon() {
        ext.log(LogStatus.PASS, "Admin berhasil menampilkan harga diskon");
        RegularPage.delayDuration(1);
        Assert.assertEquals(rbp.result(RegularPage.tigabelasjuta), "Rp 13.500.000");
    }
    @Then("Admin berhasil menampilkan diskon")
    public void Admin_berhasil_menampilkan_diskon() {
        ext.log(LogStatus.PASS, "Admin berhasil menampilkan diskon");
        RegularPage.delayDuration(1);
        Assert.assertEquals(rbp.result(RegularPage.diskonpersen), "10%");
    }
    @Then("Menampilkan label harap isi keunggulan program")
    public void Menampilkan_label_harap_isi_keunggulan_program() {
        ext.log(LogStatus.PASS, "Admin kembali ke halaman tambah rincian biaya");
        RegularPage.scrollElement(rbp.txtTambahRincianBiaya);
        RegularPage.delayDuration(1);
        Assert.assertEquals(rbp.result(RegularPage.keunggulan1WajibDiisi), "Harap isi keunggulan program");
    }
    @Then("Menampilkan label harap isi nama program")
    public void Menampilkan_label_harap_isi_nama_program() {
        ext.log(LogStatus.PASS, "Admin kembali ke halaman tambah rincian biaya");
        RegularPage.scrollElement(rbp.txtTambahRincianBiaya);
        RegularPage.delayDuration(1);
        Assert.assertEquals(rbp.result(RegularPage.namaProgramWajibDiisi), "Harap isi nama program");
    }
    @Then("Menampilkan label harap isi harga program")
    public void menampilkan_label_harap_isi_harga_program() {
        ext.log(LogStatus.PASS, "Admin kembali ke halaman tambah rincian biaya");
        RegularPage.delayDuration(3);
        RegularPage.scrollElement(rbp.txtTambahRincianBiaya);
        Assert.assertEquals(rbp.result(RegularPage.hargaProgramWajibDiisi), "Harap isi harga program");
    }
    @Then("Menampilkan label harap pilih publish")
    public void menampilkan_label_harap_pilih_publish() {
        ext.log(LogStatus.PASS, "Menampilkan label harap pilih publish");
        RegularPage.delayDuration(3);
        RegularPage.scrollElement(rbp.txtTambahRincianBiaya);
        Assert.assertEquals(rbp.result(RegularPage.textTambahRincianBiaya), "Harap pilih publish");
    }
    @Then("Admin berhasil menambahkan Rincian Biaya")
    public void Admin_berhasil_menambahkan_Rincian_Biaya() {
        ext.log(LogStatus.PASS, "Admin berhasil menambahkan Rincian Biaya");
        RegularPage.delayDuration(3);
        RegularPage.scrollElement(rbp.txtTambahRincianBiaya);
        Assert.assertEquals(rbp.result(RegularPage.textBerhasilDitambah), "Data berhasil di tambah");
    }
    @Then("Admin berhasil menampilkan halaman edit")
    public void Admin_berhasil_menampilkan_halaman_edit() {
        ext.log(LogStatus.PASS, "Admin berhasil menampilkan halaman edit");
        RegularPage.delayDuration(3);
        RegularPage.scrollElement(rbp.txtTambahRincianBiaya);
        Assert.assertEquals(rbp.result(RegularPage.TextEditRincianBiaya), "edit rincian biaya");
    }
    @Then("Admin berhasil update data")
    public void Admin_berhasil_update_data() {
        ext.log(LogStatus.PASS, "Admin berhasil update data");
        RegularPage.delayDuration(3);
        RegularPage.scrollElement(rbp.textberhasilupdate);
        Assert.assertEquals(rbp.result(RegularPage.berhasilUpdate), "Data berhasil di update");
    }
}



