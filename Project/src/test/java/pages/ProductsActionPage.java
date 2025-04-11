package pages;

import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.CategoryPageLocators;
import uistore.ProductsPageLocators;
import utils.LogHelper;
import utils.Main;
import utils.Screenshot;
import utils.UtilsHelper;

public class ProductsActionPage {

    UtilsHelper helper = new UtilsHelper(Main.driver);

    private void clickAndVerifyWrenchsets() {
        try {

            helper.waitForElementToBeVisible(ProductsPageLocators.wrenchSetsClick, 20);
            helper.ElementClick(ProductsPageLocators.wrenchSetsClick);
            helper.waitForElementToBeVisible(ProductsPageLocators.wrenchSetsClick, 20);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key2"),
                    Main.driver.findElement(ProductsPageLocators.wrenchSetsClick).getText());
            LogHelper.info(
                    "Clicked and verified" + Main.driver.findElement(ProductsPageLocators.wrenchSetsClick).getText());
            helper.navBack();
            helper.navBack();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void clickAndVerifyRatchetingWrenches() {
        try {

            helper.waitForElementToBeVisible(CategoryPageLocators.categoryClick, 10);
            helper.ElementClick(CategoryPageLocators.categoryClick);
            helper.ElementClick(ProductsPageLocators.ratcheting);
            helper.waitForElementToBeVisible(ProductsPageLocators.ratcheting, 20);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key3"),
                    Main.driver.findElement(ProductsPageLocators.ratcheting).getText());
            LogHelper.info("Clicked and verified" + Main.driver.findElement(ProductsPageLocators.ratcheting).getText());

            helper.navBack();
            helper.navBack();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void clickAndVerifyAdjustableWrenches() {
        try {

            helper.ElementClick(CategoryPageLocators.categoryClick);
            helper.ElementClick(ProductsPageLocators.adjustablewrenches);
            helper.waitForElementToBeVisible(ProductsPageLocators.adjustablewrenches, 20);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key4"),
                    Main.driver.findElement(ProductsPageLocators.adjustablewrenches).getText());
            LogHelper.info("Clicked and verified"
                    + Main.driver.findElement(ProductsPageLocators.adjustablewrenches).getText());

            helper.navBack();
            helper.navBack();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void clickAndVerifyImpactWrenches() {
        try {

            helper.ElementClick(CategoryPageLocators.categoryClick);
            helper.ElementClick(ProductsPageLocators.impactWrenches);
            helper.waitForElementToBeVisible(ProductsPageLocators.impactWrenches, 20);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key5"),
                    Main.driver.findElement(ProductsPageLocators.impactWrenches).getText());
            LogHelper.info(
                    "Clicked and verified" + Main.driver.findElement(ProductsPageLocators.impactWrenches).getText());

            Screenshot.screenshot(Main.driver, "Photo");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ProductActionMain(ExtentTest test) {
        clickAndVerifyWrenchsets();
        clickAndVerifyRatchetingWrenches();
        clickAndVerifyAdjustableWrenches();
        clickAndVerifyImpactWrenches();
        test.log(Status.INFO, "Explored different types of Wrenches");
    }

    public void Concrete() {
        try {
            helper.ElementHover(ProductsPageLocators.productpageclickonconcrete);
            helper.ElementClick(ProductsPageLocators.productpageclickonconcrete);
            String actual = Main.driver.getTitle();
            String expected = Main.prop.getProperty("title1");
            Assert.assertEquals(actual, expected);
            LogHelper.info("Clicked and verified" + Main.driver.getTitle());
            helper.navBack();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    public void Decking() {
        try {
            helper.ElementHover(ProductsPageLocators.productpageclickondecking);
            helper.ElementClick(ProductsPageLocators.productpageclickondecking);
            String actual = Main.driver.getTitle();
            String expected = Main.prop.getProperty("title2");
            Assert.assertEquals(actual, expected);
            LogHelper.info("Clicked and verified" + Main.driver.getTitle());
            helper.navBack();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    public void Insulation() {
        try {
            helper.ElementHover(ProductsPageLocators.productpageclickoninsulation);
            helper.ElementClick(ProductsPageLocators.productpageclickoninsulation);
            String actual = Main.driver.getTitle();
            String expected = Main.prop.getProperty("title3");
            Assert.assertEquals(actual, expected);
            LogHelper.info("Clicked and verified" + Main.driver.getTitle());
            helper.navBack();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    public void Drywall() {
        try {
            helper.ElementHover(ProductsPageLocators.productpageclickonshopalldrywall);
            helper.ElementClick(ProductsPageLocators.productpageclickondrywall);
            String actual = Main.driver.getTitle();
            String expected = Main.prop.getProperty("title4");
            Assert.assertEquals(actual, expected);
            LogHelper.info("Clicked and verified" + Main.driver.getTitle());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    public void shopallDrywall() {
        try {
            helper.ElementHover(ProductsPageLocators.productpageclickonshopalldrywall);
            helper.ElementClick(ProductsPageLocators.productpageclickonshopalldrywall);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void AllFilter() {
        try {

            helper.ElementClick(ProductsPageLocators.productpageclickonallfilters);
            Screenshot.screenshot(Main.driver, "Testcase 9");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void shopcategory(ExtentTest test) {
        try {
            Concrete();
            Decking();
            Insulation();
            Drywall();
            shopallDrywall();
            AllFilter();
            test.log(Status.INFO, "Building materials are explored");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
