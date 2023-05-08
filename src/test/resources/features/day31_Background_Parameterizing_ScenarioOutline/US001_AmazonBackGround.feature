Feature: US001_Amazon_Sayfasinda_Urun_Aratma
  Scenario: TC01_Amazon_sayfasinda_Urun_Selenium_Aratma
    Given kullanici_amazon_sayfasina_gider
   When arama_kutusunda_Selenium_aratir
   Then sayfayi_kapatir