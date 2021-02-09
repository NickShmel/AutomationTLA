package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Selenium_utils {
    /**
     * Method will switch to newly opened window
     * @param driver will be given in Test Classes
     * @author Kuba
     */
    public static void switchToWindow(WebDriver driver){
        String currentWindowID=driver.getWindowHandle();

        Set<String> allWindows=driver.getWindowHandles();

        for(String each: allWindows){
            if(!each.equals(currentWindowID)){
                driver.switchTo().window(each);
            }
        }
    }
}
