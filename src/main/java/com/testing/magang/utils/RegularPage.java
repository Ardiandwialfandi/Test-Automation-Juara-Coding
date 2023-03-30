package com.testing.magang.utils;

import com.testing.magang.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RegularPage {

    public static final String tombolAbout = "about";
    public static final String tombolTambah = "tambah";
    public static final String tombolSimpan = "simpan";
    public static final String isiFile = "file";
    public static final String isiNamaTrainer = "nama";
    public static final String isiJabatan = "jabatan";
    public static final String isiProfile = "profilee";
    public static final String pilihPublish = "about";
    public static final String textTambahTrainer = "text";
    public static final String namaWajibDiisi = "wajibnama";
    public static final String jabatanWajibDiisi = "wajibjabatan";
    public static final String profileWajibDiisi = "wajibprofile";
    public static final String imageException = "image";
    public static final String labelKarakter = "karakter";
    public static final String berhasilSimpan = "simpan";
    public static final String listTrainer = "list";
    public static final String listGrids = "listGrid";
    public static final String totalTrainer = "trainer";
    public static final String searchTrainer = "search";
    public static final String klikGambar = "gambar";
    public static final String klikImage = "gambar2";
    public static final String fileEdit = "fileEdit";
    public static final String simpanEdit = "simpanEdit";
    public static final String dataUpdate = "update";
    public static final String editNama = "editnama";
    public static final String editjabat = "editjabat";
    public static final String editProfil = "editprof";
    public static final String alertNamaWajib = "alertnama";
    public static final String alertJabatanWajib = "alertjab";
    public static final String alertProfilWajib = "alertprof";
    public static final String alert = "alert";
    public static final String grid = "grid";
    public static final String tombolLogout = "logout";
    public static final String tombolLog = "logout";

    public static JavascriptExecutor js = (JavascriptExecutor) DriverSingleton.getDriver();
    public static void delayDuration(long time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void scrollPage(String atas, String bawah) {
        js.executeScript("window.scrollBy(" + atas + "," + bawah + ")");
        System.out.println("Scroll bar");
    }

    public static void scrollElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView();", element);
        System.out.println("Scroll bar");
    }



}