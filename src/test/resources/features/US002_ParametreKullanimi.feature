@parametre
Feature: US002 Parametre Kullanimi

  Background:Ortak adim
    Given kullanici amazon sayfasina gider

  Scenario: TC01 Kullanici amazonda parametreli arama yapar
    Then kullanici "java" icin arama yapar
    And sonuclarin "java" icerdigini test eder



  Scenario: TC02 Kullanici amazonda parametreli arama yapar
    Then kullanici "nutella" icin arama yapar
    And sonuclarin "nutella" icerdigini test eder


  Scenario: TC01 Kullanici amazonda parametreli arama yapar
    Then kullanici "selenium" icin arama yapar
    And sonuclarin "selenium" icerdigini test eder

  Scenario: TC01 Kullanici amazonda parametreli arama yapar
    Then kullanici "akin" icin arama yapar
    And sonuclarin "akin" icerdigini test eder
    And sayfayi kapatir

    # Feature dosyasında parametreli arama yaptığımızda ""(tırnak) içine aldığımız string değeri stepDefinitionda
  #Bir kere parametreli method oluşturur ve yeni bir arama yapmak istediğimizde
  #Tekrar method oluşturmadan feature dosyasından ""(tırnak) içinde belirttiğimiz string ifadeyi değiştirmemiz
  #yeterli olucaktır. Böylece kodlarımız dinamik olucaktır