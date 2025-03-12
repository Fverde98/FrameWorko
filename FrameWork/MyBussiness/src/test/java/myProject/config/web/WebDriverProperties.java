package myProject.config.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class WebDriverProperties {
    private static Properties prop = new Properties();
    private static final String GLOBAL_DATA_FILE_LOCATION = "src/test/resources/test.properties";
    public String PLATFORMA_NAME = null;
    public String ENVIRONMENT = null;
    public String CLIENT = null;
    public String URLBASE = null;

    public WebDriverProperties() {
        initConfig();
    }

    public void initConfig() {
        try {
            InputStream input;
            input = WebDriverProperties.class.getResourceAsStream(GLOBAL_DATA_FILE_LOCATION);
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PLATFORMA_NAME = prop.getProperty("webdriver.platformName");
        ENVIRONMENT = prop.getProperty("webdriver.env");
        CLIENT = prop.getProperty("webdriver.client");

    }
    public String getPlatformName() {
        return PLATFORMA_NAME;
    }
    public String getEnvironment() {
        return ENVIRONMENT;
    }
    public String getClient() {
        return CLIENT;
    }
    public String getUrlBase() {
        String rawUrlBase = String.format("webdriver.%s. urlbase./%s", getEnvironment(),getClient()) ;
        return prop.getProperty(rawUrlBase);
    }
}