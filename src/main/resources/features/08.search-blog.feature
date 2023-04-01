Feature: Search Blog

  Scenario: Menampilkan data sesuai keyword
    Given Admin klik tombol blog
    When Admin klik text box search
    And Admin masukan value judul blog pada search
    And Admin klik enter pada keyboard
    Then Menampilkan list blog