package bdd.task1.page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en_scouse.An;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchPage {

  WebDriver driver = Driver.getWebDriver();

  @And("actor open product page")
  public void openProductPage() {
    driver.findElement(By.xpath("data-automation-id='search-result-gridview-items'")).click();
  }

  @And("actor add product to cart")
  public void addToCart() {
    driver.findElement(By.xpath("//button[@class='button spin-button prod-ProductCTA--primary button--primary']")).click();
  }

  @And("actor open his cart")
  public void openCart() {
    driver.findElement(By.xpath("//button[@data-automation-id='pac-pos-view-cart']")).click();
  }

  @Then("actor verifies if his cart is not empty")
  public void checkListOfCarts() {
   List<WebElement> list = driver.findElements(By.xpath("//div[@data-collection-element='true']"));
   boolean result = false;
   if (list.size() != 0) {
     result = true;
   }
    Assert.assertTrue(result);
  }
}
