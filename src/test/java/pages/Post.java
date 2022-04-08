package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Post {

    static By locator = By.xpath("//*[@id='menu-collapse']");
    static WebElement element = Common.findElement(locator);

    public static void kazkoksveiksmas() {
        By logotipoAdresas = By.xpath("//*[@id='menu-collapse']");
        Common.performDoubleClick(logotipoAdresas);
    }

    public static void ivestiReiksmeIKonkretuLaukeli() {
        By adresas = By.xpath("");
        Common.sendKeys(adresas);
    }
}
