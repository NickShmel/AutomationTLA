package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InputsPage;

public class InputsPageTest extends BaseTest{
    private InputsPage inputsPage;

    @BeforeMethod
    public void localSetUp(){
        inputsPage = new InputsPage(driver);
        inputsPage.inputsNavBtn.click();
    }

    @Test
    public void test1(){
        inputsPage.input1.sendKeys("Some message");
    }

    @Test
    public void test2(){
        inputsPage.inputNumber1.sendKeys("Test message 2");
    }

    @Test(testName = "Two Input Fields Test", description = "Validating input of 2 fields equals to sum of the values")
    public void test3(){
        inputsPage.inputNumber1.sendKeys("20");
        inputsPage.inputNumber2.sendKeys("24");
        inputsPage.getTotalBtn.click();
        String result = inputsPage.result.getText();
        Assert.assertEquals("44", result);
    }
}