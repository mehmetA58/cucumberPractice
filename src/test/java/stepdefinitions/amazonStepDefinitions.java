package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class amazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @When("{string} için arama yapar")
    public void icin_arama_yapar(String aranacakKelime) {
        amazonPage.searchBox.sendKeys(aranacakKelime + Keys.ENTER);

    }

    @Then("sonucun java icerdigini test eder")
    public void sonucun_java_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains("java"));
        System.out.println("sonuc yazisi : " + amazonPage.sonucYazisi.getText());
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


    @Then("Amazonda görüntülenen ilgili sonuçların sayısını yazdırın")
    public void amazondaGoruntulenenIlgiliSonuclarinSayisiniYazdirin() {
        System.out.println("amazon sonucYazisi = " + amazonPage.sonucYazisi.getText());
    }

    @And("Amazonda görüntülenen ilgili sonuclar {string} iceriyormu")
    public void amazondaGoruntulenenIlgiliSonuclarIceriyormu(String arananKelime) {
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains(arananKelime));
    }

    @And("resimleri indirir")
    public void resimleriIndirir() throws IOException {
        //WebElement resim= Driver.getDriver().findElement(By.xpath("(//img[@class='s-image'])"));
        List<WebElement> resim = (List<WebElement>) Driver.getDriver().findElements(By.xpath("//img[@class='s-image']"));
        for (int i = 1; i < resim.size(); i++) {
            String resimSRC = resim.get(i).getAttribute("src");
            URL resimURL = new URL(resimSRC);
            BufferedImage resmiKaydet = ImageIO.read(resimURL);
            ImageIO.write(resmiKaydet, "png", new File("pictureStore/AmazonArama" + i + ".png"));
            Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
    }

}