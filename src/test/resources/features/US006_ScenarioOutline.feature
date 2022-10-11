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
 #TestNG deki dataProvider kullanimindaki gibi Cucumberda da    Scenario Outline kullaniriz
 #Bu sekilde birden fazla kelimeyi tek seferde aratabiliriz
 #Feature dosyasinda yazdigimiz komutta eger "" (Tirnak) kullanirsak stepDefinition da parametreli
 #bir method olusturur.Ve artik stepDefiniton'i kullanmadan Feature dosyasinda ""(Tirnak)
#icindeki string'idegistirerek istedigim kelimeyi aratabilirim .
 #Scenario Outline da ise yine ""(Tirnak) icinde birden fazla kelime aratacaksam  "<>" seklindeki kullanim
 # ile "<>" icine yazdigim  herhangi bir kelimeyi  Scenario Outline'in asagida olusturdugu Examples
 #altinda aratmak istedigim kelimeleri yazar ve sirasiyla aratabiliriz