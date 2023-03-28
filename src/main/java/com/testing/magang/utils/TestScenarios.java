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
    T16("Menambahkan jumlah total trainer");
    private final String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
