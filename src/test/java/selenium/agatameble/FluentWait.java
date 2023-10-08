package selenium.agatameble;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWait {

    static Wait<WebDriver> fluentWait(WebDriver webDriver){
        Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(ElementNotInteractableException.class);

        return wait;
    }

}
