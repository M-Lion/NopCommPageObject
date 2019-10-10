package PageObject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utils {
    private By _firstName = By.xpath("//input[@id='FirstName']");
    private By _lastName = By.xpath("//input[@id='LastName']");
    private By _email = By.xpath("//input[@id='Email']");
    private By _password = By.xpath("//input[@id='Password']");
    private By _confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    private By _registerButton = By.xpath("//input[@id='register-button']");
    private By _actualResult = By.xpath("//div[@class='page-title']");

    public void verifyUserIsOnRegistrationPage () {
        String expectedResult = "Register";
        String actualResult = extractText(_actualResult);
        Assert.assertEquals (actualResult,expectedResult);
    }

    public void userEnterRegistrationDetails() {
        enterText(_firstName,getProperty("FirstName"));
        enterText(_lastName, getProperty("LastName"));
        enterText(_email, generateEmail());
        enterText(_password,getProperty("Password"));
        enterText(_confirmPassword, getProperty("ConfirmPassword"));
        clickOnElement(_registerButton);
    }
}