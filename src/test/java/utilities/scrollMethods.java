package utilities;

import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.JSUtils;
import com.techproed.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JSExecutorTest {

    JavascriptExecutor je=(JavascriptExecutor) Driver.getDriver();
    @Test
    public void scrollIntoViewTest() throws InterruptedException {
        /*
        * Given user is on the application url
        * Then verify the text "Recent Blog" is on the page
        * */
        Driver.getDriver().get(ConfigReader.getProperty("application_url"));

        WebElement recentBlog=Driver.getDriver().findElement(By.xpath("//*[.='Recent Blog']"));
//        arguments[0].scrollIntoView(true); => THIS IS USED A LOT
        je.executeScript("arguments[0].scrollIntoView(true);",recentBlog);

//        HARD WAITS-Not recommended
//        Thread.sleep(3000);
//        ReusableMethods.waitFor(3);

//      EXPLICIT WAIT
        ReusableMethods.waitForVisibility(recentBlog,5);

        Assert.assertEquals(recentBlog.getText(),"Recent Blog");
    }

    @Test
    public void scrollIntoViewUtils() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("application_url"));
        WebElement recentBlog=Driver.getDriver().findElement(By.xpath("//*[.='Recent Blog']"));

//        Scrolling down to the element
        JSUtils.scrollIntoVIewJS(recentBlog);

        //Waiting for recent block for 3 second using explicit wait
        ReusableMethods.waitForVisibility(recentBlog,3);

        Assert.assertEquals(recentBlog.getText(),"Recent Blog");
    }
//    @Test
//    public void clickWithJS(){
////        Some elements may not be visible or cannot be easily clicked using selenium click() method
////        In this case, JS clicks works better
//        Driver.getDriver().get(ConfigReader.getProperty("application_url"));
//        WebElement checkAvailabilityButton=Driver.getDriver().findElement(By.xpath("//input[@type='submit']"));
//        JSUtils.clickElementByJS(checkAvailabilityButton);
//    }

    @Test
    public void flashingButton(){
        Driver.getDriver().get(ConfigReader.getProperty("application_url"));
        WebElement checkAvailabilityButton=Driver.getDriver().findElement(By.xpath("//input[@type='submit']"));
//        Changing background color
        JSUtils.changeColor("red",checkAvailabilityButton);
        JSUtils.flash(checkAvailabilityButton);


    }
    @Test
    public void scrollWithCoordinates() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("application_url"));
        WebElement recentBlog=Driver.getDriver().findElement(By.xpath("//*[.='Recent Blog']"));

//        Getting the coordinates of the element
        Point coordinates=recentBlog.getLocation();// (933, 3986); x=933(right/left), y= 3986(up/down)
        System.out.println(coordinates.toString());
//                             window.scrollBy(x coordinate, y coordinate)
        je.executeScript("window.scrollBy(0,3986);");//WORKS FINE BUT WE CAN GIVE THE EXACT COORDINATE OF THE ELEMENT
        je.executeScript("window.scrollBy(0,"+coordinates+");");//coordinates.y = Changing the y coordinate
        Thread.sleep(3000);
        Assert.assertEquals(recentBlog.getText(),"Recent Blog");
    }



//    @Test
//    public void alertTest() throws InterruptedException {
//        Driver.getDriver().get(ConfigReader.getProperty("application_url"));
//        JSUtils.generateAlert("THIS IS JS ALERT");
//    }

}
