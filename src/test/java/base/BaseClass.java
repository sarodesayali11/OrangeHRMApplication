package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigReader;

public class BaseClass {

    public WebDriver driver;

    ConfigReader config = new ConfigReader();

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open Application URL
        driver.get(config.getUrl());
    }
}