package PageObject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class SignInPage extends Utils {

    private By _toVerifyUserOnSignInPage = By.xpath("//div[@class='page-title']");
    private By _writeEmailAddressOnCheckout = By.id("Email");


    //To Verify user on checkout as a guest page
    public void toVerifyUserOnSignInPage () {
        String expectedResult = "Welcome, Please Sign In!";
        String actualResult = extractText(_toVerifyUserOnSignInPage);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //Enter Email address
    public void enterEmailAddressOnCheckout () {
        enterText(_writeEmailAddressOnCheckout,generateEmail());
    }

}
