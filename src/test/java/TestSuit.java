import PageObject.*;
import javafx.scene.layout.Priority;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegistraonResultPage registraonResultPage = new RegistraonResultPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    EmailAFriend emailAFriend = new EmailAFriend();
    ShoppingCart shoppingCart = new ShoppingCart();
    SignInPage signInPage = new SignInPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test (priority = 0)
    public void userShouldBeAbleToRegisterSuccessfully () {
        //Click on Register
        homePage.clickOnRegister();
        //To verify user is on Registration page
        registerPage.verifyUserIsOnRegistrationPage();
        //Enter all mandatory details
        registerPage.userEnterRegistrationDetails();
        //To verify user register successfully or not
        registraonResultPage.toVerifyUserIsSuccessfullyRegister();
    }

    @Test (priority = 1)
    public void registerUserShouldAbleToReferAProductToFriend () {
        //Click on Register
        homePage.clickOnRegister();
        //To Verify user is on registration page
        registerPage.verifyUserIsOnRegistrationPage();
        //Enter mandatory details
        registerPage.userEnterRegistrationDetails();
        //To verify user should successfully register or not
        registraonResultPage.toVerifyUserIsSuccessfullyRegister();
        //Click on Homepage
        registraonResultPage.clickOnHomePage();
        //click on Feature Product
        homePage.clickOnOneOfFeaturedProduct();
        //To verify user is on build your on computer page or not
        buildYourOwnComputer.toVerifyUserShouldBeOnBuildYourOwnComputerPage();
        //Click on Email a Friend
        buildYourOwnComputer.toClickOnEmailAFriend();
        //To verify user is on Email a friend page
        emailAFriend.ToVerifyUserShouldBeOnEmailAFriendPage();
        //Click on Friends email
        emailAFriend.EnterFriendsEmail();
        //Enter your personal messege
        emailAFriend.EnterPersonalMessage();
        //Click on send email
        emailAFriend.ClickOnSendEmail();
        //To verify Message has been sent successfully or not
        emailAFriend.toVerifyMessageSentSuccessfully();
    }

    @Test (priority = 2)
    public void UnregisterUserShouldNotBeAbleToReferAProductToFriend () {
        //To click on build your own computer
        homePage.clickOnOneOfFeaturedProduct();
        //click on Email a friend
        buildYourOwnComputer.toClickOnEmailAFriend();
        //Enter Friend's Email
        emailAFriend.EnterFriendsEmail();
        //Enter your email
        emailAFriend.enterYourEmailAddress();
        //Enter Personal Message
        emailAFriend.EnterPersonalMessage();
        //Click on Send email
        emailAFriend.ClickOnSendEmail();
        //To Verify failure message display successfully
        emailAFriend.toVerifyFailureMessageShouldComeSuccessfully();

    }

    @Test (priority = 3)
    public void UserShouldBeAbleToBuyProductSuccessfully () {
        //Click on Register
        homePage.clickOnRegister();
        //To verify user on register page
        registerPage.verifyUserIsOnRegistrationPage();
        //Enter all mandatory fields
        registerPage.userEnterRegistrationDetails();
        //To verify user register successfully
        registraonResultPage.toVerifyUserIsSuccessfullyRegister();
        //Click on Homepage
        registraonResultPage.clickOnHomePage();
        //Click on one of the product from Feature Product
        homePage.clickOnOneOfFeaturedProduct();
        //Select Processor and system for Building Computer
        buildYourOwnComputer.selectProcessorSoftware();
        //Click on Add to Cart
        buildYourOwnComputer.clickOnAddToCart();
        //Click on Shopping Cart after Build Your Computer
        buildYourOwnComputer.clickOnShoppingCartAfterBuildComputer();
        //To verify user on Shopping Cart Page
        shoppingCart.toVerifyUserOnShoppingCartPage();
        //Tick on agree terms and condition
        shoppingCart.selectAgreedTermsAndCondition();
        //Click on Checkout
        shoppingCart.clickOnCheckout();
        //Fill all mandatory fields on checkout page
        checkoutPage.fillAllMandatoryFieldsOnCheckoutPage();
        //Click on continue after filling Billing Address details
        checkoutPage.clickOnContinueAfterFillBillingAddressDetails();
        sleep(3000);
        //Select Shipping Method
        checkoutPage.shippingBy2ndDayAir();
        sleep(5000);
        //Click on Continue after Shipping Method selected
        checkoutPage.clickOnContinueAfterShippingMethod();
        //Select Payment by Credit Card
        checkoutPage.selectPaymentByCreditCard();
        //Click on continue after selecting Credit Card
        checkoutPage.clickOnContinueAfterPaymentMethod();
        sleep(3000);
        //Select Mast Card
        checkoutPage.selectMastCard();
        //Enter Card Details with name, number, expiry date & CVV
        checkoutPage.enterCardDetails();
        //Click on Continue after Master Card
        checkoutPage.clickOnContinueAfterMasterCard();
        sleep(3000);
        //Click on confirm button to confirm the order
        checkoutPage.clickOnConfirmAfterMasterCard();
        }

    @Test (priority = 4)
    public void userShouldAbleToCheckoutWithoutRegister () {
        //User on Homepage and Click on one of the Feature Product
        homePage.clickOnOneOfFeaturedProduct();
        //Select Processor and system for Building Computer
        buildYourOwnComputer.selectProcessorSoftware();
        //Click on Add to Cart
        buildYourOwnComputer.clickOnAddToCart();
        //Click on Shopping Cart after Build Your Computer
        buildYourOwnComputer.clickOnShoppingCartAfterBuildComputer();
        //To verify user on Shopping Cart Page
        shoppingCart.toVerifyUserOnShoppingCartPage();
        //Tick on agree terms and condition
        shoppingCart.selectAgreedTermsAndCondition();
        //Click on Checkout
        shoppingCart.clickOnCheckout();
        //Click on Checkout as A Guest
        shoppingCart.clickOnCheckoutAsGuest();
        //Fill all mandatory fields on checkout as guest
        checkoutPage.fillAllMandatoryFieldsOnCheckoutPageAsGuestUser();
        //Click on continue after filling Billing Address details
        checkoutPage.clickOnContinueAfterFillBillingAddressDetails();
        sleep(3000);
        //Select Shipping Method
        checkoutPage.shippingBy2ndDayAir();
        sleep(5000);
        //Click on Continue after Shipping Method selected
        checkoutPage.clickOnContinueAfterShippingMethod();
        //Select Payment by Credit Card
        checkoutPage.selectPaymentByCreditCard();
        //Click on continue after selecting Credit Card
        checkoutPage.clickOnContinueAfterPaymentMethod();
        sleep(3000);
        //Select Mast Card
        checkoutPage.selectMastCard();
        //Enter Card Details with name, number, expiry date & CVV
        checkoutPage.enterCardDetails();
        //Click on Continue after Master Card
        checkoutPage.clickOnContinueAfterMasterCard();
        sleep(3000);
        //Click on confirm button to confirm the order
        checkoutPage.clickOnConfirmAfterMasterCard();
    }
}
