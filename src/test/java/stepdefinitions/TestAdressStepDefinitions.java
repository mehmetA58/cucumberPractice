package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.TestAdressPAge;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class TestAdressStepDefinitions {
    TestAdressPAge testAdressPAge=new TestAdressPAge();

    @Then("TestAdreesAnasayfa Sign in butonuna tiklayin")
    public void testadreesanasayfaSignInButonunaTiklayin() {
        testAdressPAge.anasayfaSignInButonu.click();
    }

    @And("TestAdressKullanıcı adını ve şifreyi girin")
    public void testadresskullanıcıAdınıVeŞifreyiGirin() {
        testAdressPAge.eamailTextBox.sendKeys("testtechproed@gmail.com");
        testAdressPAge.passwordTextBox.sendKeys("Test1234!");
        testAdressPAge.loginSignInButonu.click();
        
    }

    @Then("Expecteduserid'yi dogrulayon")
    public void expecteduseridYiDogrulayon() {
        Assert.assertTrue(testAdressPAge.basariliGirisElementi.getText().equals("testtechproed@gmail.com"));
    }

    @And("Sayfada kac tane link oldugunu bulun.")
    public void sayfadaKacTaneLinkOldugunuBulun() {
      List<WebElement>links=new ArrayList<>(Driver.getDriver().findElements(By.tagName("a")));
        System.out.println(links.size()+" tane link var.");
    }

    @Then("linklerin yazılarını yazdiralim")
    public void linklerinYazılarınıYazdiralim() {
        List<WebElement>links=new ArrayList<>(Driver.getDriver().findElements(By.tagName("a")));
        String linkler;
        for (WebElement w:links) {
          linkler= w.getText();
            System.out.println(linkler);
        }
    }
}
