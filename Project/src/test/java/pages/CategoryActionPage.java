package pages;
 
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CategoryPageLocators;
import uistore.ProductsPageLocators;
import utils.LogHelper;
import utils.Main;
import utils.UtilsHelper;
 
 
public class CategoryActionPage {
 
    UtilsHelper helper = new UtilsHelper(Main.driver);
 
     private void verifyWrench(){
        try {
            helper.waitForElementToBeVisible(ProductsPageLocators.wrench, 20);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key1"), Main.driver.findElement(ProductsPageLocators.wrench).getText());
            LogHelper.info("Clicked and verified"+ Main.driver.findElement(ProductsPageLocators.wrench).getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void clickCategory(){
        try {
 
            helper.waitForElementToBeVisible(CategoryPageLocators.categoryClick,20);
            helper.ElementClick(CategoryPageLocators.categoryClick);
 
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
 
    public void CategoryActionMain(ExtentTest test){
        verifyWrench();
        clickCategory();
        test.log(Status.PASS, "Verified wrench title and category");
    }
 
}