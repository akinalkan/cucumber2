@PracticeTC07
Feature: TC Verify Test Cases

  @PracticeTC07_01

  Scenario:  TC_07_Test_Cases

    Given Tarayıcıyı başlatarak "http://automationexercise.com" url'sine gidin
    Then Ana sayfanın başarıyla görünür olduğunu doğrulayın
    And Test Case buttonu na tıklayın
    Then Kullanıcının test case sayfasına başarıyla yönlendirildiğini doğrulayın
    And İlgili sayfanın ekran görüntüsünü alın
    And sayfayi kapatin

#And bizim step definitions içindeki methodları oluşturur
#Ingilizce dilbilgisi mantığı ile hareket eder her türlü çalışır
#Then gegelde assort yapıldığı yere konulur yani doğrulamadır
#Given başta olur
#And ve demek olduğu için gramere göre kullanılır
#Given :verildiğinde demek,
#When : --zaman ,given dan sonra yazılır.
#Then : genelde aseertion yapıldıgında kullanılır.
#And :tekrarlayan adımlarda kullanılır