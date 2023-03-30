Feature: Edit Trainer

  Scenario: Mengubah file dengan format selain gambar
    Given Admin klik trainer
    When Admin ubah file dengan selain gambar
    And Admin simpan edit trainer
    Then Menampilkan halaman exception image

  Scenario: Mengubah value menggunakan symbol lebih dari
    Given Admin klik tombol about
    When Admin klik text box search
    And Admin masukan value nama trainer pada search
    And Admin klik enter pada keyboard
    And Admin klik trainer
    And Admin edit value nama trainer dengan lebih dari
    And Admin edit value jabatan dengan lebih dari
    And Admin edit value isi profile dengan lebih dari
    And Admin simpan edit trainer
    Then Menampilkan label karakter tidak diizinkan

  Scenario: Mengubah value menggunakan symbol kutip satu
    Given Admin edit value nama trainer dengan kutip satu
    When Admin edit value jabatan dengan kutip satu
    And Admin edit value isi profile dengan kutip satu
    And Admin simpan edit trainer
    Then Menampilkan label karakter tidak diizinkan

  Scenario: Mengubah value menggunakan symbol  kutip dua
    Given Admin edit value nama trainer dengan kutip dua
    When Admin edit value jabatan dengan kutip dua
    And Admin edit value isi profile dengan kutip dua
    And Admin simpan edit trainer
    Then Menampilkan label karakter tidak diizinkan

  Scenario: Mengubah value menggunakan symbol kurang dari
    Given Admin edit value nama trainer dengan kurang dari
    When Admin edit value jabatan dengan kurang dari
    And Admin edit value isi profile dengan kurang dari
    And Admin simpan edit trainer
    Then Menampilkan message karakter tidak diizinkan

  Scenario: Ubah dengan text box nama trainer kosong
    Given Admin masukan value nama trainer pada search
    When Admin klik enter pada keyboard
    And Admin klik trainer
    And Admin edit hapus value nama trainer
    And Admin simpan edit trainer
    Then Menampilkan mesage nama trainer wajib diisi

  Scenario: Ubah dengan text box nama trainer spasi
    When Admin edit value nama trainer dengan spasi
    And Admin simpan edit trainer
    Then Menampilkan allert nama trainer wajib diisi

  Scenario: Ubah dengan text box jabatan kosong
    When Admin edit value nama trainer
    And Admin edit hapus value jabatan
    And Admin simpan edit trainer
    Then Menampilkan mesage jabatan wajib diisi

  Scenario: Ubah dengan text box jabatan spasi
    When Admin edit value jabatan dengan spasi
    And Admin simpan edit trainer
    Then Menampilkan allert jabatan wajib diisi

  Scenario: Ubah dengan text box isi profile kosong
    When Admin edit value jabatan
    And Admin edit hapus value isi profile
    And Admin simpan edit trainer
    Then Menampilkan mesage isi profile wajib diisi

  Scenario: Ubah dengan text box isi profile spasi
    When Admin edit value isi profile dengan spasi
    And Admin simpan edit trainer
    Then Menampilkan allert isi profile wajib diisi

  Scenario: Ubah dengan semua value kosong
    Given Admin klik tombol about
    When Admin masukan value nama trainer pada search
    And Admin klik enter pada keyboard
    And Admin klik trainer
    And Admin edit hapus value nama trainer
    And Admin edit hapus value jabatan
    And Admin edit hapus value isi profile
    And Admin pilih tipe list publish
    And Admin simpan edit trainer
    Then Menampilkan semua message wajib diisi

  Scenario: Ubah dengan semua value spasi
    Given Admin edit value nama trainer dengan spasi
    When Admin edit value jabatan dengan spasi
    And Admin edit value isi profile dengan spasi
    And Admin pilih tipe list publish
    And Admin simpan edit trainer
    Then Menampilkan semua alert wajib diisi

    Scenario: Mengubah data trainer
      When Admin edit value nama trainer
      And Admin edit value jabatan
      And Admin edit value isi profile
      And Admin pilih tipe list publish
      And Admin simpan edit trainer
      Then Admin mendapatkan alert berhasil update data

      Scenario: Menampilkan hasil grid ke tiga
        When Admin klik tombol about
        And Admin scroll to grid
        And Klik grid ke tiga
        Then Menampilkan data list ke tiga
