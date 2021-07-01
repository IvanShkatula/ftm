package steps;

import driver.Config;
import driver.Driver;
import org.junit.After;
import org.junit.Before;

public class BaseSteps {

  @Before
  public void initDriver() {
    Driver.setConfig(Config.CHROME);
  }

  @After
  public void closeDriver() {
    Driver.destroy();
  }
}




