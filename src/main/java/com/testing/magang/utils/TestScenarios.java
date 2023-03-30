package com.testing.magang.utils;

public enum TestScenarios {
    T1("Menampilkan form tambah trainer"),
    T2("Menambahkan Trainer dengan value kosong"),
    T3("Menambahkan Trainer tidak dengan file"),
    T4("Simpan dengan text box nama trainer kosong"),
    T5("Simpan dengan text box nama trainer spasi"),
    T6("Simpan dengan text box jabatan kosong"),
    T7("Simpan dengan text box jabatan spasi"),
    T8("Simpan dengan text box isi profile kosong"),
    T9("Simpan dengan text box isi profile spasi"),
    T10("Menambahkan Trainer dengan file format selain gambar"),
    T11("Simpan input type dengan simbol kutip dua"),
    T12("Simpan input type dengan simbol lebih dari"),
    T13("Simpan input type dengan simbol kutip satu"),
    T14("Simpan input type dengan simbol kurang dari"),
    T15("Berhasil Menambahkan Trainer"),
    T16("Menambahkan jumlah total trainer"),
    T17("Menampilkan list data trainer dengan search"),
    T18("Mengubah file dengan format selain gambar"),
    T19("Mengubah value menggunakan symbol lebih dari"),
    T20("Mengubah value menggunakan symbol kutip satu"),
    T21("Mengubah value menggunakan symbol  kutip dua"),
    T22("Mengubah value menggunakan symbol kurang dari"),
    T23("Ubah dengan text box nama trainer kosong"),
    T24("Ubah dengan text box nama trainer spasi"),
    T25("Ubah dengan text box jabatan kosong"),
    T26("Ubah dengan text box jabatan spasi"),
    T27("Ubah dengan text box isi profile kosong"),
    T28("Ubah dengan text box isi profile spasi"),
    T29("Ubah dengan semua value kosong"),
    T30("Ubah dengan semua value spasi"),
    T31("Mengubah data trainer"),
    T32("Menampilkan hasil grid ke tiga");
    private final String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
