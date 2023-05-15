@DataTableTest
Feature: Data Table Test

  Scenario: Google Search
    Given kullanici_google_anasayfaya_gider
    When kullanici verilen bilgileri aratir
      | Bilgiler |
      | Java     |
      | SQL      |
      | Lambda   |
      | Python   |
    Then sayfayi_kapatir
@BlueRentalCarTables
  Scenario: BlueRentalCar Login
    Given kullanici blue rental car sayfasini gider
    When login olur
      | emailadress                   | password  |
      | jack@gmail.com                | 12345     |
      | sam.walker@bluerentalcars.com | c!fas_art |
    Then sayfayi_kapatir