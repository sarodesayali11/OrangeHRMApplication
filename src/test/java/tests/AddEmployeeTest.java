package tests;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PIMPage;
import utilities.ConfigReader;

public class AddEmployeeTest extends BaseClass
{

    ConfigReader config = new ConfigReader();

    @Test
    public void verifyAddEmployee() {

        // Step 1: Login
        LoginPage lp = new LoginPage(driver);

        lp.login(config.getUsername(),
                config.getPassword());

        // Step 2: Navigate to PIM
        DashboardPage dp = new DashboardPage(driver);
        dp.goToPIM();

        // Step 3: Add Employee
        PIMPage pim = new PIMPage(driver);
        pim.addEmployee("John", "Doe");

        // Step 4: Validation
        String url = driver.getCurrentUrl();

        Assert.assertNotNull(url);
        Assert.assertTrue(url.contains("pim"));
    }
}
