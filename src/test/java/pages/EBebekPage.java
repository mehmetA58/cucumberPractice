package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import utilities.Driver;

public class EBebekPage {
    public EBebekPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "(//input[@id='js-site-search-input'])")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='product-title brand-text product-name-txt'])[1]")
    public WebElement firstProduct;

}
