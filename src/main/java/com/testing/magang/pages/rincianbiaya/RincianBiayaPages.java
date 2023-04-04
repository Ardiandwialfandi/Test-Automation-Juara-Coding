package com.testing.magang.pages.rincianbiaya;
import com.testing.magang.drivers.DriverSingleton;
import com.testing.magang.utils.RegularPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RincianBiayaPages {
    public static WebDriver driver;

    public RincianBiayaPages() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    WebElement pass;
    @FindBy(xpath = "//button[normalize-space()='Sign-In']")
    WebElement btnSignin;

    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement MenuHome;
    @FindBy(xpath = "//a[normalize-space()='Rincian Biaya']")
    WebElement btnRincianBiaya;
    @FindBy(xpath = "//a[@class='btn btn-gradient']")
    WebElement btnTambah;
    @FindBy(xpath = "//h4[@class='card-title mb-0']")
    public WebElement txtTambahRincianBiaya;
    @FindBy(xpath = "//input[@id='nama']")
    public WebElement inputnamaProgram;

    @FindBy(xpath = "//input[@id='harga']")
    public WebElement inputHarga;
    @FindBy(xpath = "//input[@id='diskonid']")
    public WebElement inputDiskon;
    @FindBy(xpath = "//input[@name='totalharga']")
    public WebElement totalHarga; //setelah diskon
    @FindBy(xpath = "//input[@name='keunggulan1']")
    public WebElement isikeunggulan1;
    @FindBy(xpath = "//input[@name='keunggulan2']")
    public WebElement isikeunggulan2;
    @FindBy(xpath = "//input[@name='keunggulan3']")
    public WebElement isikeunggulan3;
    @FindBy(xpath = "//input[@name='keunggulan4']")
    public WebElement isikeunggulan4;
    @FindBy(xpath = "//input[@name='keunggulan5']")
    public WebElement isikeuntungan5;
    @FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
    WebElement publish;

    @FindBy(css = "input[value='Simpan']")
    WebElement btnSimpan;

    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[2]/div/div[1]/div/div/div")
    WebElement NamaProgramHarusDiisi;
    @FindBy(xpath = "//div[@class='invalid-feedback'][normalize-space()='Harap isi harga program']")
    WebElement HargaProgramHarusDiisi;
    @FindBy(xpath = "//div[5]//div[1]//div[1]")
    WebElement Keunggulan1WajibDiisi;

    @FindBy(xpath = "//alert[@class='alert alert-success']")
    WebElement txtBerhasil;
    @FindBy(xpath = "//*[@id=\"pageWrapper\"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[11]/a")
    public WebElement btnEdit;//*[@id="pageWrapper"]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[10]/a
    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/a[1]")
    public WebElement btnEdit1;
//    @FindBy(xpath = "//th[normalize-space()='Publish']")
//    public WebElement textpublish;
    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
    public WebElement text10;
    @FindBy(xpath = "//select[@name='st']")
    WebElement selectname;
    @FindBy(xpath = "//h4[normalize-space()='Edit Rincian Biaya']")
    WebElement txtEditRincianBiaya;
    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement search;
    @FindBy(xpath = "//div[@class='faq-form']//*[name()='svg']")
    WebElement btnSearch;
    @FindBy(xpath = "(//td[normalize-space()='Kelas Karyawan'])[1]")
    public WebElement textSearchNama;
    @FindBy(xpath = "//h3[normalize-space()='Data Rincian Biaya']")
    public WebElement Textdataricianbiaya;
    @FindBy(xpath = "(//td[contains(text(),'Rp 10.000.000')])[1]")
    public WebElement Text10juta;
    @FindBy(xpath = "(//td[contains(text(),'Rp 13.500.000')])[1]")
    public WebElement Text13juta;
    @FindBy(xpath = "//*[@id=\"frmregister\"]/alert")
    public WebElement textberhasilupdate;//*[@id="frmregister"]/alert
//    @FindBy(xpath = "//th[normalize-space()='Aksi']")
//    public WebElement txtAksi;
    public void login() {
        email.sendKeys("ucen1315@gmail.com");
        pass.sendKeys("a");
        btnSignin.click();
    }

    public void btnClick(String click) {
        switch (click) {
            case RegularPage.tombolMenuHome -> MenuHome.click();
            case RegularPage.tombolRincianBiaya -> btnRincianBiaya.click();
            case RegularPage.tombolTambah -> btnTambah.click();
            case RegularPage.tombolSimpan -> btnSimpan.click();
            case RegularPage.tombolEdit -> btnEdit.click();
            case RegularPage.tombolSearch -> btnSearch.click();
            case RegularPage.txtSearchnama -> textSearchNama.click();
            case RegularPage.Edit1 -> btnEdit1.click();
        }
    }

    public void valueSendkey(String element, String value) {
        switch (element) {
            case RegularPage.inputnamaProgram -> inputnamaProgram.sendKeys(value);
            case RegularPage.isikeunggulan1 -> isikeunggulan1.sendKeys(value);
            case RegularPage.isikeunggulan2 -> isikeunggulan2.sendKeys(value);
            case RegularPage.isikeunggulan3 -> isikeunggulan3.sendKeys(value);
            case RegularPage.isikeunggulan4 -> isikeunggulan4.sendKeys(value);
            case RegularPage.isikeuntungan5 -> isikeuntungan5.sendKeys(value);
            case RegularPage.inputHarga -> inputHarga.sendKeys(value);
            case RegularPage.inputDiskon -> inputDiskon.sendKeys(value);
            case RegularPage.totalHarga -> totalHarga.sendKeys(value);
            case RegularPage.pilihPublish -> publish.sendKeys(value);
            case RegularPage.pilihselectname -> selectname.sendKeys(value);
            case RegularPage.TextEditRincianBiaya -> txtEditRincianBiaya.sendKeys(value);
            case RegularPage.Search -> search.sendKeys(value);
        }
    }

    public String result(String tampil) {
        switch (tampil) {
            case RegularPage.textTambahRincianBiaya -> {
                return txtTambahRincianBiaya.getText();
            }
            case RegularPage.namaProgramWajibDiisi -> {
                return NamaProgramHarusDiisi.getText();
            }
            case RegularPage.hargaProgramWajibDiisi -> {
                return HargaProgramHarusDiisi.getText();
            }
            case RegularPage.keunggulan1WajibDiisi -> {
                return Keunggulan1WajibDiisi.getText();
            }
            case RegularPage.textBerhasilDitambah -> {
                return txtBerhasil.getText();
            }
            case RegularPage.txtSearchnama -> {
                return textSearchNama.getText();
            }
            case RegularPage.txtDataricianbiaya -> {
                return Textdataricianbiaya.getText();
            }
            case RegularPage.diskonpersen -> {
                return text10.getText();
            }
            case RegularPage.berhasilUpdate -> {
                return textberhasilupdate.getText();
            }
            case RegularPage.sepuluhjuta -> {
                return Text10juta.getText();}
            case RegularPage.tigabelasjuta -> {
                return Text13juta.getText();}
        }
        return tampil;
    }
}


