package Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {
    WebDriver driver = null;
    public WebDriverFactory() {

    }
    public WebDriver createWebDriver(String browser, String url) {

        try {
            if (StringUtils.equalsIgnoreCase("chrome", browser)) {
                System.out.println("Creating session..");
                System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
                driver = new ChromeDriver();
            } else if (StringUtils.equalsIgnoreCase("firefox", browser)) {
                System.out.println("Creating session..");
                System.setProperty("webdriver.firefox.driver", "driver/chromedriver");
                driver = new FirefoxDriver();
            } else if (StringUtils.equalsIgnoreCase("ie", browser)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
        } catch (Exception e) {
            throw new SkipException("Driver not found");
        }


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
        return driver;
    }
}
