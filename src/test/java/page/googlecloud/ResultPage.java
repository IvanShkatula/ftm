package page.googlecloud;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage {

  WebDriver driver = Driver.getWebDriver();
  WebDriverWait wait = new WebDriverWait(driver, 10);
  String xpathForResultPage = "//a[@href='https://cloud.google.com/products/calculator']/b[text() = 'Google Cloud Platform Pricing Calculator']";

  public void openResult() {
    driver.findElement(By.xpath(xpathForResultPage)).click();
  }

  public void waitResult() {
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathForResultPage)));
  }
}
