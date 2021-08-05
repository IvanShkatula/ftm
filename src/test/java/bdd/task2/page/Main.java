package bdd.task2.page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {

  WebDriver driver = Driver.getWebDriver();

  @Given("actor opens sign up page")
  public void openSignUpPage() {
    String url = "https://trello.com/signup";
    driver.get(url);
  }

  @Then("actor enter {string} email")
  public void enterEmail(String email) {
    driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys(email);
    driver.findElement(By.xpath("//input[@id = 'signup-submit']")).click();
  }

  @And("actor enter {string} full name")
  public void enterFullName(String fullName) {
    driver.findElement(By.xpath("//input[@id = 'displayName']")).sendKeys(fullName);
    driver.findElement(By.xpath("//button[@id = 'signup-submit']")).click();
  }

  @And("actor click continue button")
  public void clickContinueButton() {
    driver.findElement(By.xpath("data-test-id='moonshot-continue-button'")).click();
  }

  @And("actor skip trial")
  public void skipTrial() {
    driver.findElement(By.xpath("//button[@data-test-id='moonshot-start-free-account']")).click();
  }

  @Then("actor clicks lets go button")
  public void clickLetsGoButton() {
    driver.findElement(By.xpath("//button[@data-test-id='moonshot-success-button']")).click();
  }

  @Given("actor opens login page")
  public void openLoginPage() {
    String url = "https://trello.com/login";
    driver.get(url);
  }

  @When("actor enter {string} email and {string} password")
  public void enterCredentials(String email, String password) {
    driver.findElement(By.xpath("//input[@id = 'user']")).sendKeys(email);
    driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(password);
    driver.findElement(By.xpath("//input[@id = 'login']")).click();
  }

  @And("actor opens profile page")
  public void openProfile() {
    driver.findElement(By.xpath("//button[@data-test-id='header-member-menu-button']")).click();
    driver.findElement(By.xpath("//a[@data-test-id='header-member-menu-profile']")).click();
  }

  @And("actor verifies profile name is equals {string}")
  public void verifyProfile(String expectedProfileName) {
    String actualProfileName = driver.findElement(By.xpath("//div[@id='content']//div[2]/span[1]")).getText();
    Assert.assertEquals(expectedProfileName, actualProfileName);
  }

  @And("actor opens and verifies activity tab")
  public void openActivityTab() {
    String xpath = "//a[@data-tab='activity']";
    driver.findElement(By.xpath(xpath)).click();
    Assert.assertEquals("Activity", driver.findElement(By.xpath(xpath)).getText());
  }

  @And("actor opens and verifies cards tab")
  public void openCardsTab() {
    String xpath = "//a[@data-tab='cards']";
    driver.findElement(By.xpath(xpath)).click();
    Assert.assertEquals("Cards", driver.findElement(By.xpath(xpath)).getText());
  }

  @And("actor opens and verifies setting tab")
  public void openSettingsTab() {
    String xpath = "//a[@data-tab='settings']";
    driver.findElement(By.xpath(xpath)).click();
    Assert.assertEquals("Settings", driver.findElement(By.xpath(xpath)).getText());
  }

  @And("actor opens and verifies trello tab")
  public void openTrelloGoldTab() {
    driver.findElement(By.xpath("//a[@data-tab='trelloGold']")).click();
  }

  @And("actor opens and verifies visibility tab")
  public void openProfileAndVisibilityTab() {
    String xpath = "//a[@data-tab='profile']";
    driver.findElement(By.xpath(xpath)).click();
    Assert.assertEquals("Profile and visibility", driver.findElement(By.xpath(xpath)).getText());
  }


}
