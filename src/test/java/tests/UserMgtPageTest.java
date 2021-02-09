package tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.UserMgtPage;

public class UserMgtPageTest extends BaseTest {
    private UserMgtPage userMgtPage;

    @BeforeMethod
    public void localSetUp(){
        userMgtPage = new UserMgtPage(driver);
        //userMgtPage.userMgtNavBtn.click();
        userMgtPage.click(userMgtPage.userMgtNavBtn);
    }
    @Test
    public void test1(){
        Assert.assertEquals(driver.getTitle(), "Register New User");
    }

    @Test
    public void test2(){
        Assert.assertTrue(userMgtPage.loginBtn.isEnabled());
    }

    @Test
    public void test3(){
        Assert.assertTrue(userMgtPage.accessDbBtn.isEnabled());
    }

    @Test
    public void test4(){
        Assert.assertTrue(userMgtPage.firstName.isEnabled());
    }
    @Test
    public  void test5(){
        Assert.assertTrue(userMgtPage.lastName.isEnabled());
    }
    @Test
    public  void test6(){
        Assert.assertTrue(userMgtPage.email.isEnabled());
    }
    @Test
    public  void test7(){
        Assert.assertTrue(userMgtPage.phoneNumber.isEnabled());
    }
    @Test
    public void  test8() {
        Assert.assertTrue(userMgtPage.roles.isEnabled());
    }
}