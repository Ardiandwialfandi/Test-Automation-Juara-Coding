Feature: Total Trainer

  Scenario: Menambahkan jumlah total trainer
    Given Menampilkan total sebelumnya
    When Admin klik tombol tambah
    And Admin pilih file gambar
    And Admin masukan value nama trainer
    And Admin masukan value jabatan
    And Admin masukan value isi profile
    And Admin pilih tipe list publish
    And Admin klik tombol simpan
    Then Total berhasil bertambah