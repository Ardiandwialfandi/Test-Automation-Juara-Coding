package com.testing.magang.utils;

public enum TestScenarios {
    T1("Admin invalid login WJC"),
    T2("Admin simpan dengan password yang tidak terdaftar"),
    T3("Admin simpan dengan username yang tidak terdaftar"),
    T4("Admin simpan dengan username menggunakan nomor handphone"),
    T5("Admin simpan dengan password menggunakan huruf kapital"),
    T6("Admin simpan dengan password menggunakan angka"),
    T7("Admin valid login WJC"),
    T8("Admin logout WJC");

    private final String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
