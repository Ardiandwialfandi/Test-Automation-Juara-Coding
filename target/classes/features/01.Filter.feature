Feature: Halaman Contact Message WJC
  Scenario: Menampilkan From Contact Message
    Given Admin open web
    When Admin login web juara coding
    When Admin klik tombol contact messages
    And Admin klik filter combo box
    And Admin select nama

  Scenario: Menampilkan From Contact Message
    Given Admin klik filter combo box
    When Admin select email

  Scenario: Menampilkan From Contact Message
    Given Admin klik filter combo box
    When Admin select phone number

  Scenario: Menampilkan From Contact Message
    Given Admin klik filter combo box
    When Admin select subject
