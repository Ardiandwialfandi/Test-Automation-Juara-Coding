package com.testing.magang.utils;

public enum TestScenarios {
    T1("Menampilkan form tambah rincian biaya"),
    T2("Admin menambahkan Rincian Biaya dengan value kosong"),
    T3("Admin menambahkan Rincian Biaya isi nama program"),
    T4("Admin menambahkan Rincian Biaya input harga program"),
    T5("Admin menambahkan Rincian Biaya isi keunggulan program"),
    T6("Admin menambahkan Rincian Biaya menggunakan karakter tanpa mengisi harga"),
    T7("Admin menambahkan Rincian Biaya input harga normal"),
    T8("Admin menambahkan Rincian Biaya"),
    T9("Admin Search rincian data dengan value"),
    T10("Admin Search rincian biaya dengan value 10"),
    T11("Admin Search rincian biaya dengan value harga normal"),
    T12("Admin Search rincian biaya dengan value harga diskon"),
    T13("Halaman edit Rincian Biaya"),
    T14("Admin Update Rincian Biaya"),
    T15("Admin Update Rincian Biaya isi keunggulan 3Menampilkan halaman tambah Benefit"),
    T16("Admin Update Rincian Biaya isi keunggulan 4"),
    T17("Admin Update Rincian Biaya isi keunggulan 5"),
    T18("Menampilkan halaman tambah Benefit"),
    T19("Admin menambahkan Benefit dengan value kosong"),
    T20("Admin menambahkan Benefit tanpa pilih publish"),
    T21("Tambah benefit menggunakan karakter \"<<\""),
    T22("Tambah benefit menggunakan karakter \">>\""),
    T23("Tambah benefit menggunakan karakter kutip "),
    T24("Tambah benefit menggunakan karakter |'| "),
    T25("Tambah benefit menggunakan Angka"),
    T26("Admin tambah benefit"),
    T27("Admin tambah benefit"),
    T28("search benefit"),
    T29("update Benefit");

    private final String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
