package page.pastebin;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage {

  WebDriver driver = Driver.getWebDriver();
  WebDriverWait wait = new WebDriverWait(driver, 10);

  public String getPasteNameTitle() {
    return driver.findElement(By.xpath("//h1")).getText();
  }

  public String getSyntaxName() {
    return driver.findElement(By.xpath("//a[contains(@href, '/archive/')]")).getText();
  }

  public void waitHeader() {
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1")));
  }

}
