package com.testing.magang.utils;

import com.testing.magang.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class RegularPage {

        public static final String tombolMenuHome = "Home";
        public static final String tombolRincianBiaya = "RincianBiaya";
        public static final String tombolTambah = "tambah";
        public static final String tombolSimpan = "simpan";
        public static final String inputnamaProgram = "namaprogram";
        public static final String isikeunggulan1 = "Keunggulan 1";
        public static final String isikeunggulan2 = "Keunggulan 2";
        public static final String isikeunggulan3 = "Keunggulan 3";
        public static final String isikeunggulan4 = "Keunggulan 4";
        public static final String isikeuntungan5 = "Keunggulan 5";
        public static final String inputHarga = "Harga";
        public static final String inputDiskon = "Diskon";
        public static final String totalHarga = "Harga Setelah Diskon";
        public static final String pilihPublish = "Rincian Biaya";
        public static final String textTambahRincianBiaya = "text";

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
