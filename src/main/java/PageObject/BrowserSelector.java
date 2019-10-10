package PageObject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends Utils {
    public void setUpBrowser () {
        String browser = getProperty ("browser");

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","src\\test\\Resources\\BrowserDriver\\msedgedriver.exe");
            driver = new EdgeDriver() ;
        } else {
            System.out.println("Browser name is Empty or type Wrong: " + browser);
        }
    }
}
