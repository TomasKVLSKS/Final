package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Driver;

public class Common {
    public static void openLink(String url) {
        Driver.driver.get(url);
    }
        
    public static WebElement findElement(By locator) {
        return Driver.driver.findElement(locator);
    }

    public static void clickElement(By locator) {

    }


    public static void performDoubleClick(By locator) {
        WebElement element = findElement(locator);
        Actions action = new Actions(Driver.driver);

        action.moveToElement(element);
        action.doubleClick();
        action.perform();
    }

}