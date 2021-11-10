package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import pages.FacebookPage;

public class facebookStepDefinitions {

    FacebookPage facebookPage=new FacebookPage();
    Faker faker=new Faker();
    @Then("facebookEmailTextboxa email yazdiralim")
    public void facebook_email_textboxa_email_yazdiralim() {
        facebookPage.facebookEamaiilText.sendKeys(faker.internet().emailAddress());

    }
    @Then("facebookPasswordTextboxa sifre yazdiralim")
    public void facebook_password_textboxa_sifre_yazdiralim() {
        facebookPage.facebookPasswordText.sendKeys(faker.internet().password());

    }
    @Then("facebook login butonunu tıklayalım")
    public void facebook_login_butonunu_tıklayalım() {
facebookPage.facebookLoginButon.click();
    }
    @Then("facebookBasarisizGiris dogrulama")
    public void facebook_basarisiz_giris_dogrulama() {
facebookPage.facebookBasarisizLoginYazisi.isDisplayed();
    }
}
