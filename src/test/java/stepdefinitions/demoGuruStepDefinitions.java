package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.DemoGuruPage;
import utilities.Driver;

public class demoGuruStepDefinitions {
    DemoGuruPage demoGuruPage=new DemoGuruPage();
    Actions actions=new Actions(Driver.getDriver());

    @Then("Drag and drop the second {int} button to the Amount section in CREDIT SIDE")
    public void drag_and_drop_the_second_button_to_the_amount_section_in_credit_side(Integer int1) {
        actions.dragAndDrop(demoGuruPage.ikinciBesBin,demoGuruPage.creditAmount).perform();

    }
    @Then("Drag and drop the BANK button to the Account section in DEBIT SIDE")
    public void drag_and_drop_the_bank_button_to_the_account_section_in_debit_side() {
        actions.dragAndDrop(demoGuruPage.bankButonu,demoGuruPage.debitAccount).perform();

    }
    @Then("Drag and drop the SALES button to the Account section in CREDIT SIDE")
    public void drag_and_drop_the_sales_button_to_the_account_section_in_credit_side() {

    actions.dragAndDrop(demoGuruPage.salesButonu,demoGuruPage.creditAccount).perform();

    }
    @Then("Drag and drop the {int} button to the Amount section in DEBIT SIDE")
    public void drag_and_drop_the_button_to_the_amount_section_in_debit_side(Integer int1) {
        actions.dragAndDrop(demoGuruPage.birinciBesbin,demoGuruPage.debitAmount).perform();

    }
    @When("PerfectButton visibilty do test")
    public void perfect_button_visibilty_do_test() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(demoGuruPage.perfectButonu.isDisplayed());

    }


}
