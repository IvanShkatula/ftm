package steps;

import org.junit.Test;
import page.googlecloud.CalculatorPage;
import page.googlecloud.MainPageGoogle;
import page.googlecloud.ResultPage;

public class Google extends BaseSteps {

  MainPageGoogle mainPageGoogle = new MainPageGoogle();
  ResultPage resultPage = new ResultPage();
  CalculatorPage calculatorPage = new CalculatorPage();

  @Test
  public void hurtMePlenty() throws InterruptedException {
    String searchText = "Google Cloud Platform Pricing Calculator";

    mainPageGoogle.openMainPage();
    mainPageGoogle.searchInPortal(searchText);
    resultPage.waitResult();
    resultPage.openResult();
    calculatorPage.waitCalculatorPage();
    calculatorPage.setNumberOfInstance("4");
    calculatorPage.chooseN1Series();
    calculatorPage.chooseMachineType();
    calculatorPage.addGPUs();
    calculatorPage.chooseOneGPU();
    calculatorPage.setGPUType();
    calculatorPage.setDatacenterLocation();
    calculatorPage.setCommittedUsage();
    calculatorPage.addToEstimate();
  }
}
