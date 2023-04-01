package com.testing.magang.testpage;

/*
Ganti nama judul blog sebelum jalanin
Ganti nama judul blog setelah judul test sama
Ganti nama judul blog kurang dari
Ganti nama judul blog baru untuk total
 */
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.testing.magang.libtest.LibraryTest;
import com.testing.magang.pages.blog.BlogPage;
import com.testing.magang.utils.RegularPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.testing.magang.testpage.TestTambahTrainer.ap;

public class TestBlogModules {

    public static WebDriver driver;
    public static BlogPage bp;
    public static ExtentTest ext;

    public TestBlogModules() {
        driver = LibraryTest.driver;
        bp = new BlogPage();
        ext = LibraryTest.extentTest;
    }

    @Given("Admin klik tombol blog")
    public void Admin_klik_tombol_blog() {
        ext.log(LogStatus.PASS, "Admin klik tombol blog");
        bp.btnClick(RegularPage.tombolBlog);
    }

    @Given("Admin masukan value judul blog")
    public void admin_masukan_value_judul_blog() {
        ext.log(LogStatus.PASS, "Admin masukan value judul blog");
        bp.valueSendkey(RegularPage.isiJud, "Test666");
    }

    @Given("Admin pilih file dengan format gambar")
    public void admin_pilih_file_dengan_format_gambar() {
        ext.log(LogStatus.PASS, "Admin pilih file dengan format gambar");
        RegularPage.scrollElement(bp.textTambahBlog);
        bp.valueSendkey(RegularPage.isiFile, "F:\\Download\\pramuka.jpg");
        RegularPage.delayDuration(1);
    }
    @Given("Admin kembali ke page sebelumnya")
    public void admin_kembali_ke_page_sebelumnya() {
        ext.log(LogStatus.PASS, "Admin kembali ke page sebelumnya");
        driver.navigate().to("https://dev.ptdika.com/web_jc_v2/admin/blogs/add");
    }

    @And("Admin klik tombol tambah blog")
    public void admin_klik_tombol_tambah(){
        ext.log(LogStatus.PASS, "Admin klik tombol tambah blog");
        bp.btnClick(RegularPage.tombolTambah);
    }

    @Given("Admin pilih file selain format gambar")
    public void admin_pilih_file_selain_format_gambar() {
        ext.log(LogStatus.PASS, "Admin pilih file selain format gambar");
        RegularPage.scrollElement(bp.textTambahBlog);
        bp.valueSendkey(RegularPage.isiFile, "F:\\KKP.pdf");
    }

//    @And("Admin klik tombol simpan")
//    public void admin_klik_tombol_simpan_blog() {
//        ext.log(LogStatus.PASS, "Admin klik tombol simpan");
//        RegularPage.scrollPage("0", "700");
//        RegularPage.delayDuration(3);
//        bp.btnClick(RegularPage.tombolSimpan);
//    }

    @When("Admin pilih tipe list publish blog")
    public void publish_blog() {
        ext.log(LogStatus.PASS, "Admin pilih tipe list publish blog");
        bp.valueSendkey(RegularPage.publishBlog, "Active");
    }

    @When("Admin hapus value judul blog")
    public void hapus_judul() {
        ext.log(LogStatus.PASS, "Admin hapus value judul blog");
        bp.valueSendkey(RegularPage.isiJud, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiJud, Keys.DELETE + "");
    }

    @When("Admin masukan value content preview")
    public void isi_content_preview() {
        ext.log(LogStatus.PASS, "Admin masukan value content preview");
        bp.valueSendkey(RegularPage.isiPrev, Keys.CONTROL+"a");
        bp.valueSendkey(RegularPage.isiPrev, "Lagi magang nyoba");
    }

    @When("Admin masukan value content blog")
    public void isi_content_blog() {
        ext.log(LogStatus.PASS, "Admin masukan value content blog");
        bp.valueSendkey(RegularPage.isiCont, "Nyoba test wjc yaa");
    }

    @When("Admin masukan value judul blog kutip satu")
    public void kutip_satu() {
        ext.log(LogStatus.PASS, "Admin masukan value judul blog kutip satu");
        bp.valueSendkey(RegularPage.isiJud, Keys.CONTROL+"a");
        bp.valueSendkey(RegularPage.isiJud, "Nyoba kutip satu'''''''");
    }
    @When("Admin masukan value judul blog ganti")
    public void ganti_value() {
        ext.log(LogStatus.PASS, "Admin ganti value judul blog");
        bp.valueSendkey(RegularPage.isiJud, Keys.CONTROL+"a");
        bp.valueSendkey(RegularPage.isiJud, "Test6666 Nyoba");
    }

    @And("Admin pilih tipe list set to home")
    public void set_to_home() {
        ext.log(LogStatus.PASS, "Admin pilih tipe list set to home");
        bp.valueSendkey(RegularPage.selecthome, "Yes");
        RegularPage.scrollPage("0","300");
    }

    @And("Admin masukan value content")
    public void value_content() {
        ext.log(LogStatus.PASS, "Admin masukan value content");
        bp.valueSendkey(RegularPage.isiCont, "ini adalah contennt magang nyoba");
    }

    @And("Admin hapus value content preview")
    public void hapus_preview() {
        ext.log(LogStatus.PASS, "Admin masukan value content");
        bp.valueSendkey(RegularPage.isiPrev, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiPrev, Keys.DELETE + "");
        RegularPage.delayDuration(1);
    }

    @And("Admin hapus value content blog")
    public void hapus_blog() {
        ext.log(LogStatus.PASS, "Admin hapus value content preview");
        bp.valueSendkey(RegularPage.isiCont, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiCont, Keys.DELETE+"");
        RegularPage.delayDuration(1);
    }

    @And("Admin masukan value judul blog lebih dari")
    public void judul_lebih_dari() {
        ext.log(LogStatus.PASS, "Admin masukan value judul blog lebih dari");
        bp.valueSendkey(RegularPage.isiJud, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiJud, "Nyoba lebih dari >>>>>>");
    }

    @And("Admin masukan value content preview lebih dari")
    public void preview_lebih_dari() {
        ext.log(LogStatus.PASS, "Admin masukan value content preview lebih dari");
        bp.valueSendkey(RegularPage.isiPrev, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiPrev, "Nyoba Preview lebih dari >>>>>>");
    }

    @And("Admin masukan value content lebih dari")
    public void content_lebih_dari() {
        ext.log(LogStatus.PASS, "Admin masukan value content lebih dari");
        bp.valueSendkey(RegularPage.isiCont, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiCont, "Nyoba Content lebih dari >>>>>>");
    }

    @And("Admin masukan value content preview kutip satu")
    public void preview_kutip_satu() {
        ext.log(LogStatus.PASS, "Admin masukan value content kutip satu");
        bp.valueSendkey(RegularPage.isiPrev, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiPrev, "Nyoba preview kutip satu''''''''");
    }

    @And("Admin masukan value content kutip satu")
    public void content_kutip_satu() {
        ext.log(LogStatus.PASS, "Admin masukan value content kutip satu");
        bp.valueSendkey(RegularPage.isiCont, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiCont, "Nyoba content kutip satu''''''''");
    }

    @And("Admin masukan value judul blog kutip dua")
    public void judul_kutip_dua() {
        ext.log(LogStatus.PASS, "Admin masukan value judul blog kutip dua");
        bp.valueSendkey(RegularPage.isiJud, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiJud, "Nyoba kutip dua\"\"\"");
    }

    @And("Admin masukan value content preview kutip dua")
    public void preview_kutip_dua() {
        ext.log(LogStatus.PASS, "Admin masukan value content preview kutip dua");
        bp.valueSendkey(RegularPage.isiPrev, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiPrev, "Nyoba Preview kutip dua \"\"\"");
    }

    @And("Admin masukan value content kutip dua")
    public void content_kutip_dua() {
        ext.log(LogStatus.PASS, "Admin masukan value content lebih dari");
        bp.valueSendkey(RegularPage.isiCont, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiCont, "Nyoba Content kutip dua \"\"\"");
    }

    @And("Admin masukan value judul blog kurang dari")
    public void judul_kurang_dari() {
        ext.log(LogStatus.PASS, "Admin masukan value judul blog kurang dari");
        bp.valueSendkey(RegularPage.isiJud, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiJud, "Nyoba kurang_dari<<<<<<<<<<<<<<<<<");
    }

    @And("Admin masukan value content preview kurang dari")
    public void preview_kurang_dari() {
        ext.log(LogStatus.PASS, "Admin masukan value content preview kurang dari");
        bp.valueSendkey(RegularPage.isiPrev, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiPrev, "Nyoba Preview kurang dari<<<<");
    }

    @And("Admin masukan value content kurang dari")
    public void content_kurang_dari() {
        ext.log(LogStatus.PASS, "Admin masukan value content kurang dari");
        bp.valueSendkey(RegularPage.isiCont, Keys.CONTROL + "a");
        bp.valueSendkey(RegularPage.isiCont, "Nyoba Content kurang dari<<<<<");
    }
    @And("Admin masukan value judul blog baru")
    public void value_baru() {
        ext.log(LogStatus.PASS, "Admin masukan value judul blog baru");
        bp.valueSendkey(RegularPage.isiJud, Keys.CONTROL+"a");
        bp.valueSendkey(RegularPage.isiJud, "Test4445");
    }
    @And("Admin masukan value judul blog pada search")
    public void admin_masukan_value_judul_blog_pada_search() {
        ext.log(LogStatus.PASS, "Admin masukan value judul blog pada search");
        ap.valueSendkey(RegularPage.searchFeature, "Contoh menjadi SQA");
    }

    @Then("Admin get on page tambah blog")
    public void page_tambah_blog() {
        ext.log(LogStatus.PASS, "Admin get on page tambah blog");
        Assert.assertEquals(bp.result(RegularPage.tambahBlog),"Tambah Blog");
    }
    @Then("Admin get on attribute choose file")
    public void attribute_file() {
        ext.log(LogStatus.PASS, "Admin get on attribute choose file");
        Assert.assertEquals(bp.result(RegularPage.isiFile),"uploadedFile");
    }
    @Then("Menampilkan alert judul wajib diisi")
    public void judul_harap_isi() {
        ext.log(LogStatus.PASS, "Menampilkan alert judul wajib diisi");
        RegularPage.scrollElement(bp.textTambahBlog);
        Assert.assertEquals(bp.result(RegularPage.alertJudul),"Harap isi judul");
    }
    @Then("Menampilkan alert content preview wajib diisi")
    public void preview_harap_isi() {
        ext.log(LogStatus.PASS, "Menampilkan alert content preview wajib diisi");
        RegularPage.scrollElement(bp.textTambahBlog);
        Assert.assertEquals(bp.result(RegularPage.alertPrev),"Harap isi content perview");
    }
    @Then("Menampilkan alert content blog wajib diisi")
    public void content_harap_isi() {
        ext.log(LogStatus.PASS, "Menampilkan alert content blog wajib diisi");
        Assert.assertEquals(bp.result(RegularPage.berhasilSimpan),"Harap isi content blog");
//        try{
//            bp.alertIsiContent.isDisplayed();
//            System.out.println("Sesuai");
//            RegularPage.delayDuration(1);
//        }catch (Exception e){
//            System.out.println("Expect dan result tidak sesuai");
//        }

    }
    @Then("Menampilkan alert content blog wajib di isi")
    public void content_harap_di_isi() {
        ext.log(LogStatus.PASS, "Menampilkan alert content blog wajib di isi");
        RegularPage.scrollElement(bp.isiContent);
        Assert.assertEquals(bp.result(RegularPage.alertCont),"Harap isi content blog");
    }
    @Then("Menampilkan alert judul sudah terdaftar")
    public void judul_duplicate() {
        ext.log(LogStatus.PASS, "Menampilkan alert judul sudah terdaftar");
        Assert.assertEquals(bp.result(RegularPage.judulTerdaftar),"judul sudah terdaftar");
        RegularPage.delayDuration(1);
    }

    @Then("Menampilkan alert karakter tidak diizinkan")
    public void karakter_tidak_diizinkan() {
        ext.log(LogStatus.PASS, "Menampilkan alert karakter tidak diizinkan");
        RegularPage.scrollElement(bp.textTambahBlog);
        Assert.assertTrue(bp.result(RegularPage.labelKarakter).contains("Karakter (<|>|'|\")"));
    }
    @Then("Menampilkan allert karakter tidak diizinkan")
    public void karakter_tidak_diizinkan_fail() {
        ext.log(LogStatus.PASS, "Menampilkan allert karakter tidak diizinkan");
        RegularPage.scrollElement(bp.textTambahBlog);
        Assert.assertEquals(bp.result(RegularPage.berhasilSimpan),"Karakter (<|>|'|\") tidak diizinkan");
    }
    @Then("Admin get message berhasil")
    public void berhasil_simpan() {
        ext.log(LogStatus.PASS, "Admin get message berhasil");
        RegularPage.scrollElement(bp.textTambahBlog);
        Assert.assertEquals(bp.result(RegularPage.berhasilSimpan),"Data berhasil di tambah");
    }

    @Then("Menampilkan list blog")
    public void menampilkan_list_blog() {
        ext.log(LogStatus.PASS, "Menampilkan list blog");
        Assert.assertTrue(ap.result(RegularPage.listSearch).contains("Contoh menjadi SQA"));
        RegularPage.delayDuration(1);
    }



}
