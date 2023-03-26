Feature: Halaman About
  Scenario: Menampilkan form tambah trainer
    Given Admin open web
    When Admin login web juara coding
    When Admin klik tombol about
    And Admin klik tombol tambah
    Then Admin berhasil ke halaman tambah trainer