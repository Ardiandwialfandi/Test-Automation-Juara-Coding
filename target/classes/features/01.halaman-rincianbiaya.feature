#TCC.WJC.001
Feature: Halaman Rincian Biaya
  Scenario: Menampilkan form tambah rincian biaya
    Given Admin open web
    When Admin login web juara coding
    When Admin klik tombol home
    And Admin klik tombol rincian biaya
    And Admin mengklik tombol tambah
    Then Admin berhasil ke halaman tambah rincian biaya