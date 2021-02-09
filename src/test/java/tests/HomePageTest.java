package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest{
    private HomePage homePage;

    @BeforeMethod
    public void localSetUp(){
        homePage = new HomePage(driver);
    }
    @Test(testName = "TLA Title test", description = "expected title is - Automation with Selenium")
    public void test1(){
        Assert.assertEquals(homePage.title.getText(), "Automation with Selenium");
    }
    @Test(testName = "Test PHP link", description = "Expecting correct link that opens PHP website")
    public void test2(){
        Assert.assertEquals(homePage.phpLink.getAttribute("href"),"https://phptravels.com/demo/");
    }
    @Test(testName = "Test category example", description = "Setting smoke and regression test groups to report", groups = {"smoke", "regression"})
    public void test3(){
        extentTest.assignCategory(test.groups());
    }
    @Test(testName = "Author example", description = "Setting author to report")
    public void test4(){
        extentTest.assignAuthor("Kuba");
    }
    @Test(testName = "Fail Test", description = "To demo failed result view")
    public void test5(){
        screenshot.takeScreenshotAndLog();
        extentTest.info("asfdasdfasdfj");
        Assert.fail();
    }
    @Test(testName = "Screenshot Test", description = "taking screenshot")
    public void test6(){
        screenshot.takeScreenshotAndLog();
    }
}
