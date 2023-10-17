package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinition {
    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici amazonUrl anasayfaya gider")
    public void kullanici_amazon_url_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Given("arama kutusuna Nutella yazip aratir")
    public void arama_kutusuna_nutella_yazip_aratir() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String expectedIcerik= "Nutella";
        String actualAramaSonucu =amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


    @And("arama kutusuna Java yazip aratir")
    public void aramaKutusunaJavaYazipAratir() {
        amazonPage.aramaKutusu.sendKeys("Java"+Keys.ENTER);

    }

    @Then("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String expectedIcerik= "Java";
        String actualAramaSonucu =amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }


    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @Then("arama kutusuna {string} yazip aratir")
    public void arama_kutusuna_yazip_aratir(String arananUrun) {
        amazonPage.aramaKutusu.sendKeys(arananUrun+Keys.ENTER);

    }
    @Then("arama sonuclarinin {string} icerdigini test eder")
    public void arama_sonuclarinin_icerdigini_test_eder(String arananUrun) {
       String actualSonucYazisi =amazonPage.sonucYaziElementi.getText();
       Assert.assertTrue(actualSonucYazisi.contains(arananUrun));
    }


    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("ilk urunu tiklar")
    public void ilkUrunuTiklar() {
        amazonPage.ilkUrunElementi.click();
    }

    @And("urun isminin {string} icerdigini test eder")
    public void urunIsmininIcerdiginiTestEder(String arananUrun) {
        String actuaIlkUrunElementi= amazonPage.ilkUrunIsimElementi.getText();
        Assert.assertTrue(actuaIlkUrunElementi.contains(arananUrun));
    }


}
