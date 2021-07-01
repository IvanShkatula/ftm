package page.googlecloud;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageGoogle {

  WebDriver driver = Driver.getWebDriver();

  public void openMainPage() {
    String url = "https://cloud.google.com/";
    driver.get(url);
  }

  public void searchInPortal(String searchText) {
    driver.findElement(By.xpath("//input")).sendKeys(searchText);
    driver.findElement(By.xpath("//input")).submit();
  }
}
