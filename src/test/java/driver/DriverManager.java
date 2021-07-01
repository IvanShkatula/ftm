package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    public static WebDriver getDriver(Config config) {
        if ((config != null ? config : Config.CHROME) == Config.FIRE_FOX) {
            return getFFDriver();
        } else {
            return getChromeDriver();
        }
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chdr90\\chromedriver.exe");
        chromeOptions.addArguments("start-maximized");
        return new ChromeDriver(chromeOptions);
    }

    private static WebDriver getFFDriver() {
        return null;
    }
}
