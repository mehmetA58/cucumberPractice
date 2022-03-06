package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.EBebekPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class eBebekStepDefinitions {
   EBebekPage eBebekPage=new EBebekPage();
   
   @When("{string} icin arama yapar")
   public void icinAramaYapar(String arananURUN) {
      eBebekPage.searchBox.sendKeys(arananURUN+ Keys.ENTER);
   }

   @Then("arama sonucunun {string} icerdigini dogrular")
   public void aramaSonucununIcerdiginiDogrular(String sonucIcerik) {
   Assert.assertTrue(eBebekPage.firstProduct.getText().toUpperCase().contains(sonucIcerik.toUpperCase()));
   }

   @Given("{string} sayfasina gidelim")
   public void sayfasinaGidelim(String URL) {
      Driver.getDriver().get(ConfigReader.getProperty(URL));
   }

   @And("ilk sonuc sayfasinda listelenen urunleri yazdirir")
   public void ilkSonucSayfasindaListelenenUrunleriYazdirir() {
      List<WebElement>productLinks=Driver.getDriver().findElements(By.xpath("(//div[@class='product-title brand-text product-name-txt'])"));
      for (int i = 0; i <productLinks.size() ; i++) {
         System.out.println(i+1+"-"+productLinks.get(i).getText());
      }
   }
}
