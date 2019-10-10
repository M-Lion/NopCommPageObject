package PageObject;

import org.openqa.selenium.By;

public class ShoppingCart extends Utils {

    private By _toVerifyUserOnShoppingCartPage = By.linkText("Shopping cart");
    private By _selectAgreedTermsAndCondition = By.id("termsofservice");
    private By _clickOnCheckout = By.id("checkout");
    private By _clickOnCheckoutAsGuest = By.xpath("//input[@class='button-1 checkout-as-guest-button']");

    //To verify user is on shopping cart page
    public void toVerifyUserOnShoppingCartPage () {
        String expectedResult = "Shopping cart";
        String actualResult = extractText(_toVerifyUserOnShoppingCartPage);
    }
    //Tick on agreed terms and condition
    public void selectAgreedTermsAndCondition () {
        clickOnElement(_selectAgreedTermsAndCondition);
    }
    //click on Checkout
    public void clickOnCheckout () {
        clickOnElement(_clickOnCheckout);
    }
    //Click on Checkout As a Guest
    public void clickOnCheckoutAsGuest () {
        clickOnElement(_clickOnCheckoutAsGuest);
    }

}
