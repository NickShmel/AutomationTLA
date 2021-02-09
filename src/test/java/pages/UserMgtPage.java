package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Set;

public class UserMgtPage extends BasePage{
    protected WebDriver driver;
    public UserMgtPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

//        userMgtNavBtn.click();
//        loginBtn.click();
//        Set<String> getAllwindows = driver.getWindowHandles();
//        String currentWindow = getAllwindows.iterator().next();
//        getAllwindows.remove(getAllwindows.iterator().next());
//        String lastWindow = getAllwindows.iterator().next();
//        driver.switchTo().window(lastWindow);

    }

    @FindBy(xpath = "//h2[contains(text(), 'Register New User')]")
    public WebElement title;

    @FindBy(id = "practice-form")
    public WebElement loginBtn;

    @FindBy(id="access-db-btn")
    public WebElement accessDbBtn;

    @FindBy(id = "Firstname")
    public WebElement firstName;

    @FindBy(id = "Lastname")
    public WebElement lastName;

    @FindBy(id = "Phonenumber")
    public WebElement phoneNumber;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Select-role")
    public WebElement roles;
}