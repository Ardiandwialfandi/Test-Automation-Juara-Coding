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
    T32("Menampilkan hasil grid ke tiga"),
    T33("Menampilkan form blog"),
    T34("Menambahkan Blog dengan value kosong"),
    T35("Menambahkan Blog tidak dengan file"),
    T36("Simpan dengan text box judul blog kosong"),
    T37("Simpan dengan text box judul content preview kosong"),
    T38("Simpan dengan text box content blog kosong"),
    T39("Simpan dengan value judul sama"),
    T40("Simpan dengan text box content blog kosong dua"),
    T41("Menambahkan blog dengan file selain gambar"),
    T42("Menyimpan value menggunakan simbol lebih dari"),
    T43("Menyimpan value menggunakan simbol kutip satu"),
    T44("Menyimpan value menggunakan simbol kutip dua"),
    T45("Menyimpan value menggunakan symbol kurang dari"),
    T46("Berhasil menambahkan blog"),
    T47("Menambahkan jumlah total blog"),
    T48("Menampilkan data sesuai keyword");
    private final String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
