package steps;

import org.junit.Assert;
import org.junit.Test;
import page.pastebin.MainPage;
import page.pastebin.ResultPage;

public class Pastebin extends BaseSteps {
  MainPage mainPage = new MainPage();
  ResultPage resultPage = new ResultPage();


  @Test
  public void iCanWin() {
    mainPage.openMainPage();
    mainPage.setCode("Hello from WebDriver");
    mainPage.setPasteExpiration();
    mainPage.setPasteName("helloweb");
  }

  @Test
  public void bringItOn() {
    String textcodeForBringItOn = "git config --global user.name  \"New Sheriff in Town\"\n" +
        "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
        "git push origin master --force";
    String pasteNameText = "how to gain dominance among developers";
    String syntaxName = "Bash";

    mainPage.openMainPage();
    mainPage.setCode(textcodeForBringItOn);
    mainPage.setPasteExpiration();
    mainPage.setSyntaxHighlighting(syntaxName);
    mainPage.setPasteName(pasteNameText);
    mainPage.savePaste();
    resultPage.waitHeader();
    Assert.assertEquals(resultPage.getPasteNameTitle(), pasteNameText);
    Assert.assertEquals(resultPage.getSyntaxName(), syntaxName);
  }
}
