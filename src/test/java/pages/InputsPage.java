package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputsPage extends BasePage{
    protected WebDriver driver;
    public InputsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='message']")
    public WebElement input1;

    @FindBy(xpath = "//input[@id='a']")
    public WebElement inputNumber1;

    @FindBy(id = "b")
    public WebElement inputNumber2;

    @FindBy(name = "button2")
    public WebElement getTotalBtn;

    @FindBy(name = "answer2")
    public WebElement result;
}
