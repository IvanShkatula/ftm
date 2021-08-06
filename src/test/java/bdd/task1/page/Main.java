package bdd.task1.page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

  WebDriver driver = Driver.getWebDriver();

  @Given("actor open create account page")
  public void openMainPage() {
    String url = "https://www.walmart.com/account/signup?returnUrl=%2Faccount%3Fr%3Dyes";
    driver.get(url);
  }

  @When("actor create account with {string} firstname, {string} lastname, {string} email , {string} password")
  public void createAccount(String firstname, String lastname, String emailAddress, String password) {
    driver.findElement(By.id("first-name-su")).sendKeys(firstname);
    driver.findElement(By.id("last-name-su")).sendKeys(lastname);
    driver.findElement(By.id("email-su")).sendKeys(emailAddress);
    driver.findElement(By.id("password-su")).sendKeys(password);
    driver.findElement(By.xpath("//button[@data-tl-id='signup-submit-btn']")).click();
  }

 @And("actor search product by {string} value")
  public void searchBySearchBox(String searchValue) {
    driver.findElement(By.id("global-search-input")).sendKeys(searchValue);
    driver.findElement(By.id("global-search-input")).submit();
  }
}
