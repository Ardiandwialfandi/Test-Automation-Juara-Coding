Feature: Tambah Trainer

  Scenario: Menambahkan Trainer dengan value kosong
    Given Admin klik tombol about
    When Admin klik tombol tambah
    And Admin klik tombol simpan
    Then Admin kembali dan get atribute file

  Scenario: Menambahkan Trainer tidak dengan file
    When Admin masukan value nama trainer
    And Admin masukan value jabatan
    And Admin masukan value isi profile
    And Admin pilih tipe list publish
    And Admin klik tombol simpan
    Then Admin kembali dan get atribute file


  Scenario: Simpan dengan text box nama trainer kosong
    When Admin pilih file gambar
    And Admin menghapus value nama trainer
    And Admin klik tombol simpan
    Then Menampilkan alert nama trainer wajib diisi

  Scenario: Simpan dengan text box nama trainer spasi
    When Admin pilih file gambar
    And Admin masukan value nama trainer dengan spasi
    And Admin klik tombol simpan
    Then Menampilkan alert nama trainer wajib diisi

  Scenario: Simpan dengan text box jabatan kosong
    When Admin pilih file gambar
    And Admin masukan value nama trainer
    And Admin menghapus value jabatan
    And Admin klik tombol simpan
    Then Menampilkan alert jabatan wajib diisi

  Scenario: Simpan dengan text box jabatan spasi
    When Admin pilih file gambar
    And Admin masukan value jabatan dengan spasi
    And Admin klik tombol simpan
    Then Menampilkan alert jabatan wajib diisi
#
  Scenario: Simpan dengan text box isi profile kosong
    When Admin pilih file gambar
    And Admin masukan value jabatan
    And Admin menghapus value isi profile
    And Admin klik tombol simpan
    Then Menampilkan alert isi profile wajib diisi

  Scenario: Simpan dengan text box isi profile spasi
    When Admin pilih file gambar
    And Admin masukan value isi profile dengan spasi
    And Admin klik tombol simpan
    Then Menampilkan alert isi profile wajib diisi

  Scenario: Menambahkan Trainer dengan file format selain gambar
    When Admin pilih file selain gambar
    And Admin masukan value isi profile
    And Admin klik tombol simpan
    Then Menampilkan halaman image exception
#
  Scenario: Simpan input type dengan simbol kutip dua
    When Admin kembali ke halaman sebelumnya
    And Admin pilih file gambar
    And Admin masukan value nama trainer dengan kutip dua
    And Admin masukan value jabatan dengan kutip dua
    And Admin masukan value isi profile dengan kutip dua
    And Admin pilih tipe list publish
    And Admin klik tombol simpan
    Then Menampilkan label karakter tidak diizinkan

  Scenario: Simpan input type dengan simbol lebih dari
    When Admin pilih file gambar
    And Admin masukan value nama trainer dengan lebih dari
    And Admin masukan value jabatan dengan lebih dari
    And Admin masukan value isi profile dengan lebih dari
    And Admin pilih tipe list publish
    And Admin klik tombol simpan
    Then Menampilkan label karakter tidak diizinkan

  Scenario: Simpan input type dengan simbol kutip satu
    When Admin pilih file gambar
    And Admin masukan value nama trainer dengan kutip satu
    And Admin masukan value jabatan dengan kutip satu
    And Admin masukan value isi profile dengan kutip satu
    And Admin pilih tipe list publish
    And Admin klik tombol simpan
    Then Menampilkan label karakter tidak diizinkan

  Scenario: Simpan input type dengan simbol kurang dari
    When Admin pilih file gambar
    And Admin masukan value nama trainer dengan kurang dari
    And Admin masukan value jabatan dengan kurang dari
    And Admin masukan value isi profile dengan kurang dari
    And Admin pilih tipe list publish
    And Admin klik tombol simpan
    Then Menampilkan label karakter tidak diizinkan