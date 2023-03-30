Feature: Search Trainer

  Scenario: Menampilkan list data trainer dengan search
    Given Admin klik tombol about
    When Admin klik text box search
    And Admin masukan value nama trainer pada search
    And Admin klik enter pada keyboard
    Then Menampilkan list nama trainer