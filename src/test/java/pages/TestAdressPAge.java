package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestAdressPAge {
    public TestAdressPAge(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(id = "sign-in")
    public WebElement anasayfaSignInButonu;
    @FindBy(id = "session_email")
    public WebElement eamailTextBox;
    @FindBy(id = "session_password")
    public WebElement passwordTextBox;
    @FindBy(xpath = "(//input[@name='commit'])")
    public WebElement loginSignInButonu;
    @FindBy(xpath = "(//span[@class='navbar-text'])")
    public WebElement basariliGirisElementi;



}
