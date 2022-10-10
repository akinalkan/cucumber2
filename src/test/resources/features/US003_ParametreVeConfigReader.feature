Feature: Parametre Kullanimi
  Scenario: Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "amazonUrl" sayfasina gider
    When kullanici "Nutella" icin arama yapar
    Then sonuclarin "Nutella" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "amazonUrl" sayfasina gider
    When url'in "amazon" icerdigini test eder
    Then kullanici 3  saniye bekler
    And sayfayi kapatir

  Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi
    Given kullanici "googleUrl" sayfasina gider
    When url'in "google" icerdigini test eder
    Then kullanici 7  saniye bekler
    And sayfayi kapatir