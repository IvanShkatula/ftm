import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.selenium.dev/");
    Thread.sleep(1000);
    driver.quit();
  }
}
