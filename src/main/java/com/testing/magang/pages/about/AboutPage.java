package com.testing.magang.pages.about;

import com.testing.magang.drivers.DriverSingleton;
import com.testing.magang.utils.RegularPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[1]/div/div/div[2]/ol/li[1]")
    public WebElement trainer;
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[1]/a")
    public WebElement btnTambah;
    @FindBy(xpath = "//h4[normalize-space()='Tambah Trainer']")
    public WebElement txtTambahTrainer;
    @FindBy(xpath = "//input[@name='uploadedFile']")
    public WebElement isiFile;

    @FindBy(xpath = "//*[@id=\"filename\"]")
    public WebElement editFile;

    @FindBy(xpath = "//input[@placeholder='Nama Trainer']")
    WebElement isiNamaTrainer;
    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[2]/div/div[2]/div/input")
    public WebElement editNamaTrainer;

    @FindBy(xpath = "//input[@placeholder='Jabatan']")
    WebElement isiJabatan;
    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[2]/div/div[3]/div/input")
    public WebElement editJabatan;
    @FindBy(xpath = "//textarea[@name='isi_profil']")
    WebElement isiProfile;
    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[2]/div/div[4]/div/textarea")
    public WebElement editProfile;
    @FindBy(css = "input[value='Simpan']")
    WebElement btnSimpan;
    @FindBy(xpath = "//input[@name='mysubmit']")
    WebElement editSimpan;
    @FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
    WebElement publish;
    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[2]/div/div")
    public WebElement textWajibIsiNama;
    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[2]/div/div[2]/div/div")
    public WebElement textAlertIsiNama;
    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[3]/div/div")
    WebElement textWajibIsiJabatan;
    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[2]/div/div[3]/div/div")
    public WebElement textAlertIsiJabatan;
    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[4]/div/div")
    WebElement textWajibIsiProfile;
    @FindBy(xpath = "//*[@id=\"frmadd\"]/div[2]/div/div[4]/div/div")
    public WebElement textAlertIsiProfile;
    @FindBy(xpath = "/html/body/div[1]/div/p")
    WebElement textImageExc;
    @FindBy(xpath = "//div[@class='card-body']//div[2]//div[1]//div[1]")
    public WebElement textKarakter;
    @FindBy(xpath = "//alert[@class='alert alert-success']")
    public WebElement textBerhasil;

    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/div[3]/div/b")
    public WebElement textTotalTrainer;
    @FindBy(name = "cari")
    public WebElement search;
    @FindBys({
            @FindBy(className = "caption")
    })
    public List <WebElement> listName;

    @FindBy(xpath = "(//img[@alt='Image description'])[4]")
    WebElement gambar;
    @FindBy(xpath = "(//img[@alt='Image description'])[6]")
    WebElement gambarDua;
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div[2]/div/div/div/alert")
    public WebElement textUpdate;
    @FindBy(className = "alert alert-danger mt-2")
    public WebElement textAlert;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div[4]/div/nav/ul/li[3]")
    public WebElement btnGrid;

    @FindBys({
            @FindBy(tagName = "p")
    })
    public List <WebElement> listGrid;

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
            case RegularPage.searchTrainer -> search.click();
            case RegularPage.klikGambar -> gambar.click();
            case RegularPage.klikImage -> gambarDua.click();
            case RegularPage.simpanEdit -> editSimpan.click();
            case RegularPage.grid -> btnGrid.click();
        }
    }

    public void valueSendkey(String element, String value){
        switch (element){
            case RegularPage.isiFile -> isiFile.sendKeys(value);
            case RegularPage.isiNamaTrainer -> isiNamaTrainer.sendKeys(value);
            case RegularPage.isiJabatan -> isiJabatan.sendKeys(value);
            case RegularPage.isiProfile -> isiProfile.sendKeys(value);
            case RegularPage.pilihPublish -> publish.sendKeys(value);
            case RegularPage.searchTrainer -> search.sendKeys(value);
            case RegularPage.fileEdit -> editFile.sendKeys(value);
            case RegularPage.editNama -> editNamaTrainer.sendKeys(value);
            case RegularPage.editjabat -> editJabatan.sendKeys(value);
            case RegularPage.editProfil -> editProfile.sendKeys(value);
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
            }case RegularPage.alertNamaWajib -> {
                return textAlertIsiNama.getText();
            }case RegularPage.alertJabatanWajib -> {
                return textAlertIsiJabatan.getText();
            }case RegularPage.alertProfilWajib -> {
                return textAlertIsiProfile.getText();
            }case RegularPage.imageException -> {
                return textImageExc.getText();
            }case RegularPage.labelKarakter -> {
                return textKarakter.getText();
            }case RegularPage.berhasilSimpan -> {
                return textBerhasil.getText();
            }case RegularPage.totalTrainer -> {
                return textTotalTrainer.getText();
            }case RegularPage.listTrainer -> {
                for(WebElement name : listName){
                    return name.getText();
                }
            }case RegularPage.isiNamaTrainer -> {
                return isiNamaTrainer.getAttribute("name");
            }case RegularPage.isiJabatan -> {
                return isiJabatan.getAttribute("name");
            }case RegularPage.isiProfile -> {
                return isiProfile.getAttribute("name");
            }case RegularPage.editNama -> {
                return editNamaTrainer.getAttribute("name");
            }case RegularPage.editjabat -> {
                return editJabatan.getAttribute("name");
            }case RegularPage.editProfil -> {
                return isiProfile.getAttribute("name");
            }case RegularPage.dataUpdate -> {
                return textUpdate.getText();
            }case RegularPage.alert -> {
                return textAlert.getText();
            }case RegularPage.listGrids -> {
                for(WebElement gridList : listGrid){
                    return gridList.getText();
                }
            }

        }
        return tampil;
    }



}


