package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.DhtmlGoodiesPage;
import utilities.Driver;

import javax.swing.*;

public class dhtmlStepDefinitions {
    DhtmlGoodiesPage dhtmlGoodiesPage=new DhtmlGoodiesPage();

    @Then("DhtmlFill in capitals by country")
    public void dhtml_fill_in_capitals_by_country() {
Actions actions=new Actions(Driver.getDriver());

actions.dragAndDrop(dhtmlGoodiesPage.Rome, dhtmlGoodiesPage.Italy).perform();
actions.dragAndDrop(dhtmlGoodiesPage.Madrid, dhtmlGoodiesPage.Spain).perform();
actions.dragAndDrop(dhtmlGoodiesPage.Oslo, dhtmlGoodiesPage.Norway).
        dragAndDrop(dhtmlGoodiesPage.Copenhagen, dhtmlGoodiesPage.Denmark)
        .dragAndDrop(dhtmlGoodiesPage.Seoul, dhtmlGoodiesPage.SKorea)
        .dragAndDrop(dhtmlGoodiesPage.Stockholm, dhtmlGoodiesPage.Sweden)
        .dragAndDrop(dhtmlGoodiesPage.Washington, dhtmlGoodiesPage.UnitedStates)
        .perform();

Assert.assertTrue(dhtmlGoodiesPage.GreenLight.isDisplayed());
    }

}
