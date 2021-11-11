package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class amazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @When("{string} için arama yapar")
    public void icin_arama_yapar(String aranacakKelime) {
        amazonPage.searchBox.sendKeys(aranacakKelime+ Keys.ENTER);

    }
    @Then("sonucun java icerdigini test eder")
    public void sonucun_java_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("java"));
        System.out.println("sonuc yazisi : "+amazonPage.sonucYazisi.getText());
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.getDriver().quit();
    }


    @Given("{string} ana sayfasina gidelim")
    public void anaSayfasinaGidelim(String sayfaURL) {
        Driver.getDriver().get(ConfigReader.getProperty(sayfaURL));
    }


    @And("Sayfa basliginin \\(title) {string} icerdigi dogrulayin.")
    public void sayfaBasligininTitleIcerdigiDogrulayin(String title) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }

    @And("Sayfa URL’inin {string} oldugunu dogrulayin")
    public void sayfaURLIninOldugunuDogrulayin(String URL) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().equals(URL));
    }



}
