@PracticeTC07
Feature : TC Verify Test Cases

  @PracticeTC07_01
  Scenario :  TC_07_Test_Cases

    Given Tarayiciyi baslatarak "https://automationexercise.com/" url'sine gidin
    When Ana sayfanin basariyla gorunur oldugunu dogrulayin
    And Test Case buttonu na tiklayin
    Then Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin
    And Ilgili sayfanin ekran goruntusunu alin


#And bizim step definitions içindeki methodları oluşturur
#Ingilizce dilbilgisi mantığı ile hareket eder her türlü çalışır
#Then gegelde assort yapıldığı yere konulur yani doğrulamadır
#Given başta olur
#And ve demek olduğu için gramere göre kullanılır
#Given :verildiğinde demek,
#When : --zaman ,given dan sonra yazılır.
#Then : genelde aseertion yapıldıgında kullanılır.
#And :tekrarlayan adımlarda kullanılır