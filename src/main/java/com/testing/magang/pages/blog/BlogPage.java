package com.testing.magang.pages.blog;

import com.testing.magang.drivers.DriverSingleton;
import com.testing.magang.utils.RegularPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BlogPage {

    public static WebDriver driver;

    public BlogPage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Blog']")
    WebElement btnBlog;
    @FindBy(xpath = "//input[@id='judul']")
    public WebElement isiJudulBlog;
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[1]/a")
    public WebElement btnTambah;
    @FindBy(xpath = "//input[@name='uploadedFile']")
    public WebElement isiFile;

    @FindBy(xpath = "//textarea[@name='body_preview']")
    WebElement isiPreview;
    @FindBy(xpath = "//div[@role='textbox']")
    public WebElement isiContent;
    @FindBy(css = "input[value='Simpan']")
    public WebElement btnSimpan;
    @FindBy(xpath = "//div[normalize-space()='Harap isi judul']")
    WebElement alertIsiJudul;
    @FindBy(xpath = "//div[@class='alert alert-danger mt-2']")
    WebElement alertJudulDuplicate;
    @FindBy(xpath = "//div[normalize-space()='Harap isi content perview']")
    public WebElement alertIsiPreview;
    @FindBy(xpath = "//div[normalize-space()='Harap isi content blog']")
    public WebElement alertIsiContent;
    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[2]/div/div")
    public WebElement alertSimbol;
    @FindBy(xpath = "//h4[normalize-space()='Tambah Blog']")
    public WebElement textTambahBlog;
    @FindBy(xpath = "(//select[@id='exampleFormControlSelect9'])[1]")
    WebElement publishBlog;
    @FindBy(xpath = "(//select[@id='exampleFormControlSelect9'])[2]")
    WebElement selectToHome;

    @FindBy(xpath = "/html/body/div[1]/div/p")
    WebElement textImageExc;

    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[2]/div/div")
    public WebElement textKarakter;

    @FindBy(xpath = "//alert[@class='alert alert-success']")
    public WebElement textBerhasil;
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[3]/div/b")
    public WebElement textTotalTrainer;
    @FindBy(name = "cari")
    public WebElement search;
    @FindBys({
            @FindBy(tagName = "figure")
    })
    public List<WebElement> listName;

    @FindBy(xpath = "(//img[@alt='Image description'])[1]")
    WebElement gambar;
    @FindBy(xpath = "(//img[@alt='Image description'])[6]")
    WebElement gambarDua;
//    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/alert")
//    public WebElement textUpdate;
//    @FindBy(className = "alert alert-danger mt-2")
//    public WebElement textAlert;
//    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[4]/div/nav/ul/li[3]")
//    public WebElement btnGrid;
//
//    @FindBys({
//            @FindBy(tagName = "p")
//    })
//    public List <WebElement> listGrid;

    public void btnClick(String click) {
        switch (click) {
            case RegularPage.tombolBlog -> btnBlog.click();
            case RegularPage.tombolTambah-> btnTambah.click();
            case RegularPage.tombolSimpan -> btnSimpan.click();
            case RegularPage.searchFeature -> search.click();
            case RegularPage.klikGambar -> gambar.click();
            case RegularPage.klikImage -> gambarDua.click();
//            case RegularPage.simpanEdit -> editSimpan.click();
//            case RegularPage.grid -> btnGrid.click();
        }
    }

    public void valueSendkey(String element, String value){
        switch (element){
            case RegularPage.isiFile -> isiFile.sendKeys(value);
            case RegularPage.isiJud -> isiJudulBlog.sendKeys(value);
            case RegularPage.isiPrev -> isiPreview.sendKeys(value);
            case RegularPage.isiCont -> isiContent.sendKeys(value);
            case RegularPage.publishBlog -> publishBlog.sendKeys(value);
            case RegularPage.selecthome -> selectToHome.sendKeys(value);
            case RegularPage.searchBlog -> search.sendKeys(value);
//            case RegularPage.fileEdit -> editFile.sendKeys(value);
//            case RegularPage.editNama -> editNamaTrainer.sendKeys(value);
//            case RegularPage.editjabat -> editJabatan.sendKeys(value);
//            case RegularPage.editProfil -> editProfile.sendKeys(value);
        }
    }

    public String result(String tampil) {
        switch (tampil){
            case RegularPage.tambahBlog -> {
                return textTambahBlog.getText();
            }case RegularPage.isiFile -> {
                return isiFile.getAttribute("name");
            }case RegularPage.alertJudul -> {
                return alertIsiJudul.getText();
            }case RegularPage.alertPrev -> {
                return alertIsiPreview.getText();
            }case RegularPage.alertCont -> {
                return alertIsiContent.getText();
            }
//            case RegularPage.alertNamaWajib -> {
//                return textAlertIsiNama.getText();
//            }case RegularPage.alertJabatanWajib -> {
//                return textAlertIsiJabatan.getText();
//            }case RegularPage.alertProfilWajib -> {
//                return textAlertIsiProfile.getText();
//            }
            case RegularPage.imageException -> {
                return textImageExc.getText();
            }case RegularPage.labelKarakter -> {
                return textKarakter.getText();
            }case RegularPage.berhasilSimpan -> {
                return textBerhasil.getText();
            }case RegularPage.judulTerdaftar -> {
                return alertJudulDuplicate.getText();
            }case RegularPage.totalData -> {
                return textTotalTrainer.getText();
            }case RegularPage.listBlog -> {
                for(WebElement name : listName){
                    return name.getText();
                }
            }
//            case RegularPage.fieldJudul -> {
//                return isiJudulBlog.getAttribute("name");
//            }case RegularPage.fieldPrev -> {
//                return isiPreview.getAttribute("name");
//            }case RegularPage.fieldCont -> {
//                return isiContent.getAttribute("name");
//            }case RegularPage.editNama -> {
//                return editNamaTrainer.getAttribute("name");
//            }case RegularPage.editjabat -> {
//                return editJabatan.getAttribute("name");
//            }case RegularPage.editProfil -> {
//                return isiProfile.getAttribute("name");
//            }case RegularPage.dataUpdate -> {
//                return textUpdate.getText();
//            }case RegularPage.alert -> {
//                return textAlert.getText();
//            }case RegularPage.listGrids -> {
//                for(WebElement gridList : listGrid){
//                    return gridList.getText();
//                }
//            }

        }
        return tampil;
    }
}
