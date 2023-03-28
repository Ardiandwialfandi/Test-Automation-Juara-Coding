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
    Given Admin pilih file gambar
    When Admin menghapus value nama trainer
    And Admin klik tombol simpan
    Then Menampilkan message nama trainer wajib diisi

  Scenario: Simpan dengan text box nama trainer spasi
    Given Admin pilih file gambar
    When Admin masukan value nama trainer dengan spasi
    And Admin klik tombol simpan
    Then Menampilkan alert nama trainer wajib diisi

  Scenario: Simpan dengan text box jabatan kosong
    Given Admin pilih file gambar
    When Admin masukan value nama trainer
    And Admin menghapus value jabatan
    And Admin klik tombol simpan
    Then Menampilkan message jabatan wajib diisi

  Scenario: Simpan dengan text box jabatan spasi
    Given Admin pilih file gambar
    When Admin masukan value jabatan dengan spasi
    And Admin klik tombol simpan
    Then Menampilkan alert jabatan wajib diisi
#
  Scenario: Simpan dengan text box isi profile kosong
    Given Admin pilih file gambar
    When Admin masukan value jabatan
    And Admin menghapus value isi profile
    And Admin klik tombol simpan
    Then Menampilkan message isi profile wajib diisi

  Scenario: Simpan dengan text box isi profile spasi
    Given Admin pilih file gambar
    When Admin masukan value isi profile dengan spasi
    And Admin klik tombol simpan
    Then Menampilkan alert isi profile wajib diisi

  Scenario: Menambahkan Trainer dengan file format selain gambar
    Given Admin pilih file selain gambar
    When Admin masukan value isi profile
    And Admin klik tombol simpan
    Then Menampilkan halaman image exception
#
  Scenario: Simpan input type dengan simbol kutip dua
    Given Admin kembali ke halaman sebelumnya
    When Admin pilih file gambar
    And Admin masukan value nama trainer dengan kutip dua
    And Admin masukan value jabatan dengan kutip dua
    And Admin masukan value isi profile dengan kutip dua
    And Admin pilih tipe list publish
    And Admin klik tombol simpan
    Then Menampilkan label karakter tidak diizinkan

  Scenario: Simpan input type dengan simbol lebih dari
    Given Admin pilih file gambar
    When Admin masukan value nama trainer dengan lebih dari
    And Admin masukan value jabatan dengan lebih dari
    And Admin masukan value isi profile dengan lebih dari
    And Admin pilih tipe list publish
    And Admin klik tombol simpan
    Then Menampilkan label karakter tidak diizinkan

  Scenario: Simpan input type dengan simbol kutip satu
    Given Admin pilih file gambar
    When Admin masukan value nama trainer dengan kutip satu
    And Admin masukan value jabatan dengan kutip satu
    And Admin masukan value isi profile dengan kutip satu
    And Admin pilih tipe list publish
    And Admin klik tombol simpan
    Then Menampilkan label karakter tidak diizinkan

  Scenario: Simpan input type dengan simbol kurang dari
    Given Admin pilih file gambar
    When Admin masukan value nama trainer dengan kurang dari
    And Admin masukan value jabatan dengan kurang dari
    And Admin masukan value isi profile dengan kurang dari
    And Admin pilih tipe list publish
    And Admin klik tombol simpan
    Then Menampilkan message karakter tidak diizinkan

  Scenario: Berhasil Menambahkan Trainer
    Given Admin klik tombol tambah
    When Admin pilih file gambar
    And Admin masukan value nama trainer
    And Admin masukan value jabatan
    And Admin masukan value isi profile
    And Admin pilih tipe list publish
    And Admin klik tombol simpan
    Then Data berhasil ditambah

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

  Scenario: Menampilkan list data trainer dengan search
    Given Admin klik tombol about
    When Admin klik text box search
    And Admin masukan value nama trainer pada search
    And Admin klik enter pada keyboard
    Then Menampilkan list nama trainer

