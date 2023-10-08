package selenium.agatameble;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgataMebleE2E {

    @Test
    public void check1(){

        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.agatameble.pl/");

        System.out.println("asd");

        webDriver.quit();

    }
}
