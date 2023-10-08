package selenium.agatameble;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static selenium.agatameble.ExplicitWait.explicitWait5secs;
import static selenium.agatameble.FluentWait.fluentWait;

public class AgataMebleE2E {

    @Test
    public void check1(){

        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.agatameble.pl/");

        // Implicit wait
//        webDriver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();

        // Explicit wait
//        explicitWait5secs(webDriver)
//                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#onetrust-accept-btn-handler")))
//                .click();

        // Fluent wait
        fluentWait(webDriver)
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#onetrust-accept-btn-handler")))
                .click();

        /*
        $$("#js-mainMenu > ul > li:nth-of-type(2)")
        $$("#js-mainMenu > ul > li > a[href='https://www.agatameble.pl/kuchnia']")
        $x("//*[@id='js-mainMenu']//a[text()=' Kuchnie i AGD ']")
         */

        System.out.println("asd");

        webDriver.quit();

    }
}
