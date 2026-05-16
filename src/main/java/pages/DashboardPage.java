package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    WebDriver driver;

    By pimMenu = By.xpath("//span[text()='PIM']");

    public DashboardPage(WebDriver driver) {

        this.driver = driver;
    }

    public void goToPIM() {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(pimMenu));

        driver.findElement(pimMenu).click();
    }
}