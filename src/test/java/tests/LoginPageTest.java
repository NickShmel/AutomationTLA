package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UserMgtPage;
import utils.Selenium_utils;

public class LoginPageTest extends BaseTest {
    private UserMgtPage userMgtPage;
    private LoginPage loginPage;

    @BeforeMethod
    public void localSetUp() {
        userMgtPage = new UserMgtPage(driver);
        loginPage = new LoginPage(driver);

        loginPage.click(loginPage.userMgtNavBtn);
        userMgtPage.click(userMgtPage.loginBtn);
//        loginPage.userMgtNavBtn.click();
//        userMgtPage.loginBtn.click();
        Selenium_utils.switchToWindow(driver);
    }

    @Test(testName = "TLA Logo Test")
    public void test1() {
        String expectedLogoValue = "images/logo.jpeg";
        Assert.assertTrue(loginPage.logo.getAttribute("src").contains(expectedLogoValue));
    }

}

//    @Test(testName = "TLA Logo Test")
//    public void test1(){
//        loginPage.logo.isDisplayed();
//    }
//    @Test
//    public void test2(){
//        Assert.assertTrue(loginPage.pictureIsLoaded(loginPage.picture));
//    }
