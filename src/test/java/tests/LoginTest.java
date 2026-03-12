package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginpage() {
        driver.get("https://web.com/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("User", "Pass");

        Assert.assertTrue(driver.getPageSource().contains("Your username is valid!"));
    }
}
