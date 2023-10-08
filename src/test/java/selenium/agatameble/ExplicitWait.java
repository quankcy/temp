package selenium.agatameble;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    static Wait<WebDriver> explicitWait2secs(WebDriver webDriver){
        return explicitWaitSecs(webDriver, 2);
    }

    static Wait<WebDriver> explicitWait5secs(WebDriver webDriver){
        return explicitWaitSecs(webDriver, 5);
    }

    static Wait<WebDriver> explicitWaitSecs(WebDriver webDriver, int timeout){
        Wait<WebDriver> wait = new WebDriverWait(webDriver, Duration.ofSeconds(timeout));
        return wait;
    }

}
