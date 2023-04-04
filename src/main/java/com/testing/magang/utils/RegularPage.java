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
        public static final String namaProgramWajibDiisi = "nama Program";
        public static final String hargaProgramWajibDiisi = "harga Program";
        public static final String keunggulan1WajibDiisi = "Keunggulan1";
        public static final String textBerhasilDitambah = "Berhasil Tambah";
        public static final String tombolEdit= "edit";
        public static final String pilihselectname= "select name";
        public static final String TextEditRincianBiaya= "edit rincian biaya";
        public static final String Search= "search";
        public static final String tombolSearch= "tombol search";
        public static final String txtSearchnama= "Text";
        public static final String txtDataricianbiaya= "Text data ";
        public static final String tombolBenefit = "Benefit";
        public static final String tombolTambahBenefit = "Tambah Benefit";
        public static final String searchBenefit = "Search Benefit";
        public static final String editBenefit = "Edit Benefit";
        public static final String Judul1 = "text judul1";
        public static final String Judul2 = "text judul2";
        public static final String Judul3 = "text judul3";
        public static final String Judul4 = "text judul4";
        public static final String deskripsi1 = "text deskripsi1";
        public static final String deskripsi2 = "text deskripsi2";
        public static final String deskripsi3 = "text deskripsi3";
        public static final String deskripsi4 = "text deskripsi4";
        public static final String pilihpublish = "publish benefit";
        public static final String textTambahBenefit = "Text Tambah Benefit";
        public static final String AlertJudul1 = "harap isi judul 1";
        public static final String AlertJudul2 = "harap isi judul 2";
        public static final String AlertKarakter= "Alert Karakter";
        public static final String alertUpdate= "sukses update";
        public static final String alertSukses = "sukses";
        public static final String diskonpersen= "10";
        public static final String buttonSimpan= "save";
        public static final String berhasilUpdate= "update";
        public static final String sepuluhjuta= "10 juta";
        public static final String tigabelasjuta= "13 juta";
        public static final String textDataBenefit = "Data Benefit";
        public static final String Edit1 = "Edit Benefit";
        public static final String textJudul1 = "Text Judul 1";


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
