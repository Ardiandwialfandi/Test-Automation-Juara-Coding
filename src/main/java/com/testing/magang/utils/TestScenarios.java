package com.testing.magang.utils;

public enum TestScenarios {
    T1("Admin valid login WJC"),
    T2("Admin invalid login WJC");

    private final String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
