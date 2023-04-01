Feature: Total Blog

  Scenario: Menambahkan jumlah total blog
    Given Admin klik tombol blog
    When Menampilkan total sebelumnya
    And Admin klik tombol tambah blog
    And Admin pilih file dengan format gambar
    And Admin masukan value judul blog baru
    And Admin pilih tipe list publish blog
    And Admin pilih tipe list set to home
    And Admin masukan value content preview
    And Admin masukan value content
    And Admin klik tombol simpan
    And Admin klik tombol blog
    Then Total berhasil bertambah
