
Feature: US005 Blue RentaCar Login
  @brc
  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given kullanici "brcUrl" ana sayfasinda
    Then Login yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And kullanici 3  saniye bekler
    And Login butonuna basar
    And kullanici 3  saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder
    And kullanici 3  saniye bekler
    And kulllanici sayfayi kapatir
