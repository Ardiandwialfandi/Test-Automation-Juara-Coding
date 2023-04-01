package com.testing.magang.testpage;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.magang.libtest.LibraryTest;
import com.testing.magang.pages.about.AboutPage;
import com.testing.magang.utils.RegularPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTambahTrainer {
    public static WebDriver driver;
    public static AboutPage ap;
    public static ExtentTest ext;

    public TestTambahTrainer() {
        driver = LibraryTest.driver;
        ap = new AboutPage();
        ext = LibraryTest.extentTest;
    }

    @Given("Admin pilih file gambar")
    public void admin_pilih_file_gambar() {
        ext.log(LogStatus.PASS, "Admin pilih file gambar");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        RegularPage.delayDuration(1);
        ap.valueSendkey(RegularPage.isiFile, "E:\\Users\\Ardian\\Pictures\\wow.JPG");
    }

    @Given("Admin kembali ke halaman sebelumnya")
    public void admin_kembali_ke_halaman_sebelumnya() {
        ext.log(LogStatus.PASS, "Admin kembali ke halaman sebelumnya");
        driver.navigate().to("https://dev.ptdika.com/web_jc_v2/admin/about/add");
    }

    @Given("Admin pilih file selain gambar")
    public void admin_pilih_file_selain_gambar() {
        ext.log(LogStatus.PASS, "Admin pilih file selain gambar");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        ap.valueSendkey(RegularPage.isiFile, "F:\\Berkas Lamar kerja\\CV Ardian Dwi Alfandi.docx");
        RegularPage.delayDuration(1);
    }

    @Given("Menampilkan total sebelumnya")
    public void menampilkan_total_sebelumnya() {
        ext.log(LogStatus.PASS, "Menampilkan total sebelumnya");
        String before = ap.result(RegularPage.totalData);
        System.out.println(before);
        RegularPage.delayDuration(1);
    }
    @Given("Admin klik trainer")
    public void admin_klik_trainer() {
        ext.log(LogStatus.PASS, "Admin klik trainer");
        ap.btnClick(RegularPage.klikGambar);
    }


    @When("Admin masukan value nama trainer")
    public void admin_masukan_value_nama_trainer() {
        ext.log(LogStatus.PASS, "Admin masukan value nama trainer");
        ap.valueSendkey(RegularPage.isiNamaTrainer, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiNamaTrainer, "Ardian");
    }
    @When("Admin masukan value jabatan dengan spasi")
    public void admin_masukan_value_jabatan_dengan_spasi() {
        ext.log(LogStatus.PASS, "Admin masukan value jabatan dengan spasi");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        ap.valueSendkey(RegularPage.isiJabatan, " ");
    }

    @When("Admin masukan value jabatan")
    public void admin_masukan_value_jabatan() {
        ext.log(LogStatus.PASS, "Admin masukan value jabatan");
        ap.valueSendkey(RegularPage.isiJabatan, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiJabatan, "SQA");
    }

    @When("Admin masukan value isi profile")
    public void admin_masukan_value_isi_profile() {
        ext.log(LogStatus.PASS, "Admin masukan value isi profile");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        ap.valueSendkey(RegularPage.isiProfile, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiProfile, "Mantap");
    }

    @When("Admin masukan value isi profile dengan spasi")
    public void admin_masukan_value_isi_profile_dengan_spasi() {
        ext.log(LogStatus.PASS, "Admin masukan value isi profile dengan spasi");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        ap.valueSendkey(RegularPage.isiProfile, " ");
    }

    @When("Admin masukan value nama trainer dengan lebih dari")
    public void nama_lebih_dari() {
        ext.log(LogStatus.PASS, "Admin masukan value nama trainer dengan lebih dari");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        ap.valueSendkey(RegularPage.isiNamaTrainer, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiNamaTrainer, "Ardian>");
    }

    @When("Admin masukan value nama trainer dengan kutip satu")
    public void nama_kutip_satu() {
        ext.log(LogStatus.PASS, "Admin masukan value nama trainer dengan kutip satu");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        ap.valueSendkey(RegularPage.isiNamaTrainer, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiNamaTrainer, "Ardian'");
    }

    @When("Admin masukan value isi profile dengan kurang dari")
    public void profil_kurang_dari() {
        ext.log(LogStatus.PASS, "Admin masukan value jabatan dengan kurang dari");
        ap.valueSendkey(RegularPage.isiProfile, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiProfile, "Mantap<");
    }

    @When("Admin klik text box search")
    public void admin_klik_text_box_search() {
        ext.log(LogStatus.PASS, "Admin lik text box search");
        ap.btnClick(RegularPage.searchFeature);
    }
    @When("Admin ubah file selain gambar")
    public void admin_ubah_file_selain_gambar() {
        ext.log(LogStatus.PASS, "Admin ubah file selain gambar");
        ap.valueSendkey(RegularPage.isiFile,"F:\\Berkas Lamar kerja\\CV Ardian Dwi Alfandi.docx");
    }
    @When("Admin ubah file gambar")
    public void admin_ubah_file_gambar() {
        ext.log(LogStatus.PASS, "Admin ubah file gambar");
        ap.valueSendkey(RegularPage.fileEdit,"F:\\kkp.jpeg");
    }
    @When("Admin ubah file dengan selain gambar")
    public void admin_ubah_file_dengan_selain_gambar() {
        ext.log(LogStatus.PASS, "Admin ubah file dengan selain gambar");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.fileEdit,Keys.CONTROL+"a");
        ap.valueSendkey(RegularPage.fileEdit,"F:\\KKP.pdf");
    }
//    public void admin_masukan_value_nama_traine(){
//        ext.log(LogStatus.PASS,"");
//    }public void admin_masukan_value_nama_traine(){
//        ext.log(LogStatus.PASS,"");
//    }

    @And("Admin edit value nama trainer dengan lebih dari")
    public void admin_edit_value_nama_trainer_dengan_lebih_dari() {
        ext.log(LogStatus.PASS, "Admin edit value nama trainer dengan lebih dari");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editNama, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editNama, "Ardian>>");
    }
    @And("Admin edit value nama trainer")
    public void admin_edit_value_nama_trainer() {
        ext.log(LogStatus.PASS, "Admin edit value nama trainer");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editNama, Keys.CONTROL+"a");
        ap.valueSendkey(RegularPage.editNama, "Koswara SSS,s");
    }
    @And("Admin edit value jabatan")
    public void admin_edit_value_jabatan() {
        ext.log(LogStatus.PASS, "Admin edit value jabatan");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editjabat, Keys.CONTROL+"a");
        ap.valueSendkey(RegularPage.editjabat, "Trainer");
    } @And("Admin edit value isi profile")
    public void admin_edit_value_isi_profile() {
        ext.log(LogStatus.PASS, "Admin edit value isi profile");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editProfil, Keys.CONTROL+"a");
        ap.valueSendkey(RegularPage.editProfil, "Mantap");
    }
    @And("Admin edit value nama trainer dengan kutip satu")
    public void admin_edit_value_nama_trainer_dengan_kutip_satu() {
        ext.log(LogStatus.PASS, "Admin edit value nama trainer dengan kutip satu");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editNama, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editNama, "Ardian''''");
    }
    @And("Admin edit value nama trainer dengan kutip dua")
    public void admin_edit_value_nama_trainer_dengan_kutip_dua() {
        ext.log(LogStatus.PASS, "Admin edit value nama trainer dengan kutip dua");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editNama, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editNama, "Ardian\"\"\"");
    }
    @And("Admin edit value nama trainer dengan kurang dari")
    public void admin_edit_value_nama_trainer_dengan_kurang_dari() {
        ext.log(LogStatus.PASS, "Admin edit value nama trainer dengan kurang dari");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editNama, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editNama, "Ardian<<<<");
    }
    @And("Admin edit value jabatan dengan lebih dari")
    public void admin_edit_value_jabatan_dengan_lebih_dari() {
        ext.log(LogStatus.PASS, "Admin edit value jabatan dengan lebih dari");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editjabat, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editjabat, "Magang Nyoba>>");
    }
    @And("Admin edit value jabatan dengan kutip satu")
    public void admin_edit_value_jabatan_dengan_kutip_satu() {
        ext.log(LogStatus.PASS, "Admin edit value jabatan dengan kutip satu");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editjabat, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editjabat, "Magang Nyoba''''''");
    }
    @And("Admin edit value jabatan dengan kutip dua")
    public void admin_edit_value_jabatan_dengan_kutip_dua() {
        ext.log(LogStatus.PASS, "Admin edit value jabatan dengan kutip dua");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editjabat, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editjabat, "Magang Nyoba\"\"");
    }
    @And("Admin edit value jabatan dengan kurang dari")
    public void admin_edit_value_jabatan_dengan_kurang_dari() {
        ext.log(LogStatus.PASS, "Admin edit value jabatan dengan kurang dari");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editjabat, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editjabat, "Magang Nyoba<<<<");
    }
    @And("Admin edit value isi profile dengan lebih dari")
    public void admin_edit_value_isi_profile_dengan_lebih_dari() {
        ext.log(LogStatus.PASS, "Admin edit value isi profile dengan lebih dari");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editProfil, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editProfil, "Nyoba nge test>>");
    }
    @And("Admin edit value isi profile dengan kutip satu")
    public void admin_edit_value_isi_profile_dengan_kutip_satu() {
        ext.log(LogStatus.PASS, "Admin edit value isi profile dengan kutip satu");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editProfil, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editProfil, "Nyoba nge test''''''");
    }
    @And("Admin edit value isi profile dengan kutip dua")
    public void admin_edit_value_isi_profile_dengan_kutip_dua() {
        ext.log(LogStatus.PASS, "Admin edit value isi profile dengan kutip dua");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editProfil, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editProfil, "Nyoba nge test\"\"\"");
    }
    @And("Admin edit value isi profile dengan kurang dari")
    public void admin_edit_value_isi_profile_dengan_kurang_dari() {
        ext.log(LogStatus.PASS, "Admin edit value isi profile dengan kurang dari");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editProfil, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editProfil, "Nyoba nge test<<<<<");
    }

    @And("Admin klik tombol simpan")
    public void admin_klik_tombol_simpan() {
        ext.log(LogStatus.PASS, "Admin klik tombol simpan");
        RegularPage.scrollPage("0", "800");
        RegularPage.delayDuration(1);
        ap.btnClick(RegularPage.tombolSimpan);
    }
    @And("Admin simpan edit trainer")
    public void Admin_simpan_edit_trainer() {
        ext.log(LogStatus.PASS, "Admin klik tombol simpan");
        RegularPage.delayDuration(3);
        RegularPage.scrollPage("0","500");
        ap.valueSendkey(RegularPage.fileEdit,Keys.ENTER+"");
    }
    @And("Admin klik trainer ardian kurang dari")
    public void admin_klik_trainer_ardian_kurang_dari() {
        ext.log(LogStatus.PASS, "Admin klik trainer ardian kurang dari");
        ap.btnClick(RegularPage.klikImage);
    }

    @And("Admin pilih tipe list publish")
    public void admin_pilih_tipe_list_publish() {
        ext.log(LogStatus.PASS, "Admin pilih tipe list publish");
        ap.valueSendkey(RegularPage.pilihPublish, "No Active");
    }

    @And("Admin menghapus value nama trainer")
    public void admin_menghapus_value_nama_trainer() {
        ext.log(LogStatus.PASS, "Admin menghapus value nama trainer");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        ap.valueSendkey(RegularPage.isiNamaTrainer, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiNamaTrainer, Keys.DELETE + "");
    }
    @And("Admin edit hapus value nama trainer")
    public void admin_edit_hapus_value_nama_trainer() {
        ext.log(LogStatus.PASS, "Admin menghapus value nama trainer");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editNama, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editNama, Keys.DELETE + "");
    }
    @And("Admin edit hapus value jabatan")
    public void admin_edit_hapus_value_jabatan() {
        ext.log(LogStatus.PASS, "Admin menghapus value jabatan");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editjabat, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editjabat, Keys.DELETE + "");
    }
    @And("Admin edit hapus value isi profile")
    public void admin_edit_hapus_value_isi_profile() {
        ext.log(LogStatus.PASS, "Admin menghapus value isi profile");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editProfil, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.editProfil, Keys.DELETE + "");
    }

    @And("Admin masukan value nama trainer dengan spasi")
    public void admin_masukan_value_nama_trainer_dengan_spasi() {
        ext.log(LogStatus.PASS, "Admin masukan value nama trainer dengan spasi");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        ap.valueSendkey(RegularPage.isiNamaTrainer, " ");
    }
    @And("Admin edit value nama trainer dengan spasi")
    public void admin_edit_value_nama_trainer_dengan_spasi() {
        ext.log(LogStatus.PASS, "Admin edit value nama trainer dengan spasi");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editNama, "        ");
    }
    @And("Admin edit value jabatan dengan spasi")
    public void admin_edit_value_jabatan_dengan_spasi() {
        ext.log(LogStatus.PASS, "Admin edit value jabatan dengan spasi");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editjabat, "        ");
    }
    @And("Admin edit value isi profile dengan spasi")
    public void admin_edit_value_isi_profile_dengan_spasi() {
        ext.log(LogStatus.PASS, "Admin edit value isi profile dengan spasi");
        RegularPage.scrollElement(ap.editFile);
        ap.valueSendkey(RegularPage.editProfil, "        ");
    }

    @And("Admin menghapus value jabatan")
    public void admin_menghapus_value_jabatan() {
        ext.log(LogStatus.PASS, "Admin menghapus value jabatan");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        ap.valueSendkey(RegularPage.isiJabatan, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiJabatan, Keys.DELETE + "");
    }

    @And("Admin menghapus value isi profile")
    public void admin_menghapus_value_isi_profile() {
        ext.log(LogStatus.PASS, "Admin menghapus value isi profile");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        ap.valueSendkey(RegularPage.isiProfile, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiProfile, Keys.DELETE + "");
    }

    @And("Admin masukan value nama trainer dengan kutip dua")
    public void nama_kutip_dua() {
        ext.log(LogStatus.PASS, "Admin masukan value nama trainer dengan kutip dua");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        ap.valueSendkey(RegularPage.isiNamaTrainer, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiNamaTrainer, "Ardian\"");
    }

    @And("Admin masukan value jabatan dengan kutip dua")
    public void jabatan_kutip_dua() {
        ext.log(LogStatus.PASS, "Admin masukan value jabatan dengan kutip dua");
        ap.valueSendkey(RegularPage.isiJabatan, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiJabatan, "SQA\"");
    }

    @And("Admin masukan value isi profile dengan kutip dua")
    public void profil_kutip_dua() {
        ext.log(LogStatus.PASS, "Admin masukan value jabatan dengan kutip dua");
        ap.valueSendkey(RegularPage.isiProfile, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiProfile, "Mantap\"");
    }

    @And("Admin masukan value jabatan dengan lebih dari")
    public void jabatan_lebih_dari() {
        ext.log(LogStatus.PASS, "Admin masukan value jabatan dengan lebih dari");
        ap.valueSendkey(RegularPage.isiJabatan, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiJabatan, "SQA>");
    }

    @And("Admin masukan value isi profile dengan lebih dari")
    public void profil_lebih_dari() {
        ext.log(LogStatus.PASS, "Admin masukan value jabatan dengan lebih dari");
        ap.valueSendkey(RegularPage.isiProfile, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiProfile, "Mantap>");
    }

    @And("Admin masukan value jabatan dengan kutip satu")
    public void jabatan_kutip_satu() {
        ext.log(LogStatus.PASS, "Admin masukan value jabatan dengan kutip satu");
        ap.valueSendkey(RegularPage.isiJabatan, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiJabatan, "SQA'");
    }

    @And("Admin masukan value isi profile dengan kutip satu")
    public void profil_kutip_satu() {
        ext.log(LogStatus.PASS, "Admin masukan value jabatan dengan kutip satu");
        ap.valueSendkey(RegularPage.isiProfile, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiProfile, "Mantap'");
    }

    @And("Admin masukan value nama trainer dengan kurang dari")
    public void nama_kkurang_dari() {
        ext.log(LogStatus.PASS, "Admin masukan value nama trainer dengan kurang dari");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        ap.valueSendkey(RegularPage.isiNamaTrainer, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiNamaTrainer, "Ardian<");
    }

    @And("Admin masukan value jabatan dengan kurang dari")
    public void jabatan_kurang_dari() {
        ext.log(LogStatus.PASS, "Admin masukan value jabatan dengan kurang dari");
        ap.valueSendkey(RegularPage.isiJabatan, Keys.CONTROL + "a");
        ap.valueSendkey(RegularPage.isiJabatan, "SQA<");
    }

    @And("Admin masukan value nama trainer pada search")
    public void admin_masukan_value_nama_trainer_pada_search() {
        ext.log(LogStatus.PASS, "Admin masukan value nama trainer pada search");
        ap.valueSendkey(RegularPage.searchFeature, "Ardian");
    }

    @And("Admin klik enter pada keyboard")
    public void admin_klik_enter_pada_keyboard() {
        ext.log(LogStatus.PASS, "Admin klik enter pada keyboard");
        ap.valueSendkey(RegularPage.searchFeature, Keys.ENTER + "");
    }
    @And("Admin scroll to grid")
    public void admin_scroll_to_grid() {
        ext.log(LogStatus.PASS, "Admin scroll to grid");
        RegularPage.scrollPage("0","920");
        RegularPage.delayDuration(2);
    }
    @And("Klik grid ke tiga")
    public void klik_grid_ke_tiga() {
        ext.log(LogStatus.PASS, "Klik grid ke tiga");
        ap.btnClick(RegularPage.grid);
         }

    //        public void admin_masukan_value_nama_traine () {
//        ext.log(LogStatus.PASS,"");
//    }
    @Then("Admin kembali dan get atribute file")
    public void Admin_kembali_dan_get_atribute_file() {
        ext.log(LogStatus.PASS, "Admin kembali dan get atribute file");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        Assert.assertEquals(ap.result(RegularPage.isiFile), "uploadedFile");
        RegularPage.delayDuration(2);
    }

    @Then("Menampilkan alert nama trainer wajib diisi")
    public void menampilkan_alert_nama_trainer_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan alert nama trainer wajib diisi");
        RegularPage.delayDuration(2);
        RegularPage.scrollElement(ap.txtTambahTrainer);
        Assert.assertEquals(ap.result(RegularPage.namaWajibDiisi),"Nama Wajib diisi");
    }
    @Then("Menampilkan allert nama trainer wajib diisi")
    public void menampilkan_allert_nama_trainer_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan allert nama trainer wajib diisi");
        RegularPage.scrollElement(ap.textAlertIsiNama);
        Assert.assertEquals(ap.result(RegularPage.alertNamaWajib), "Nama Wajib diisi");
        RegularPage.delayDuration(1);
    }
    @Then("Menampilkan message nama trainer wajib diisi")
    public void menampilkan_message_nama_trainer_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan message nama trainer wajib diisi");
        RegularPage.delayDuration(2);
        RegularPage.scrollElement(ap.txtTambahTrainer);
        Assert.assertEquals(ap.result(RegularPage.isiNamaTrainer), "Nama Wajib diisi");
    }
    @Then("Menampilkan mesage nama trainer wajib diisi")
    public void menampilkan_mesage_nama_trainer_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan mesage nama trainer wajib diisi");
        RegularPage.scrollElement(ap.editNamaTrainer);
        Assert.assertEquals(ap.result(RegularPage.editNama), "Nama Wajib diisi");
        RegularPage.delayDuration(1);
    }

    @Then("Menampilkan alert jabatan wajib diisi")
    public void menampilkan_alert_jabatan_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan alert jabatan wajib diisi");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        Assert.assertEquals(ap.result(RegularPage.jabatanWajibDiisi), "Jabatan wajib diisi");
    }
    @Then("Menampilkan allert jabatan wajib diisi")
    public void menampilkan_allert_jabatan_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan allert jabatan wajib diisi");
        RegularPage.scrollElement(ap.textAlertIsiJabatan);
        Assert.assertEquals(ap.result(RegularPage.alertJabatanWajib), "Jabatan wajib diisi");
        RegularPage.delayDuration(1);
    }
    @Then("Menampilkan message jabatan wajib diisi")
    public void menampilkan_message_jabatan_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan message jabatan wajib diisi");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        Assert.assertEquals(ap.result(RegularPage.isiJabatan), "Jabatan wajib diisi");
    }
    @Then("Menampilkan mesage jabatan wajib diisi")
    public void menampilkan_mesage_jabatan_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan mesage jabatan wajib diisi");
        RegularPage.scrollElement(ap.editJabatan);
        Assert.assertEquals(ap.result(RegularPage.editjabat), "Jabatan wajib diisi");
        RegularPage.delayDuration(1);
    }

    @Then("Menampilkan alert isi profile wajib diisi")
    public void menampilkan_alert_isi_profile_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan alert isi profile wajib diisi");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        Assert.assertEquals(ap.result(RegularPage.profileWajibDiisi), "Profil wajib diisi");
    }
    @Then("Menampilkan allert isi profile wajib diisi")
    public void menampilkan_allert_isi_profile_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan allert isi profile wajib diisi");
        RegularPage.scrollElement(ap.textAlertIsiProfile);
        Assert.assertEquals(ap.result(RegularPage.alertProfilWajib), "Profil wajib diisi");
        RegularPage.delayDuration(1);
    }

    @Then("Menampilkan message isi profile wajib diisi")
    public void menampilkan_message_isi_profile_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan message isi profile wajib diisi");
        RegularPage.scrollElement(ap.txtTambahTrainer);
        Assert.assertEquals(ap.result(RegularPage.isiProfile), "Profil Wajib diisi");
    }
    @Then("Menampilkan mesage isi profile wajib diisi")
    public void menampilkan_mesage_isi_profile_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan mesage isi profile wajib diisi");
        Assert.assertEquals(ap.result(RegularPage.editProfil), "Profil Wajib diisi");
        RegularPage.delayDuration(1);
    }
    @Then("Menampilkan halaman image exception")
    public void menampilkan_halaman_image_exception() {
        ext.log(LogStatus.PASS, "Menampilkan halaman image exception");
        Assert.assertTrue(ap.result(RegularPage.imageException).contains("The supplied file is not a supported"));
        RegularPage.delayDuration(3);
    }@Then("Menampilkan halaman exception image")
    public void menampilkan_halaman_exception_image() {
        ext.log(LogStatus.PASS, "Menampilkan halaman exception image");
        Assert.assertTrue(ap.result(RegularPage.dataUpdate).contains("The supplied file is not a supported"));
        RegularPage.delayDuration(3);
    }

    @Then("Menampilkan label karakter tidak diizinkan")
    public void label_karakter_tidak_diizinkan() {
        ext.log(LogStatus.PASS, "Menampilkan label karakter tidak diizinkan");
        RegularPage.scrollElement(ap.textKarakter);
        Assert.assertTrue(ap.result(RegularPage.labelKarakter).contains("Karakter (<|>|'|\")"));
    }

    @Then("Menampilkan message karakter tidak diizinkan")
    public void message_karakter_tidak_diizinkan() {
        ext.log(LogStatus.PASS, "Menampilkan label karakter tidak diizinkan");
        Assert.assertTrue(ap.result(RegularPage.berhasilSimpan).contains("Karakter (<|>|'|\")"));
    }

    @Then("Data berhasil ditambah")
    public void data_berhasil_ditambah() {
        ext.log(LogStatus.PASS, "Data berhasil ditambah");
        RegularPage.scrollElement(ap.textBerhasil);
        Assert.assertEquals(ap.result(RegularPage.berhasilSimpan), "Data berhasil di tambah");
    }

    @Then("Total berhasil bertambah")
    public void total_berhasil_bertambah() {
        ext.log(LogStatus.PASS, "Total berhasil bertambahh");
        RegularPage.scrollElement(ap.search);
        String expect = ap.textTotal.getText();
        System.out.println(expect);
        Assert.assertEquals(ap.result(RegularPage.totalData), expect);
        RegularPage.delayDuration(1);
    }

    @Then("Menampilkan list nama trainer")
    public void menampilkan_list_nama_trainer() {
        ext.log(LogStatus.PASS, "Menampilkan list nama trainer");
        Assert.assertTrue(ap.result(RegularPage.listSearch).contains("Ardian"));
        RegularPage.delayDuration(1);
        RegularPage.scrollPage("0","300");
    }
    @Then("Menampilkan semua message wajib diisi")
    public void menampilkan_semua_message_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan semua message wajib diisi");
        Assert.assertEquals(ap.result(RegularPage.editNama), "Wajib diisi");
        RegularPage.delayDuration(1);
    }
    @Then("Menampilkan semua alert wajib diisi")
    public void menampilkan_semua_alert_wajib_diisi() {
        ext.log(LogStatus.PASS, "Menampilkan semua alert wajib diisi");
        RegularPage.scrollElement(ap.textAlertIsiNama);
        Assert.assertTrue(ap.result(RegularPage.alertProfilWajib).contains("wajib diisi"));
        RegularPage.delayDuration(1);
    }
    @Then("Admin mendapatkan alert berhasil update data")
    public void admin_mendapatkan_alert_berhasil_update_data() {
        ext.log(LogStatus.PASS, "Admin mendapatkan alert berhasil update data");
        Assert.assertEquals(ap.result(RegularPage.dataUpdate), "Data berhasil di update");
    }
    @Then("Menampilkan data list ke tiga")
    public void menampilkan_data_list_ke_tiga() {
        ext.log(LogStatus.PASS, "Menampilkan data list ke tiga");
        RegularPage.delayDuration(2);
        Assert.assertTrue(ap.result(RegularPage.listGrids).contains("Zanonim23"));
    }

//    public void admin_masukan_value_nama_traine(){
//        ext.log(LogStatus.PASS,"");
//    }public void admin_masukan_value_nama_traine(){
//        ext.log(LogStatus.PASS,"");
//    }public void admin_masukan_value_nama_traine(){
//        ext.log(LogStatus.PASS,"");
//    }public void admin_masukan_value_nama_traine(){
//        ext.log(LogStatus.PASS,"");
//    }
}


