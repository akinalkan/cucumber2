Feature: US007 Scenario Outline Kullanimi

  @US007
  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
    Given kullanici "<Url>" sayfasina gider
    Then kullanici 3  saniye bekler
    When url'in "<kelime>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | Url            | kelime   |
      | faceUrl        | facebook |
      | brcUrl         | blue     |
      | hepsiBuradaUrl | hepsi    |