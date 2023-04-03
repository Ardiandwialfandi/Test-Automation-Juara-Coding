Feature: Edit Blog

  Scenario: Edit dengan data file format mp3, mp4, docx
    Given Admin klik image data blog
    When Admin ubah file dengan selain gambar
    And Admin klik tombol simpan
    Then Menampilkan halaman image exception

  Scenario: Ubah dengan text box content preview kosong
    Given Admin ubah file dengan format gambar
    When Admin hapus value content preview
    And Admin klik tombol simpan
    Then Menampilkan alert content preview wajib diisi

  Scenario: Ubah dengan text box content blog kosong
    Given Admin ubah file dengan format gambar
    When Admin masukan value content preview
    And Admin hapus value content blog
    And Admin klik tombol simpan
    Then Menampilkan alert content blog wajib di isi

  Scenario: Mengubah data blog
    Given Admin ubah file dengan format gambar
    When Admin masukan value content blog
    And Admin klik tombol simpan
    Then Admin mendapatkan alert berhasil update data

  Scenario: Menampilkan list data trainer lain
    When Admin klik tombol blog
    And Admin scroll halaman blog
    And Admin klik tombol 3
    Then Admin get list blok 3