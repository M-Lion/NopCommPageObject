package PageObject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistraonResultPage extends Utils {

    private By _actualResult = By.className("result");
    private By _clickOnHomePage = By.xpath("//img[@alt='nopCommerce demo store']");

    public void toVerifyUserIsSuccessfullyRegister () {
        String expectedResult = "Your registration completed";
        String actualResult = extractText(_actualResult);
        Assert.assertEquals(actualResult,expectedResult);
    }
    public void clickOnHomePage (){
        clickOnElement(_clickOnHomePage);
    }

}
