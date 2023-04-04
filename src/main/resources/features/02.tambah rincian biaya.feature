Feature: Tambah Rincian Biaya
  Scenario: Admin menambahkan Rincian Biaya dengan value kosong
  Given klik tombol home
  When Admin klik tombol rincian biaya
  And Admin klik tombol tambah
  And Admin klik tombol simpan
  Then Menampilkan label harap isi nama program

#TCC.WJC.003
  Scenario: Admin menambahkan Rincian Biaya dengan isi nama program
    When Admin isi nama program
    And Admin klik tombol simpan
    Then Menampilkan label harap isi harga program

#TCC.WJC.004
  Scenario: Admin menambahkan Rincian Biaya dengan input harga program
    When Admin input harga normal
    And Admin klik tombol simpan
    Then Menampilkan label harap isi keunggulan program

#TCC.WJC.005
  Scenario: Admin menambahkan Rincian Biaya dengan isi keunggulan 1
    When Admin isi keunggulan 1
    And Admin klik tombol simpan
    Then Menampilkan label harap pilih publish

#TCC.WJC.006
  Scenario: Admin menambahkan Rincian Biaya menggunakan karakter tanpa mengisi harga
    Given Admin klik tombol home
    When Admin klik tombol rincian biaya
    And Admin klik tombol tambah
    And Admin isi nama program menggunakan karakter
    And Admin isi keunggulan 1 menggunakan karakter
    And Admin isi keunggulan 2 menggunakan karakter
    And Admin isi keunggulan 3 menggunakan karakter
    And Admin isi keunggulan 4 menggunakan karakter
    And Admin isi keunggulan 5 menggunakan karakter
    And Admin pilih publish
    And Admin klik tombol simpan
    Then Menampilkan label harap isi harga program

#TCC.WJC.007
  Scenario: Admin menambahkan Rincian Biaya input harga normal
  When Admin input harga normal
  And Admin isi diskon
  And Admin pilih publish
  And Admin klik tombol simpan
  Then Admin berhasil menambahkan Rincian Biaya

#TCC.WJC.008
  Scenario: Admin Menambahkan Rincian Biaya
    When Admin klik tombol home
    When Admin klik tombol rincian biaya
    When Admin klik tombol tambah
    And Admin input nama program
    And Admin input harga normal
    And Admin input jumlah diskon
    And Admin input keunggulan 1
    And Admin pilih publish
    And Admin klik tombol simpan
    Then Admin berhasil menambahkan Rincian Biaya

#TCC.WJC.009
  Scenario: Admin Search rincian biaya dengan value
    When Admin klik tombol home
    And Admin klik tombol rincian biaya
    And masukan value kelas karyawan pada search
    And Admin klik tombol search
    Then Admin berhasil menampilkan nama program

#TCC.WJC.010
  Scenario: Admin Search rincian biaya dengan value 10
    When Admin pilih select name diskon
    And masukan value 10 pada search
    And Admin klik tombol search
    Then Admin berhasil menampilkan diskon

#TCC.WJC.011
  Scenario: Admin Search rincian biaya dengan value harga normal
    When Admin pilih select name harga normal
    And masukan value 10000000 pada search
    And Admin klik tombol search
    Then Admin berhasil menampilkan harga normal

#TCC.WJC.012
  Scenario: Admin Search rincian biaya dengan value harga diskon
    When Admin pilih select name harga diskon
    And masukan value 13500000 pada search
    And Admin klik tombol search
    Then Admin berhasil menampilkan harga diskon

#TCC.WJC.013
  Scenario: Halaman edit Rincian Biaya
    When Admin klik tombol home
    And Admin klik tombol rincian biaya
    And Admin klik tombol edit
    Then Admin berhasil menampilkan halaman edit

#TCC.WJC.014
  Scenario: Admin Update Rincian Biaya
      When Admin isi Keunggulan 2
      And Admin pilih publish
      And Admin klik tombol simpan
      Then Admin berhasil update data

#TCC.WJC.015
  Scenario: Admin Update Rincian Biaya isi keunggulan 3
    When Admin isi Keunggulan 3
    And Admin pilih publish
    And Admin klik tombol simpan
    Then Admin berhasil update data

    #TCC.WJC.016
  Scenario: Admin Update Rincian Biaya isi keunggulan 4
    When Admin isi Keunggulan 4
    And Admin pilih publish
    And Admin klik tombol simpan
    Then Admin berhasil update data

    #TCC.WJC.017
  Scenario: Admin Update Rincian Biaya
    When Admin isi Keunggulan 5 dengan angka
    And Admin pilih publish
    And Admin klik tombol simpan
    Then Admin berhasil update data

