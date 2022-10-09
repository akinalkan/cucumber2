package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WindowType;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class GoogleUrunArama {

    int morhipoSonucSayisi;
    int trendyolSonucSayisi;
    String morhipoTitle;
    String trendyolTitle;
    GooglePage googlePage = new GooglePage();

    @Given("Google'a gidiniz")
    public void googleAGidiniz() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

    }

    @Then("trendyol'u aratiniz")
    public void trendyolUAratiniz() {
        googlePage.googleSearchBox.sendKeys("trendyol" + Keys.ENTER);
    }

    @And("trendyol linkini bulup siteye gidiniz")
    public void trendyolLinkiniBulupSiteyeGidiniz() {
        googlePage.trendyolAdresi.click();
        googlePage.trendtolCerezKabul.click();
    }


    @And("makas aratiniz")
    public void makasAratiniz() {
        googlePage.trendyolAramaCubugu.sendKeys("makas" + Keys.ENTER);

    }

    @And("toplam urun sayisini aliniz")
    public void toplamUrunSayisiniAliniz() {
        trendyolTitle = Driver.getDriver().getTitle();
        String aramaSonucu = googlePage.trendyolAramaSonucu.getText();
        String[] aramaArr = aramaSonucu.split(" ");
        trendyolSonucSayisi = Integer.parseInt(aramaArr[3]);


    }

    @And("yeni sekmede morhipo'ya gidiniz")
    public void yeniSekmedeMorhipoYaGidiniz() {
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://www.morhipo.com");

    }


    @And("makas aratiniz morhipo")
    public void makasAratinizMorhipo() {
        morhipoTitle = Driver.getDriver().getTitle();
        googlePage.morhipoAramaKutusu.sendKeys("makas" + Keys.ENTER);

    }

    @And("toplam urun sayisini aliniz morhipo")
    public void toplamUrunSayisiniAlinizMorhipo() {
        String morhipoAramaSonucu = googlePage.morhipoAramaSonucu.getText();
        morhipoSonucSayisi = Integer.parseInt(morhipoAramaSonucu);

    }

    @And("iki sitedeki toplam makas sayisini karsilastiriniz")
    public void ikiSitedekiToplamMakasSayisiniKarsilastiriniz() {
        System.out.println("Morhipo Sonuc Sayisi : " + morhipoSonucSayisi);
        System.out.println("Trendyol Sonuc Sayisi : " + trendyolSonucSayisi);
        if (morhipoSonucSayisi > trendyolSonucSayisi) {
            System.out.println("Morhipo sonuc sayisi Trendyol dan fazladir");
        } else {
            System.out.println("Trendyol sonuc sayisi Morhipo dan fazladir");
        }
    }

    @And("Once urun sayisi fazla olan siteyi kapatiniz")
    public void onceUrunSayisiFazlaOlanSiteyiKapatiniz() {
        System.out.println("Trendyol Title : " + trendyolTitle);
        System.out.println("Morhipo Title : " + morhipoTitle);
        System.out.println("Trendyol Urun Sayisi : " + trendyolSonucSayisi);
        System.out.println("Morhipo Urun Sayisi : " + morhipoSonucSayisi);
        if (morhipoSonucSayisi < trendyolSonucSayisi) {
            ReusableMethods.switchToWindow(trendyolTitle);
            Driver.getDriver().quit();

        } else {
            ReusableMethods.switchToWindow(morhipoTitle);
            Driver.closeDriver();
        }

    }

    @And("Sonra diger sayfayida kapatiniz")
    public void sonraDigerSayfayidaKapatiniz() {

        Driver.getDriver().quit();
    }

}
