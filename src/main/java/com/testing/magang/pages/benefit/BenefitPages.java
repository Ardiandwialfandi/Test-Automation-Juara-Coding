package com.testing.magang.pages.benefit;

import com.testing.magang.drivers.DriverSingleton;
import com.testing.magang.utils.RegularPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BenefitPages {
    public static WebDriver driver;
    public BenefitPages(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement btnHome;
    @FindBy(xpath = "//a[normalize-space()='Benefit']")
    WebElement btnBenefit;

    @FindBy(xpath = "//a[normalize-space()='Tambah']")
    WebElement btnTambahBenefit;
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement Search_Benefit;

    @FindBy(xpath = "(//i[@class='fa fa-edit'])[1]")
    WebElement Edit_Benefit;

    @FindBy(xpath = "(//h4[normalize-space()='Tambah Benefit'])[1]")
    public WebElement txtTambahBenefit;

    @FindBy(xpath = "//input[@id='judul_1']")
    WebElement Judul1;

    @FindBy(xpath = "//input[@id='judul_2']")
    WebElement Judul2;

    @FindBy(xpath = "//input[@id='judul_3']")
    WebElement Judul3;

    @FindBy(xpath = "//input[@id='judul_4']")
    WebElement Judul4;

    @FindBy(xpath = "//textarea[@name='deskripsi_1']")
    WebElement deskripsi1;
    @FindBy(xpath = "//textarea[@name='deskripsi_2']")
    WebElement deskripsi2;

    @FindBy(xpath = "//textarea[@name='deskripsi_3']")
    WebElement deskripsi3;
    @FindBy(xpath = "//textarea[@name='deskripsi_4']")
    WebElement deskripsi4;

    @FindBy(xpath = "//input[@name='mysubmit']")
    WebElement btnSimpan;

    @FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
    WebElement publish;
    @FindBy(xpath = "//div[normalize-space()='Harap isi judul 1']")
    WebElement alertJudul1;//div[normalize-space()='Harap isi judul 1']
    @FindBy(xpath = "//div[normalize-space()='Harap isi judul 2']")
    WebElement alertJudul2; // (//div[@class='alert alert-danger mt-2'])[1]

    @FindBy(xpath = "//div[@class='alert alert-danger mt-2']")
    WebElement alertKarakter;
    @FindBy(className = "alert alert-success")
    WebElement textSuksesUpdate;//alert[@class='alert alert-success']
    //alert[@class='alert alert-success']
    @FindBy(css = ".alert.alert-success")
    WebElement textSukses;// untuk berhasil tambah benefit
    @FindBy(xpath = "//h3[normalize-space()='Data Benefit']")
    WebElement txtDataBenefit;
//    @FindBy(xpath = "//th[normalize-space()='Aksi']")
//    public WebElement txtAksi;
    @FindBy(xpath = "(//td[normalize-space()='Judul 1'])[1]")
    public WebElement txtJudul1;


    public void btnClick(String click) {
        switch (click) {
            case RegularPage.tombolBenefit -> btnBenefit.click();
            case RegularPage.tombolMenuHome -> btnHome.click();
            case RegularPage.tombolTambahBenefit -> btnTambahBenefit.click();
            case RegularPage.searchBenefit -> Search_Benefit.click();
            case RegularPage.editBenefit -> Edit_Benefit.click();
            case RegularPage.buttonSimpan -> btnSimpan.click();
            }
        }

        public void valueSendkey(String element, String value){
        switch (element){
            case RegularPage.Judul1 -> Judul1.sendKeys(value);
            case RegularPage.Judul2 -> Judul2.sendKeys(value);
            case RegularPage.Judul3 -> Judul3.sendKeys(value);
            case RegularPage.Judul4 -> Judul4.sendKeys(value);
            case RegularPage.deskripsi1 -> deskripsi1.sendKeys(value);
            case RegularPage.deskripsi2 -> deskripsi2.sendKeys(value);
            case RegularPage.deskripsi3 -> deskripsi3.sendKeys(value);
            case RegularPage.deskripsi4 -> deskripsi4.sendKeys(value);
            case RegularPage.pilihpublish -> publish.sendKeys(value);
        }
        }

        public String result(String tampil){
        switch (tampil){
            case RegularPage.textTambahBenefit -> {
                return txtTambahBenefit.getText();}
            case RegularPage.AlertJudul1 -> {
                return alertJudul1.getText();}
            case RegularPage.AlertJudul2 -> {
                return alertJudul2.getText();}
            case RegularPage.AlertKarakter -> {
                return alertKarakter.getText();}
            case RegularPage.alertUpdate -> {
                return textSuksesUpdate.getText();}
            case RegularPage.alertSukses -> {
                return textSukses.getText();}
            case RegularPage.textDataBenefit -> {
                return txtDataBenefit.getText();}
            case RegularPage.textJudul1 -> {
                return txtJudul1.getText();}
            }
            return tampil;
        }
        }

