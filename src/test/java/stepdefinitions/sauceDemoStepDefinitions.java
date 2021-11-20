package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SauceDemoPage;

public class sauceDemoStepDefinitions {

    SauceDemoPage sauceDemoPage=new SauceDemoPage();

    @Then("Username kutusuna “standard_user” yazdirin")
    public void username_kutusuna_standard_user_yazdirin() {
       sauceDemoPage.username.sendKeys("standard_user");

    }

    @Then("Password kutusuna “secret_sauce” yazdirin")
    public void password_kutusuna_secret_sauce_yazdirin() {
    sauceDemoPage.password.sendKeys("secret_sauce");
    }
    @When("Login tusuna basin")
    public void login_tusuna_basin() {
        sauceDemoPage.loginButonu.click();
    }
    @Then("Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin")
    public void ilk_urunun_ismini_kaydedin_ve_bu_urunun_sayfasina_gidin() {
       String ilkUrun=sauceDemoPage.ilkUrun.getText();
        System.out.println("ilkUrun = " + ilkUrun);
        sauceDemoPage.ilkUrun.click();

    }
    @Then("Add to Cart butonuna basin")
    public void add_to_cart_butonuna_basin() {
      sauceDemoPage.ilkUrunaddToCartButton.click();
    }
    @Then("Alisveris sepetine tiklayin")
    public void alisveris_sepetine_tiklayin() {
        sauceDemoPage.shopingBox.click();

    }
    @Then("Sectiginiz urunun basarili olarak sepete eklendigini control edin")
    public void sectiginiz_urunun_basarili_olarak_sepete_eklendigini_control_edin() {
       Assert.assertTrue(sauceDemoPage.ilkUrun.getText().equals(sauceDemoPage.productInBox.getText()));
    }
}
