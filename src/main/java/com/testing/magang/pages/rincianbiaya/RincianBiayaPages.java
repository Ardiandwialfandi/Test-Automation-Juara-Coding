package com.testing.magang.pages.rincianbiaya;

import com.testing.magang.drivers.DriverSingleton;
import com.testing.magang.utils.RegularPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RincianBiayaPages {
    public static WebDriver driver;
    public RincianBiayaPages(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='username']")
    WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    WebElement pass;
    @FindBy(xpath = "//button[normalize-space()='Sign-In']")
    WebElement btnSignin;

    @FindBy(xpath = "//body/div[@id='pageWrapper']/div[@class='page-body-wrapper']/div[@class='sidebar-wrapper']/div/nav[@class='sidebar-main']/div[@id='sidebar-menu']/ul[@id='simple-bar']/div[@class='simplebar-wrapper']/div[@class='simplebar-mask']/div[@class='simplebar-offset']/div[@class='simplebar-content-wrapper']/div[@class='simplebar-content']/li[4]/a[1]")
    WebElement MenuHome;
    @FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]/ul/li[2]/a")
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
    @FindBy(xpath = "////input[@name='keunggulan3']")
    public WebElement isikeunggulan3;
    @FindBy(xpath = "//input[@name='keunggulan4']")
    public WebElement isikeunggulan4;
    @FindBy(xpath = "//input[@name='keunggulan5']")
    public WebElement isikeuntungan5;
    @FindBy(xpath = "//select[@id='exampleFormControlSelect9']")
    WebElement publish;

    @FindBy(xpath = "//*[@id=\"frmregister\"]/div[3]/input")
    WebElement btnSimpan;

    public void login() {
        email.sendKeys("ucen1315@gmail.com");
        pass.sendKeys("a");
        btnSignin.click();
    }

    public void btnClick(String click) {
        switch (click) {
            case RegularPage.tombolMenuHome-> MenuHome.click();
            case RegularPage.tombolRincianBiaya -> btnRincianBiaya.click();
            case RegularPage.tombolTambah-> btnTambah.click();
            case RegularPage.tombolSimpan -> btnSimpan.click();
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
        }
    }

        public String result(String tampil) {
            switch (tampil){
                case RegularPage.textTambahRincianBiaya -> {
                    return txtTambahRincianBiaya.getText();
                }

            }
            return tampil;
        }

}
