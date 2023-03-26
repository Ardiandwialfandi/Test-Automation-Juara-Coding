package com.testing.magang.pages.about;

import com.testing.magang.drivers.DriverSingleton;
import com.testing.magang.utils.RegularPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {

    public AboutPage() {
        WebDriver driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    WebElement pass;
    @FindBy(xpath = "//button[normalize-space()='Sign-In']")
    WebElement btnSignin;
    @FindBy(xpath = "//span[normalize-space()='About']")
    WebElement btnAbout;
    @FindBy(xpath = "//a[normalize-space()='Tambah']")
    WebElement btnTambah;
    @FindBy(xpath = "//h4[normalize-space()='Tambah Trainer']")
    public WebElement txtTambahTrainer;
    @FindBy(xpath = "//input[@name='uploadedFile']")
    public WebElement isiFile;
    @FindBy(xpath = "//input[@placeholder='Nama Trainer']")
    WebElement isiNamaTrainer;
    @FindBy(xpath = "//input[@placeholder='Jabatan']")
    WebElement isiJabatan;
    @FindBy(xpath = "//textarea[@name='isi_profil']")
    WebElement isiProfile;
    @FindBy(css = "input[value='Simpan']")
    WebElement btnSimpan;
    @FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
    WebElement publish;
    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[2]/div/div")
    public WebElement textWajibIsiNama;
    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[3]/div/div")
    WebElement textWajibIsiJabatan;
    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[4]/div/div")
    WebElement textWajibIsiProfile;
    @FindBy(xpath = "/html/body/div[1]/div/p")
    WebElement textImageExc;
    @FindBy(xpath = "//div[@class='card-body']//div[2]//div[1]//div[1]")
    public WebElement textKarakter;
    @FindBy(xpath = "//alert[@class='alert alert-success']")
    public WebElement textBerhasil;
//    @FindBy(xpath = "//input[@id='username']")
//    WebElement email;

    public void login() {
        email.sendKeys("ucen1315@gmail.com");
        pass.sendKeys("a");
        btnSignin.click();
    }

    public void btnClick(String click) {
        switch (click) {
            case RegularPage.tombolAbout -> btnAbout.click();
            case RegularPage.tombolTambah-> btnTambah.click();
            case RegularPage.tombolSimpan -> btnSimpan.click();
        }
    }

    public void valueSendkey(String element, String value){
        switch (element){
            case RegularPage.isiFile -> isiFile.sendKeys(value);
            case RegularPage.isiNamaTrainer -> isiNamaTrainer.sendKeys(value);
            case RegularPage.isiJabatan -> isiJabatan.sendKeys(value);
            case RegularPage.isiProfile -> isiProfile.sendKeys(value);
            case RegularPage.pilihPublish -> publish.sendKeys(value);
        }
    }

    public String result(String tampil) {
        switch (tampil){
            case RegularPage.textTambahTrainer -> {
                return txtTambahTrainer.getText();
            }case RegularPage.isiFile -> {
                return isiFile.getAttribute("name");
            }case RegularPage.namaWajibDiisi -> {
                return textWajibIsiNama.getText();
            }case RegularPage.jabatanWajibDiisi -> {
                return textWajibIsiJabatan.getText();
            }case RegularPage.profileWajibDiisi -> {
                return textWajibIsiProfile.getText();
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


