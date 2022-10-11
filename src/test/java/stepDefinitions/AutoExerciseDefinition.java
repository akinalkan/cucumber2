package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AutoExercisePage;
import utilities.ReusableMethods;

import java.io.IOException;

public class AutoExerciseDefinition {

    AutoExercisePage page = new AutoExercisePage();

    @Then("anasayfanin basariyla gorunur oldugunu dogrulayin")
    public void anasayfaninBasariylaGorunurOldugunuDogrulayin() {

        Assert.assertTrue(page.homePage.isDisplayed());
    }

    @Then("test case butonuna tiklayin")
    public void testCaseButonunaTiklayin() {

        page.testCasesButton.click();
    }

    @Then("kullanicinin basariyla test case sayfasina yonlendirildigini dogrulayin")
    public void kullanicininBasariylaTestCaseSayfasinaYonlendirildiginiDogrulayin() {

        Assert.assertTrue(page.testCasesPage.isDisplayed());
    }

    @Then("ilgili ekranin ekran goruntusunu alir")
    public void ilgiliEkraninEkranGoruntusunuAlir() throws IOException {

        ReusableMethods.getScreenshot("testCaseSS");
    }

    @Given("Tarayiciyi baslatarak {string} url'sine gidin")
    public void tarayiciyiBaslatarakUrlSineGidin(String arg0) {
    }

    @When("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void anaSayfaninBasariylaGorunurOldugunuDogrulayin() {
    }

    @And("Test Case buttonu na tiklayin")
    public void testCaseButtonuNaTiklayin() {
    }

    @Then("Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin")
    public void kullanicininTestCaseSayfasinaBasariylaYonlendirildiginiDogrulayin() {
    }

    @And("Ilgili sayfanin ekran goruntusunu alin")
    public void ılgiliSayfaninEkranGoruntusunuAlin() {
    }
}