package PageObject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutPage extends Utils {

    private By _toVerifyUserOnCheckoutPage = By.xpath("//div[@class='page-title']");
    private By _toSelectCounty = By.id("BillingNewAddress_CountryId");
    private By _writeCityNameInCheckout = By.id("BillingNewAddress_City");
    private By _writeAddress = By.id("BillingNewAddress_Address1");
    private By _writePostCode = By.id("BillingNewAddress_ZipPostalCode");
    private By _writePhoneNumber = By.id("BillingNewAddress_PhoneNumber");
    private By _clickOnContinueAfterBillingAddress = By.id("billing-buttons-container");
    private By _selectShippingMethod = By.xpath("//input[@class='button-1 shipping-method-next-step-button']");
    private By _clickOnContinueAfterShippingMethod = By.id("shipping-method-buttons-container");
    private By _selectPaymentByCreditCard = By.id("paymentmethod_1");
    private By _clickOnContinueAfterPaymentMethod = By.id("payment-method-buttons-container");
    private By _selectMasterCard = By.className("dropdownlists");
    private By _enterCardHolderName = By.id("CardholderName");
    private By _enterCardNumber = By.id("CardNumber");
    private By _selectExpiryMonth = By.id("ExpireMonth");
    private By _selectExpiryYear = By.id("ExpireYear");
    private By _clickOnContinueAfterMasterCard = By.xpath("//input[@class='button-1 payment-info-next-step-button']");
    private By _clickOnConfirmAfterMasterCard = By.xpath("//input[@class='button-1 confirm-order-next-step-button']");
    private By _enterFirstNameAsGuestUser = By.id("BillingNewAddress_FirstName");
    private By _enterLastNameAsGuestUser = By.id("BillingNewAddress_LastName");
    private By _enterYourEmailAddressAsGuestUser = By.id("BillingNewAddress_Email");

    //To verify user on Checkout Page
    public void toVerifyUserOnCheckoutPage () {
        String expectedResultCheckout = "Checkout";
        String actualResultCheckout = extractText(_toVerifyUserOnCheckoutPage);
        Assert.assertEquals(actualResultCheckout,expectedResultCheckout);
    }
    //Fill all mandatory fields on checkout page as register user
    public void fillAllMandatoryFieldsOnCheckoutPage () {
        selectByValue(_toSelectCounty,"233");
        enterText(_writeCityNameInCheckout,getProperty("City"));
        enterText(_writeAddress,getProperty("Address"));
        enterText(_writePostCode,getProperty("PostCode"));
        enterText(_writePhoneNumber,getProperty("PhoneNumber"));
    }
    //Click on continue button after Billing Address
    public void clickOnContinueAfterFillBillingAddressDetails () {
        clickOnElement(_clickOnContinueAfterBillingAddress);
    }
    //Select Shipping Method
    public void shippingBy2ndDayAir () {
        clickOnElement(_selectShippingMethod);
    }
    //Click on Continue after shipping method select
    public void clickOnContinueAfterShippingMethod () {
        waitForClickable(_clickOnContinueAfterShippingMethod,10);
    }
    //Pay by Credit Card
    public void selectPaymentByCreditCard () {
        clickOnElement(_selectPaymentByCreditCard);
    }
    //Click on continue after payment method
    public void clickOnContinueAfterPaymentMethod () {
        clickOnElement(_clickOnContinueAfterPaymentMethod);
    }
    //Select Mast Card
    public void selectMastCard () {
        selectByVisibleText(_selectMasterCard,"Master card");
    }
    //Enter card holder name
    public void enterCardDetails () {
        enterText(_enterCardHolderName,getProperty("CardHolderName"));
        enterText(_enterCardNumber,getProperty("CardNumber"));
        selectByValue(_selectExpiryMonth,"10");
        selectByValue(_selectExpiryYear,"2020");
        enterText(By.id("CardCode"),getProperty("CVV"));
    }
    //Click on Continue button after Master Card
    public void clickOnContinueAfterMasterCard () {
        clickOnElement(_clickOnContinueAfterMasterCard);
    }
    //Click on Confirm
    public void clickOnConfirmAfterMasterCard () {
        clickOnElement(_clickOnConfirmAfterMasterCard);
    }
    //Fill all mandatory fields on checkout page as guest user
    public void fillAllMandatoryFieldsOnCheckoutPageAsGuestUser () {
        enterText(_enterFirstNameAsGuestUser,getProperty("FirstName"));
        enterText(_enterLastNameAsGuestUser,getProperty("LastName"));
        enterText(_enterYourEmailAddressAsGuestUser,getProperty("YourEmail"));
        selectByValue(_toSelectCounty,"233");
        enterText(_writeCityNameInCheckout,getProperty("City"));
        enterText(_writeAddress,getProperty("Address"));
        enterText(_writePostCode,getProperty("PostCode"));
        enterText(_writePhoneNumber,getProperty("PhoneNumber"));
    }




}
