package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class LoginPage extends BasePage{
    protected WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className="avatar")
    public WebElement logo;


//    @FindBy(name = "username")
//    public WebElement userName;
//
//    @FindBy(name = "password")
//    public WebElement password;
//
//    @FindBy(xpath = "//div//button")
//    public WebElement logIn;
//
//    @FindBy(className = "avatar")
//    public WebElement picture;
//
//    public Boolean pictureIsLoaded(WebElement element) {
//        Boolean pictureLoaded = (Boolean) ((JavascriptExecutor) driver).executeScript(
//                "return arguments[0].complete && " +
//                        "typeof arguments[0].naturalWidth != \"undefined\" && " +
//                        "arguments[0].naturalWidth > 0", picture);
//        if (pictureLoaded == true) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
