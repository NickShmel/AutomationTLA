package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Inputs")
    public WebElement inputsNavBtn;

    @FindBy(linkText = "User-Mgt")
    public WebElement userMgtNavBtn;

    public void click(WebElement element){
        //1. needs to wait for element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        //2. needs to move the view to that element
        //moveIntoView(element);
        //3. need to highlight element right before clicking
        highlightElement(element);
        //4. click the element
        element.click();
    }
    public void sendKeys(WebElement element, String inputValue){
        waitForElementToBeVisible(element);
        highlightElement(element);
        element.sendKeys(inputValue);
    }
    public String getText(WebElement element){
        waitForElementToBeVisible(element);
        highlightElement(element);
        return element.getText();
    }
    public void waitForElementToBeVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void sleep(long milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void moveIntoView(WebElement element){
        try{
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void highlightElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        for(int i = 0; i < 2; i++){
            try{
                if (i == 0){
                    js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: black; border: 3px solid red; background: yellow");
                }else {
                    sleep(500);
                    js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
