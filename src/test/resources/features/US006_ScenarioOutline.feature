@Outline
Feature: US006 kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC01 Kullanici istedigi kelimeleri aratir
    Given kullanici amazon sayfasina gider
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | Nutella       | Nutella              |
      | pencil        | pencil               |
      | milk          | milk                 |
      | tomatoes      | tomatoes             |
      | popcorn       | popcorn              |
