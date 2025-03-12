package myProject.config;

import myProject.config.web.WebDriverFactory;
import myProject.config.web.WebDriverProperties;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class WebDriverConfig {
    static WebDriverProperties webDriverProperties = new WebDriverProperties();


    public static WebDriver initSeleniumConfig() throws Exception {
       Logger log = LoggerFactory.getLogger(WebDriverConfig.class);
       WebDriver driver;
       String platform = webDriverProperties.getPlatformName();
       String urlBase = webDriverProperties.getUrlBase();


        log.info(() -> "**********************************************************************************************");
        log.info(() -> "[ POM Configuration ] - Read the basic properties configuration from: ../webDriverTest.properties");
        log.info(() -> "[ POM Configuration ] - Browser: " + platform);
        log.info(() -> "*********************************************************************************************");

        driver = WebDriverFactory.createNewDriver(platform, urlBase);
        return driver;
    }
}
