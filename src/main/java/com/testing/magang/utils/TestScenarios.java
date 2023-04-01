package com.testing.magang.utils;

public enum TestScenarios {
    T1("Menampilkan form tambah testimonial"),
    T2("Menambahkan Testimoni tanpa upload image"),
    T3("Menambahkan Testimoni tanpa nama peserta"),
    T4("Menambahkan Testimoni tanpa isi testimoni"),
    T5("Menginputkan file selain format image"),
    T6("Menginputkan huruf pada field search"),
    T7("Mengedit nama peserta"),
    T8("Mengedit mengosongkan nama peserta"),
    T9("Mengedit isi Testimonial"),
    T10("Mengedit  mengosongkan field isi Testimonial"),
    T11("Input Nama peserta menambahkan Karakter (<|>|'|\")"),
    T12("Mengedit Nama peserta menambahkan Karakter (<|>|'|\")"),
    T13("Menginput field isi testimonial dengan Karakter (<|>|'|\")"),
    T14("Mengedit field isi testimonial dengan Karakter (<|>|'|\")"),
    T15("Mengklik ikon Dashbboard pada laman tambah testimonial");
    private final String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
