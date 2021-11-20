package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoPage {

    public SauceDemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//input[@id='user-name'])")
    public WebElement username;
    @FindBy(xpath = "(//input[@id='password'])")
    public WebElement password;
    @FindBy(xpath = "(//input[@id='login-button'])")
    public WebElement loginButonu;
    @FindBy(xpath = "(//div[@class='inventory_item_name'])[1]")
    public WebElement ilkUrun;
    @FindBy(xpath = "(//button[@id='add-to-cart-sauce-labs-backpack'])")
    public WebElement ilkUrunaddToCartButton;
    @FindBy(xpath = "(//div[@id='shopping_cart_container'])")
    public WebElement shopingBox;
    @FindBy(xpath = "(//div[@class='inventory_item_name'])")
    public WebElement productInBox;


}
