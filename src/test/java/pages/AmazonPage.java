package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(id = "sp-cc-accept")
    public WebElement CookiesAccept;
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='a-section a-spacing-small a-spacing-top-small'])")
    public WebElement sonucYazisi;

         @FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
        public WebElement productAtTheTopOfTheList;
        @FindBy(xpath = "(//div[@class='twisterTextDiv text'])")
        public WebElement phoneSize;

        @FindBy(xpath = "//span[@class='a-price-whole']")
        public WebElement prodPrice;
         @FindBy(xpath = "//span[@class='a-price-fraction']")
         public WebElement prodPriceFrac;




        @FindBy(id = "productTitle")
        public WebElement productTitle;

        @FindBy(xpath = "(//span[@class='selection'])[2]")
        public WebElement productColor;

        @FindBy(xpath = "(//span[@class='selection'])[1]")
        public WebElement Size;

        @FindBy(xpath = "(//span[@class='a-size-medium a-color-success'])")
        public WebElement stok;

        @FindBy(xpath = "//p[@class='a-text-left a-size-base']")
        public List<WebElement> productSize;

//        public WebElement productSize(int i){
//
//            return Driver.getDriver().findElement(By.id("size_name_"+i));
//        }

}
