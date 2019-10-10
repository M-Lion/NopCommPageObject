package PageObject;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourOwnComputer extends Utils {

    private By _actualResult = By.xpath("//h1[@itemprop='name']");
    private By _clickOnEmailAFriend = By.xpath("//input[@value='Email a friend']");
    private By _selectProcessor = By.id("product_attribute_1");
    private By _selectRam = By.id("product_attribute_2");
    private By _selectHdd = By.id("product_attribute_3_6");
    private By _selectOs = By.id("product_attribute_4_8");
    private By _selectSoftware = By.id("product_attribute_5_10");
    private By _clickOnAddToCartAfterPurchase = By.id("add-to-cart-button-1");
    private By _actualResult1 = By.xpath("//p[@class='content']");
    private By _clickOnShoppingCartAfterBuildComputer = By.xpath("//span[@class='cart-qty']");

    //To Verify user should be on build your own computer page or not
    public void toVerifyUserShouldBeOnBuildYourOwnComputerPage () {
        String expectedResult = "Build your own computer";
        String actualResult = extractText(_actualResult);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //To click on email a friend
    public void toClickOnEmailAFriend () {
        clickOnElement(_clickOnEmailAFriend);
    }
    //Select Processor,RAM, HDD, OS & Software
    public void selectProcessorSoftware () {
        clickOnElement(_selectProcessor);
        clickOnElement(_selectRam);
        clickOnElement(_selectHdd);
        clickOnElement(_selectOs);
        clickOnElement(_selectSoftware);
    }
    //Click on Add to Cart
    public void clickOnAddToCart () {
        clickOnElement(_clickOnAddToCartAfterPurchase);
    }
    //To Verify Product has been added to shipping cart successfully or not
    public void toVerifyProductHasBeenAddedToShippingCart() {
        String expectedResult1 = "The product has been added to your shopping cart";
        String actualResult1 = extractText(_actualResult1);
        Assert.assertEquals(actualResult1,expectedResult1);
    }
    //Click on Shopping Cart
    public void clickOnShoppingCartAfterBuildComputer () {
        clickOnElement(_clickOnShoppingCartAfterBuildComputer);
    }
}
