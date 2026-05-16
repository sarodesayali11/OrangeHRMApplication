package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PIMPage {

    WebDriver driver;

    By addBtn = By.xpath("//button[normalize-space()='Add']");

    public PIMPage(WebDriver driver) {

        this.driver = driver;
    }

    public void addEmployee(String fname, String lname) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions
                .elementToBeClickable(addBtn));

        driver.findElement(addBtn).click();
    }
}