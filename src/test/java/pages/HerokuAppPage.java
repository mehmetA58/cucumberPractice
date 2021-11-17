package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuAppPage {
    public HerokuAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "(//button[@onclick='addElement()'])")
    public WebElement addElementButonu;

    @FindBy(xpath = "(//button[@onclick='deleteElement()'])")
    public WebElement deleteButonu;

    @FindBy(xpath = "(//div[@class='example'])")
    public WebElement basariliGirisYazisi;



}
