Feature: Tambah Blog

  Scenario: Menampilkan form blog
    When Admin klik tombol blog
    And Admin klik tombol tambah blog
    Then Admin get on page tambah blog

  Scenario: Menambahkan Blog dengan value kosong
    Given Admin klik tombol blog
    When Admin klik tombol tambah blog
    And Admin klik tombol simpan
    Then Admin get on attribute choose file

  Scenario: Menambahkan Blog tidak dengan file
    Given Admin masukan value judul blog
    When Admin pilih tipe list publish blog
    And Admin pilih tipe list set to home
    And Admin masukan value content preview
    And Admin masukan value content
    And Admin klik tombol simpan
    Then Admin get on attribute choose file

  Scenario: Simpan dengan text box judul blog kosong
    Given Admin pilih file dengan format gambar
    When Admin hapus value judul blog
    And Admin klik tombol simpan
    Then Menampilkan alert judul wajib diisi

  Scenario: Simpan dengan text box judul content preview kosong
    Given Admin pilih file dengan format gambar
    When Admin masukan value judul blog
    And Admin hapus value content preview
    And Admin klik tombol simpan
    Then Menampilkan alert content preview wajib diisi

  Scenario: Simpan dengan text box content blog kosong
    Given Admin pilih file dengan format gambar
    When Admin masukan value content preview
    And Admin hapus value content blog
    And Admin klik tombol simpan
    Then Menampilkan alert content blog wajib diisi

  Scenario: Simpan dengan value judul sama
    Given Admin pilih file dengan format gambar
    When Admin masukan value judul blog
    And Admin masukan value content preview
    And Admin klik tombol simpan
    Then Menampilkan alert judul sudah terdaftar

  Scenario: Simpan dengan text box content blog kosong dua
    Given Admin pilih file dengan format gambar
    When Admin masukan value judul blog ganti
    And Admin masukan value content preview
    And Admin klik tombol simpan
    Then Menampilkan alert content blog wajib di isi

  Scenario: Menambahkan blog dengan file selain gambar
    Given Admin pilih file selain format gambar
    When Admin masukan value content blog
    And Admin klik tombol simpan
    Then Menampilkan halaman image exception

  Scenario: Menyimpan value menggunakan simbol lebih dari
    Given Admin kembali ke page sebelumnya
    When Admin pilih file dengan format gambar
    And Admin masukan value judul blog lebih dari
    And Admin masukan value content preview lebih dari
    And Admin masukan value content lebih dari
    And Admin klik tombol simpan
    Then Menampilkan alert karakter tidak diizinkan

  Scenario: Menyimpan value menggunakan simbol kutip satu
    Given Admin pilih file dengan format gambar
    When Admin masukan value judul blog kutip satu
    And Admin masukan value content preview kutip satu
    And Admin masukan value content kutip satu
    And Admin klik tombol simpan
    Then Menampilkan alert karakter tidak diizinkan

  Scenario:Menyimpan value menggunakan simbol kutip dua
    Given Admin pilih file dengan format gambar
    When Admin masukan value judul blog kutip dua
    And Admin masukan value content preview kutip dua
    And Admin masukan value content kutip dua
    And Admin klik tombol simpan
    Then Menampilkan alert karakter tidak diizinkan

  Scenario: Menyimpan value menggunakan symbol kurang dari
    Given Admin pilih file dengan format gambar
    When Admin masukan value judul blog kurang dari
    And Admin masukan value content preview kurang dari
    And Admin masukan value content kurang dari
    And Admin klik tombol simpan
    Then Menampilkan allert karakter tidak diizinkan

  Scenario: Berhasil menambahkan blog
    Given Admin klik tombol blog
    When Admin klik tombol tambah blog
    And Admin pilih file dengan format gambar
    And Admin masukan value judul blog ganti
    And Admin pilih tipe list publish blog
    And Admin pilih tipe list set to home
    And Admin masukan value content preview
    And Admin masukan value content
    And Admin klik tombol simpan
    Then Admin get message berhasil
