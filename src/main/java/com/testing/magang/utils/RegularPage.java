package com.testing.magang.utils;

import com.testing.magang.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RegularPage {

    public static final String tombolhome = "home";
    public static final String tombolTestimonial = "testimonial";
    public static final String tombolTambah = "tambah";
    public static final String tombolUploadFile = "uploadFile";
    public static final String isiNamaPeserta = "namaPeserta";
    public static final String pilihPublish = "publish";
    public static final String isiTestimonial = "isitestimonial";
    public static final String pilihRating = "rating";
    public static final String tombolSimpan = "simpan";
    public static final String wajibUploadFoto = "wajibUploadFoto";
    public static final String namaWajibDiisi = "wajibnama";
    public static final String testimonialWajibDiisi = "wajibtestimonial";
    public static final String imageException = "image";
    public static final String labelKarakter = "karakter";

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