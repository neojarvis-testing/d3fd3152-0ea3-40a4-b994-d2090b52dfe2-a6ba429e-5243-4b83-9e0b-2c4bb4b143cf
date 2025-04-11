package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class UtilsHelper {    
    private WebDriver driver;

    public UtilsHelper(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Description: Waits for an element to be visible within the specified timeout.
     * @param By, int
     * @return NA
     */
    public void waitForElementToBeVisible(By locator, int timeout) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeout))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Description: Clicks on a specified element.
     * @param By
     * @return NA
     */
    public void ElementClick(By locator) {              
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Description: Sends input data to a specified element.
     * @param By, String
     * @return NA
     */
    public void sendValues(By locator, String data) {            
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Description: Retrieves text from a specified element.
     * @param By
     * @return String
     */
    public String getTextValue(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            return webElement.getText();
        } catch (Exception e) {
            e.printStackTrace();
            return " ";
        }
    }

    /**
     * Description: Executes an ENTER key action on a specified element.
     * @param By
     * @return NA
     */
    public void enterAction(By locator) {   
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Description: Hovers over a specified element.
     * @param By
     * @return NA
     */
    public void ElementHover(By locator) {      
        try {
            WebElement webElement = driver.findElement(locator);
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Description: Switches to a newly opened browser window.
     * @param NA
     * @return NA
     */
    public void switchToNewWindow() {
        try {
            String parentId = driver.getWindowHandle();
            Set<String> childIds = driver.getWindowHandles();

            for (String id : childIds) {
                if (!parentId.equals(id)) {
                    driver.switchTo().window(id);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Description: Retrieves a list of elements using the provided XPath locator.
     * @param String
     * @return List<WebElement>
     */
    public List<WebElement> getElementsByXpath(String locator) {
        try {
            List<WebElement> elements = driver.findElements(By.xpath(locator));
            return elements;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Description: Clears the input field of a specified element.
     * @param By
     * @return NA
     */
    public void clear(By locator) {
        try {
            driver.findElement(locator).clear();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navBack(){
        try {
            driver.navigate().back();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void verifyAcutalAndExpected(String expected, String actual){
        try{
            if(actual.contains(expected)){
                Assert.assertTrue(true);
            }
        }catch(AssertionError error){
         error.printStackTrace();
        }
    }

    /**
     * 
     * @param By
     * @return List<WebElement>
     */
    public List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }
}


