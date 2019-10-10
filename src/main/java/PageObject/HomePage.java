package PageObject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends Utils {


    private By _registerLink = By.xpath("//a[@class='ico-register']");
    private By _featuredProduct = By.xpath("//div/a[@href='/build-your-own-computer']");


    public void clickOnRegister () {
        clickOnElement(_registerLink);
    }
    public void clickOnOneOfFeaturedProduct () {
        clickOnElement(_featuredProduct);
    }
}