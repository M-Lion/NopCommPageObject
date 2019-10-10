package PageObject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriend extends Utils {

    private By _actualResult = By.xpath("//div[@class='page-title']");
    private By _enterFriendsEmail = By.xpath("//input[@class='friend-email']");
    private By _enterPersonalMessage = By.id("PersonalMessage");
    private By _clickOnSendEmail = By.xpath("//input[@name='send-email']");
    private By _actualResult1 = By.xpath("//div[@class='result']");
    private By _enterYourEmail = By.xpath("//input[@class='your-email']");
    private By _actualResult2 = By.xpath("//div[@class='message-error validation-summary-errors']");

    //To Verify user is on email a friend page
    public void ToVerifyUserShouldBeOnEmailAFriendPage () {
        String expectedResult = "Email a friend";
        String actualResult = extractText(_actualResult);
        Assert.assertEquals(actualResult,expectedResult);
    }

    //Enter Friend's email
    public void EnterFriendsEmail() {
        enterText(_enterFriendsEmail,getProperty("Friend'sEmail"));
    }

    //Enter Personal message
    public void EnterPersonalMessage () {
        enterText(_enterPersonalMessage,"Take it or Leave it");
    }

    //Click on send email
    public void ClickOnSendEmail () {
        clickOnElement(_clickOnSendEmail);
    }

    //To verify message has been sent successfully or not
    public void toVerifyMessageSentSuccessfully () {
        String expectedResult1 = "Your message has been sent.";
        String actualResult1 = extractText(_actualResult1);
        Assert.assertEquals(actualResult1,expectedResult1);
    }

    //Enter your email address
    public void enterYourEmailAddress () {
        enterText(_enterYourEmail,getProperty("YourEmail"));
    }

    //To verify failure message should come successfully
    public void toVerifyFailureMessageShouldComeSuccessfully () {
        String expectedResult2 = "Only registered customers can use email a friend feature";
        String actualResult2 = extractText(_actualResult2);
        Assert.assertEquals(actualResult2,expectedResult2);
    }

}
