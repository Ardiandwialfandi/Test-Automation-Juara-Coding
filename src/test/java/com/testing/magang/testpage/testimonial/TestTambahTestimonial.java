package com.testing.magang.testpage.testimonial;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.magang.libtest.LibraryTest;
import com.testing.magang.utils.RegularPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TestTambahTestimonial {
    public static WebDriver driver;
    public static TestimonialPage tp;
    public static ExtentTest ext;

    public TestTambahTestimonial() {
        driver = LibraryTest.driver;
        tp = new TestimonialPage();
        ext = LibraryTest.extentTest;
    }

    @When("Admin masukan value nama peserta")
    public void admin_masukan_value_nama_peserta() {
        ext.log(LogStatus.PASS, "Admin masukan value nama peserta");
        tp.valueSendkey(RegularPage.isiNamaPeserta, Keys.CONTROL + "a");
        tp.valueSendkey(RegularPage.isiNamaPeserta, "Didi");
    }

//    @When("Admin pilih file gambar")
//    public void admin_pilih_file_gambar() {
//        ext.log(LogStatus.PASS, "Admin pilih file gambar");
//        RegularPage.scrollElement(ap.txtTambahPeserta);
//        RegularPage.delayDuration(1);
//        ap.valueSendkey(RegularPage.isiFile, "E:\\Users\\Ardian\\Pictures\\wow.JPG");
//    }
//
//    @When("Admin pilih file selain gambar")
//    public void admin_pilih_file_selain_gambar(){
//        ext.log(LogStatus.PASS,"Admin pilih file selain gambar");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        ap.valueSendkey(RegularPage.isiFile,"F:\\Berkas Lamar kerja\\CV Ardian Dwi Alfandi.docx");
//    }
//    @When("Admin kembali ke halaman sebelumnya")
//    public void admin_kembali_ke_halaman_sebelumnya(){
//        ext.log(LogStatus.PASS,"Admin kembali ke halaman sebelumnya");
//        driver.navigate().to("https://dev.ptdika.com/web_jc_v2/admin/about/add");
//    }
////    public void admin_masukan_value_nama_traine(){
////        ext.log(LogStatus.PASS,"");
////    }public void admin_masukan_value_nama_traine(){
////        ext.log(LogStatus.PASS,"");
////    }
//
//    @And("Admin klik tombol simpan")
//    public void admin_klik_tombol_simpan() {
//        ext.log(LogStatus.PASS, "Admin klik tombol simpan");
//        RegularPage.scrollPage("0", "600");
//        RegularPage.delayDuration(3);
//        ap.btnClick(RegularPage.tombolSimpan);
//    }
//
//    @And("Admin masukan value jabatan")
//    public void admin_masukan_value_jabatan() {
//        ext.log(LogStatus.PASS, "Admin masukan value jabatan");
//        ap.valueSendkey(RegularPage.isiJabatan, Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiJabatan, "SQA");
//    }
//
//    @And("Admin masukan value isi profile")
//    public void admin_masukan_value_isi_profile() {
//        ext.log(LogStatus.PASS, "Admin masukan value isi profile");
//        ap.valueSendkey(RegularPage.isiProfile, Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiProfile, "Mantap");
//    }
//
//    @And("Admin pilih tipe list publish")
//    public void admin_pilih_tipe_list_publish() {
//        ext.log(LogStatus.PASS, "Admin pilih tipe list publish");
//        ap.valueSendkey(RegularPage.pilihPublish, "No Active");
//    }
//
//    @And("Admin menghapus value nama trainer")
//    public void admin_menghapus_value_nama_trainer() {
//        ext.log(LogStatus.PASS, "Admin menghapus value nama trainer");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        ap.valueSendkey(RegularPage.isiNamaTrainer, Keys.CONTROL + "a");
//        ap.valueSendkey(RegularPage.isiNamaTrainer, Keys.DELETE + "");
//    }
//
//    @And("Admin masukan value nama trainer dengan spasi")
//    public void admin_masukan_value_nama_trainer_dengan_spasi() {
//        ext.log(LogStatus.PASS, "Admin masukan value nama trainer dengan spasi");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        ap.valueSendkey(RegularPage.isiNamaTrainer, " ");
//    }
//
//    @And("Admin menghapus value jabatan")
//    public void admin_menghapus_value_jabatan() {
//        ext.log(LogStatus.PASS, "Admin menghapus value jabatan");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        ap.valueSendkey(RegularPage.isiJabatan, Keys.CONTROL + "a");
//        ap.valueSendkey(RegularPage.isiJabatan, Keys.DELETE + "");
//    }
//
//    @And("Admin masukan value jabatan dengan spasi")
//    public void admin_masukan_value_jabatan_dengan_spasi() {
//        ext.log(LogStatus.PASS, "Admin masukan value jabatan dengan spasi");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        ap.valueSendkey(RegularPage.isiJabatan, " ");
//    }
//
//    @And("Admin menghapus value isi profile")
//        public void admin_menghapus_value_isi_profile() {
//        ext.log(LogStatus.PASS, "Admin menghapus value isi profile");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        ap.valueSendkey(RegularPage.isiProfile,Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiProfile,Keys.DELETE+"");
//    }
//
//    @And("Admin masukan value isi profile dengan spasi")
//    public void admin_masukan_value_isi_profile_dengan_spasi() {
//        ext.log(LogStatus.PASS,"Admin masukan value isi profile dengan spasi");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        ap.valueSendkey(RegularPage.isiProfile," ");
//    }
//    @And("Admin masukan value nama trainer dengan kutip dua")
//    public void nama_kutip_dua() {
//        ext.log(LogStatus.PASS,"Admin masukan value nama trainer dengan kutip dua");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        ap.valueSendkey(RegularPage.isiNamaTrainer,Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiNamaTrainer,"Ardian\"");
//    }
//    @And("Admin masukan value jabatan dengan kutip dua")
//    public void jabatan_kutip_dua() {
//        ext.log(LogStatus.PASS,"Admin masukan value jabatan dengan kutip dua");
//        ap.valueSendkey(RegularPage.isiJabatan,Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiJabatan,"SQA\"");
//    }
//    @And("Admin masukan value isi profile dengan kutip dua")
//    public void profil_kutip_dua() {
//        ext.log(LogStatus.PASS,"Admin masukan value jabatan dengan kutip dua");
//        ap.valueSendkey(RegularPage.isiProfile,Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiProfile,"Mantap\"");
//    }
//    @And("Admin masukan value nama trainer dengan lebih dari")
//    public void nama_lebih_dari() {
//        ext.log(LogStatus.PASS,"Admin masukan value nama trainer dengan lebih dari");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        ap.valueSendkey(RegularPage.isiNamaTrainer,Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiNamaTrainer,"Ardian>");
//    }
//    @And("Admin masukan value jabatan dengan lebih dari")
//    public void jabatan_lebih_dari() {
//        ext.log(LogStatus.PASS,"Admin masukan value jabatan dengan lebih dari");
//        ap.valueSendkey(RegularPage.isiJabatan,Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiJabatan,"SQA>");
//    }
//    @And("Admin masukan value isi profile dengan lebih dari")
//    public void profil_lebih_dari() {
//        ext.log(LogStatus.PASS,"Admin masukan value jabatan dengan lebih dari");
//        ap.valueSendkey(RegularPage.isiProfile,Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiProfile,"Mantap>");
//    }
//    @And("Admin masukan value nama trainer dengan kutip satu")
//    public void nama_kutip_satu() {
//        ext.log(LogStatus.PASS,"Admin masukan value nama trainer dengan kutip satu");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        ap.valueSendkey(RegularPage.isiNamaTrainer,Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiNamaTrainer,"Ardian'");
//    }
//    @And("Admin masukan value jabatan dengan kutip satu")
//    public void jabatan_kutip_satu() {
//        ext.log(LogStatus.PASS,"Admin masukan value jabatan dengan kutip satu");
//        ap.valueSendkey(RegularPage.isiJabatan,Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiJabatan,"SQA'");
//    }
//    @And("Admin masukan value isi profile dengan kutip satu")
//    public void profil_kutip_satu() {
//        ext.log(LogStatus.PASS,"Admin masukan value jabatan dengan kutip satu");
//        ap.valueSendkey(RegularPage.isiProfile,Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiProfile,"Mantap'");
//    }
//    @And("Admin masukan value nama trainer dengan kurang dari")
//    public void nama_kkurang_dari() {
//        ext.log(LogStatus.PASS,"Admin masukan value nama trainer dengan kurang dari");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        ap.valueSendkey(RegularPage.isiNamaTrainer,Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiNamaTrainer,"Ardian<");
//    }
//    @And("Admin masukan value jabatan dengan kurang dari")
//    public void jabatan_kurang_dari() {
//        ext.log(LogStatus.PASS,"Admin masukan value jabatan dengan kurang dari");
//        ap.valueSendkey(RegularPage.isiJabatan,Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiJabatan,"SQA<");
//    }
//    @And("Admin masukan value isi profile dengan kurang dari")
//    public void profil_kurang_dari() {
//        ext.log(LogStatus.PASS,"Admin masukan value jabatan dengan kurang dari");
//        ap.valueSendkey(RegularPage.isiProfile,Keys.CONTROL+"a");
//        ap.valueSendkey(RegularPage.isiProfile,"Mantap<");
//    }
////        public void admin_masukan_value_nama_traine () {
////        ext.log(LogStatus.PASS,"");
////    }
//    @Then("Admin kembali dan get atribute file")
//    public void Admin_kembali_dan_get_atribute_file() {
//        ext.log(LogStatus.PASS, "Admin kembali dan get atribute file");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        Assert.assertEquals(ap.result(RegularPage.isiFile), "uploadedFile");
//        RegularPage.delayDuration(2);
//    }
//
//    @Then("Menampilkan alert nama trainer wajib diisi")
//    public void menampilkan_alert_nama_trainer_wajib_diisi() {
//        ext.log(LogStatus.PASS, "Menampilkan alert nama trainer wajib diisi");
//        RegularPage.delayDuration(2);
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        Assert.assertEquals(ap.result(RegularPage.namaWajibDiisi), "Nama Wajib diisi");
//    }
//
//    @Then("Menampilkan alert jabatan wajib diisi")
//    public void menampilkan_alert_jabatan_wajib_diisi() {
//        ext.log(LogStatus.PASS, "Menampilkan alert jabatan wajib diisi");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        Assert.assertEquals(ap.result(RegularPage.jabatanWajibDiisi),"Jabatan wajib diisi");
//    }
//    @Then("Menampilkan alert isi profile wajib diisi")
//    public void menampilkan_alert_isi_profile_wajib_diisi() {
//        ext.log(LogStatus.PASS, "Menampilkan alert isi profile wajib diisi");
//        RegularPage.scrollElement(ap.txtTambahTrainer);
//        Assert.assertEquals(ap.result(RegularPage.profileWajibDiisi),"Profil wajib diisi");
//    }
//    @Then("Menampilkan halaman image exception")
//    public void menampilkan_halaman_image_exception() {
//        ext.log(LogStatus.PASS, "Menampilkan alert isi profile wajib diisi");
//        Assert.assertTrue(ap.result(RegularPage.imageException).contains("The supplied file is not a supported"));
//        RegularPage.delayDuration(3);
//    }
//    @Then("Menampilkan label karakter tidak diizinkan")
//    public void label_karakter_tidak_diizinkan() {
//        ext.log(LogStatus.PASS, "Menampilkan label karakter tidak diizinkan");
//            RegularPage.scrollElement(ap.textKarakter);
//            Assert.assertTrue(ap.result(RegularPage.labelKarakter).contains("Karakter (<|>|'|\")"));
//    }
////    public void admin_masukan_value_nama_traine(){
////        ext.log(LogStatus.PASS,"");
////    }public void admin_masukan_value_nama_traine(){
////        ext.log(LogStatus.PASS,"");
////    }public void admin_masukan_value_nama_traine(){
////        ext.log(LogStatus.PASS,"");
////    }public void admin_masukan_value_nama_traine(){
////        ext.log(LogStatus.PASS,"");
////    }
//}
//
//
