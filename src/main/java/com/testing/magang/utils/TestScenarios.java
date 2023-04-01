package com.testing.magang.utils;

public enum TestScenarios {
    T1("Menampilkan From Contact Message"),
    T2("Menampilkan From Contact Message"),
    T3("Menampilkan From Contact Message"),
    T4("Menampilkan From Contact Message");

    private final String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
