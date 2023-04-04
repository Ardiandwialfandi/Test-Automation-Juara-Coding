#TCC.WJC.019
Feature: Tambah Benefit
  Scenario: Admin menambahkan Benefit dengan value kosong
    Given Admin klik tombol home
    When Admin klik tombol benefit
    And Admin klik tombol tambah
    And Admin klik simpan
    Then Menampilkan label harap isi judul 1

#TCC.WJC.020
  Scenario: Admin menambahkan Benefit tanpa pilih publish
  When Admin isi Judul 1
  And Admin isi Deskripsi 1
  And Admin isi Judul 2
  And Admin isi Deskripsi 2
  And Admin isi Judul 3
  And Admin isi Deskripsi 3
  And Admin isi Judul 4
  And Admin isi Deskripsi 4
  And klik simpan
    Then menampilkan label harap pilih publish

#TCC.WJC.021
  Scenario: Tambah benefit menggunakan karakter "<<"
    And Admin pilih publish
    And klik tombol simpan
    Then menampilkan label karakter tidak diijinkan

#TCC.WJC.022
  Scenario: Tambah benefit menggunakan karakter ">>"
    When Admin isi Judul1
    And Admin isi Deskripsi1
    And Admin pilih publish
    And klik tombol simpan
    Then menampilkan label karakter tidak diijinkan

#TCC.WJC.023
  Scenario: Tambah benefit menggunakan karakter kutip
    When Admin input Judul1
    And Admin input Deskripsi1
    And Admin pilih publish
    And  klik tombol simpan
    Then menampilkan label karakter tidak diijinkan

#TCC.WJC.024
  Scenario: Tambah benefit menggunakan karakter "|'|"
    When Admin input Judul 1
    And input Deskripsi 1
    And Admin pilih publish
    And  klik tombol simpan
    Then menampilkan label karakter tidak diijinkan

#TCC.WJC.025
  Scenario: Tambah benefit menggunakan Angka
    When input judul 1
    And Admin input deskripsi 1
    And Admin pilih publish
    And  klik tombol simpan
    Then menampilkan label harap isi judul2

#TCC.WJC.026
  Scenario: Admin tambah benefit
    When input judul2
    And Admin input deskripsi2
    And Admin input judul3
    And Admin input deskripsi3
    And Admin input judul4
    And Admin input deskripsi4
    And Admin pilih publish active
    And  klik tombol simpan
    Then Admin berhasil tambah benefit

 #TCC.WJC.027
  Scenario: search benefit
    When admin klik search
    And input value
    And klik tombol search
    Then Admin berhasil menampilkan value

 #TCC.WJC.028
  Scenario: halaman edit Benefit
    When Admin klik tombol edit benefit
    And update judul 1
    And Admin klik button simpan edit
    Then berhasil updated

 #TCC.WJC.029
  Scenario: update Benefit
    When update deskripsi 1
    And Admin klik button simpan edit
    Then berhasil updated