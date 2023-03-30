Feature: Login admin WJC
  Scenario: Admin invalid login WJC
    Given Open browser and url
    When Tanpa input username
    When Tanpa input password
    And Click button sign-in
    Then Get message username atau password kosong


  Scenario: Admin simpan dengan password yang tidak terdaftar
    Given Click button ok
    When Input username yang terdaftar
    And Input password yang tidak terdaftar
    And Click button sign-in
    Then Get message username atau password salah

  Scenario: Admin simpan dengan username yang tidak terdaftar
    Given Input username yang tidak terdaftar
    When Input password yang terdaftar
    And Click button sign-in
    Then Get message username atau password salah

  Scenario: Admin simpan dengan username menggunakan nomor handphone
    Given Input username menggunakan nomor handphone
    When Input password yang terdaftar
    And Click button sign-in
    Then Get message username atau password salah

  Scenario: Admin simpan dengan password menggunakan huruf kapital
    Given Input username yang terdaftar
    When Input password yang terdaftar menggunakan huruf kapital
    And Click button sign-in
    Then Get message username atau password salah

  Scenario: Admin simpan dengan password menggunakan angka
    Given Input username yang terdaftar
    When Input password menggunakan angka
    And Click button sign-in
    Then Get message username atau password salah

  Scenario: Admin valid login WJC
    Given Input username yang terdaftar
    When Input password yang terdaftar
    And Click button sign-in
    Then Get to page dashboard

  Scenario: Admin logout WJC
    And Click profil
    Then Click button logout