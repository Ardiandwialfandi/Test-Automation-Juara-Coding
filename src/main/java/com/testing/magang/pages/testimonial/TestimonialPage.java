package com.testing.magang.pages.testimonial;

import com.testing.magang.drivers.DriverSingleton;
import com.testing.magang.utils.RegularPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestimonialPage {
    public static WebDriver driver;
    public TestimonialPage (){
    driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
}

    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement btn_home;
    @FindBy(xpath = "//a[normalize-space()='Testimonial']")
    WebElement btnTestimonial;
    @FindBy(xpath = "//a[normalize-space()='Tambahh']")
    WebElement btnTambah;
    @FindBy(xpath = "//input[@name='uploadedFile']")
    WebElement btnUploadFile;
    @FindBy(xpath = "//input[@placeholder='Nama Peserta']")
    WebElement namaPeserta;
    @FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
    WebElement fieldPublish;
    @FindBy(xpath = "//textarea[@name='body']")
    public WebElement isiTestimonial;
    @FindBy(xpath = "//select[@id='rating']")
    WebElement rating;
    @FindBy(xpath = "//input[@name='mysubmit']")
    WebElement simpan;
    @FindBy(xpath = "//input[@placeholder='Search Nama Peserta']")
    WebElement search_peserta;
    @FindBy(css = "//a[normalize-space()='1']")
    WebElement btnPage1;
    @FindBy(xpath = "//figure[4]//a[1]//img[1]")
    WebElement datapeserta;
    @FindBy(xpath = "//input[@value='Pilih Gambar Ulang']")
    public WebElement editpilihgambarulang;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement editwajibisinama;
    @FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
    WebElement editpublish;
    @FindBy(xpath = "//textarea[@id='summernote']")
    WebElement edittestimonialwajibpage;
    @FindBy(xpath = "//select[@id='rating']")
    public WebElement editRating;
    @FindBy(xpath = "//input[@name='mysubmit']")
    public WebElement editSimpan;
    @FindBy(xpath = "//input[@id='username']")
    WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    WebElement pass;
    @FindBy(xpath = "//button[normalize-space()='Sign-In']")
    WebElement btnSignin;


    public void login() {
        email.sendKeys("ucen1315@gmail.com");
        pass.sendKeys("a");
        btnSignin.click();
    }

    public void btnClick(String click) {
        switch (click) {
            case RegularPage.tombolTestimonial -> btnTestimonial.click();
            case RegularPage.tombolTambah-> btnTambah.click();
            case RegularPage.tombolSimpan -> simpan.click();
        }
    }

    public void valueSendkey(String element, String value){
        switch (element){
//            case RegularPage. -> btnUploadFile.sendKeys(value);
            case RegularPage.isiNamaPeserta -> namaPeserta.sendKeys(value);
            case RegularPage.pilihPublish -> fieldPublish.sendKeys(value);
            case RegularPage.isiTestimonial -> isiTestimonial.sendKeys(value);
//            case RegularPage. -> editSimpan.sendKeys(value);
        }
    }

    public String result(String tampil) {
        switch (tampil){
            case RegularPage.textTambahPeserta -> {
                return txtTambahPeserta.getText();
            }case RegularPage.isiTestimonial -> {
                return isiTestimonial.getAttribute("name");
            }case RegularPage.namaWajibDiisi -> {
                return textWajibIsiNama.getText();
            }case RegularPage.testimonialWajibDiisi -> {
                return textTestimonialWajibDiisi.getText();
            }case RegularPage.imageException -> {
                return textImageExc.getText();
            }case RegularPage.labelKarakter -> {
                return textKarakter.getText();
            }case RegularPage.berhasilSimpan -> {
                return textBerhasil.getText();
            }

        }
        return tampil;
    }

}

