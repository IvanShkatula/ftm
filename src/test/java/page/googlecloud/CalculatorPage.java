package page.googlecloud;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage {
  WebDriver driver = Driver.getWebDriver();
  WebDriverWait wait = new WebDriverWait(driver, 20);


  public void waitCalculatorPage() {
    String parentFrameXpath = "//iframe[@src='/products/calculator/index_760873447570f9085fc684cb27bac85599c029923272009bcca39da816762d7a.frame']";
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(parentFrameXpath)));
    driver.switchTo().frame(driver.findElement(By.xpath(parentFrameXpath)));
    driver.switchTo().frame("myFrame");
  }

  public void setNumberOfInstance(String numberOfInstance) {
    driver.findElement(By.xpath(".//md-input-container[1]/input")).sendKeys(numberOfInstance);

  }

  public void chooseN1Series() throws InterruptedException {
    driver.findElement(By.xpath(".//form/div[6]/div[1]/md-input-container[1]//span[2]")).click();
    Thread.sleep(500);
    driver.findElement(By.xpath(".//body/div[3]//md-option[1]")).click();
  }

  public void chooseMachineType() throws InterruptedException {
    driver.findElement(By.xpath(".//form/div[7]/div[1]/md-input-container[1]//span[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath(".//body/div[4]//md-optgroup[3]/md-option[4]")).click();
  }

  public void addGPUs() {
    driver.findElement(By.xpath(".//form/div[9]//md-checkbox/div[1]")).click();
  }

  public void chooseOneGPU() throws InterruptedException {
    driver.findElement(By.id("select_value_label_413"));
    driver.findElement(By.id("select_option_420")).click();
  }

  public void setGPUType() throws InterruptedException {
    driver.findElement(By.xpath(".//form/div[10]/div[1]/div[1]/div[1]/md-input-container[2]/md-select/md-select-value"));
    Thread.sleep(500);
    driver.findElement(By.xpath(".//body/div[6]//md-option[4]")).click();
  }

  public void setDatacenterLocation() {
    driver.findElement(By.xpath(".//form/div[12]//md-select-value")).click();
    driver.findElement(By.xpath(".//body/div[7]//md-option[10]")).click();
  }

  public void setCommittedUsage() {
    driver.findElement(By.id("select_value_label_64")).click();
    driver.findElement(By.id("select_option_98")).click();
  }

  public void addToEstimate() {
    driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[16]/button")).click();
  }

}
