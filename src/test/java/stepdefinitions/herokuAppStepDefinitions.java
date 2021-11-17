package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuAppPage;

public class herokuAppStepDefinitions {
    HerokuAppPage herokuAppPage=new HerokuAppPage();



    @Then("Add Element butonuna tiklayin")
    public void add_element_butonuna_tiklayin() throws InterruptedException {
        Thread.sleep(2000);
        herokuAppPage.addElementButonu.click();

    }
    @Then("Delete butonu’nun gorunur oldugunu test edin")
    public void delete_butonu_nun_gorunur_oldugunu_test_edin() {
        herokuAppPage.deleteButonu.isDisplayed();
        Assert.assertTrue(herokuAppPage.deleteButonu.isDisplayed());

    }
    @Then("Delete tusuna tiklayalim")
    public void delete_tusuna_tiklayalim() {
        herokuAppPage.deleteButonu.click();

    }


    @Then("herokuappBasariliGirisDogrula")
    public void herokuappbasariligirisdogrula() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(herokuAppPage.basariliGirisYazisi.isDisplayed());
    }
}
