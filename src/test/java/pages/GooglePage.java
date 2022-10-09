package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class GooglePage {
    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//input[@class='gLFyf gsfi']")
    public WebElement googleSearchBox;
    @FindBy (xpath = "//h3[contains(text(),\"En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da\")]")
    public WebElement trendyolAdresi;
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public  WebElement trendtolCerezKabul;

    @FindBy(xpath = "//input[@data-testid='suggestion']")
    public WebElement trendyolAramaCubugu;

    @FindBy(xpath = "//div[@class='dscrptn']")
    public WebElement trendyolAramaSonucu;

    @FindBy(xpath = "//input[@id='pw-search-input']")
    public WebElement morhipoAramaKutusu;

    @FindBy(xpath = "//span[@id='total-product-count']")
    public WebElement morhipoAramaSonucu;

}
