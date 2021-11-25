package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import utilities.Driver;

public class DemoGuruPage {

    public DemoGuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li[@id='fourth'])[1]")
    public WebElement birinciBesbin;

    @FindBy(xpath = "(//li[@id='fourth'])[2]")
    public WebElement ikinciBesBin;

    @FindBy(xpath = "(//li[@id='credit2'])")
    public WebElement bankButonu;

    @FindBy(xpath = "(//li[@id='credit1'])")
    public WebElement salesButonu;

    @FindBy(xpath = "(//div[@class='ui-widget-content'])[2]")
    public WebElement debitAccount;

  @FindBy(xpath = "(//div[@class='ui-widget-content'])[3]")
    public WebElement debitAmount;

  @FindBy(xpath = "(//div[@class='ui-widget-content'])[4]")
    public WebElement creditAccount;

  @FindBy(xpath = "(//div[@class='ui-widget-content'])[5]")
    public WebElement creditAmount;

@FindBy(xpath = "(//a[@class='button button-green'])[1]")
    public WebElement perfectButonu;
}
