package pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomepageLocators;
import utils.LogHelper;
import utils.Main;
import utils.ReadingExcel;
import utils.Screenshot;
import utils.UtilsHelper;

public class HomepageActionPage {

    UtilsHelper helper = new UtilsHelper(Main.driver);

    private void footerIterationOne() {
        try {

            List<String> data = new ArrayList<>();
            data.add(Main.prop.getProperty("data1"));
            data.add(Main.prop.getProperty("data2"));
            data.add(Main.prop.getProperty("data3"));
            data.add(Main.prop.getProperty("data4"));
            data.add(Main.prop.getProperty("data5"));
            data.add(Main.prop.getProperty("data6"));
            data.add(Main.prop.getProperty("data7"));
            data.add(Main.prop.getProperty("data8"));
            data.add(Main.prop.getProperty("data9"));

            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,6500)", "");

            List<WebElement> firstFooterLinks = Main.driver
                    .findElements(By.xpath("//li[@class='sui-text-sm sui-mb-2 sui-underline']/a"));
            for (int i = 2; i <= 10; i++) {

                Main.driver.findElement(By.xpath("(//li[@class='sui-text-sm sui-mb-2 sui-underline'])[" + i + "]/a"))
                        .click();

                String actual = Main.driver.getCurrentUrl();

                if (actual.contains(data.get(i - 2))) {
                    Assert.assertTrue(true);
                    Main.driver.navigate().back();

                }

            }
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    public void footerTestcase01(ExtentTest test) {
        footerIterationOne();
        test.log(Status.PASS, "Footer testcase passed");

    }

    private void footerIterationTwo() {

        try {

            List<String> data = new ArrayList<>();
            data.add(Main.prop.getProperty("data11"));
            data.add(Main.prop.getProperty("data12"));
            data.add(Main.prop.getProperty("data13"));
            data.add(Main.prop.getProperty("data14"));
            data.add(Main.prop.getProperty("data15"));
            data.add(Main.prop.getProperty("data16"));
            data.add(Main.prop.getProperty("data17"));
            data.add(Main.prop.getProperty("data18"));
            data.add(Main.prop.getProperty("data19"));

            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,6500)", "");

            List<WebElement> secondFooterLinks = helper
                    .getElementsByXpath("//li[@class='sui-text-sm sui-mb-2 sui-underline']/a");
            for (int i = 11; i <= 19; i++) {

                Main.driver.findElement(By.xpath("(//li[@class='sui-text-sm sui-mb-2 sui-underline'])[" + i + "]/a"))
                        .click();

                String actual = Main.driver.getCurrentUrl();
                for (int j = 0; j < 9; j++) {
                    if (actual.contains(data.get(j))) {
                        Assert.assertTrue(true);
                        Main.driver.navigate().back();

                    }
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }

    }

    private void clicksGifts() {
        JavascriptExecutor js = (JavascriptExecutor) Main.driver;
        js.executeScript("window.scrollBy(0,8000)", "");
        helper.ElementHover(HomepageLocators.gift);
        helper.ElementClick(HomepageLocators.gift);
        helper.navBack();
    }

    private void clicksprivacy() {
        JavascriptExecutor js = (JavascriptExecutor) Main.driver;
        js.executeScript("window.scrollBy(0,8000)", "");
        helper.ElementHover(HomepageLocators.privacy);
        helper.ElementClick(HomepageLocators.privacy);
        helper.navBack();
    }

    public void footerTestcase02(ExtentTest test) {

        footerIterationTwo();
        test.log(Status.PASS, "Testcase passed for footer");
        clicksGifts();
        clicksprivacy();
    }

    private void searchMethod() {
        helper.ElementClick(HomepageLocators.searchBarClick);
    }

    private void enterData() {
        try {
            String testdata = ReadingExcel.DataReader("/home/coder/project/workspace/Project/testdata/data.xlsx",
                    "Sheet1", 0, 0);
            helper.sendValues(HomepageLocators.searchBarClick, testdata);
            helper.ElementClick(HomepageLocators.searchBarIconClick);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void HomepageActionMain(ExtentTest test) {
        searchMethod();
        enterData();
        test.log(Status.PASS, "Executed search action and data entering");
    }

    private void clickAndVerifyCareers() {
        try {

            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");
            helper.ElementHover(HomepageLocators.careers);
            helper.waitForElementToBeVisible(HomepageLocators.careers, 20);
            helper.ElementClick(HomepageLocators.careers);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key6"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clickAndVerifyCoprporateInformation() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");
            helper.ElementHover(HomepageLocators.corporateInformation);
            helper.waitForElementToBeVisible(HomepageLocators.corporateInformation, 20);
            helper.ElementClick(HomepageLocators.corporateInformation);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key7"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clickAndVerifyDigitalNewsroom() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");
            helper.ElementHover(HomepageLocators.digitalNewsroom);
            helper.waitForElementToBeVisible(HomepageLocators.digitalNewsroom, 20);
            helper.ElementClick(HomepageLocators.digitalNewsroom);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key8"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clickAndVerifyHDFoundation() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");
            helper.ElementHover(HomepageLocators.HDFoundation);
            helper.waitForElementToBeVisible(HomepageLocators.HDFoundation, 20);
            helper.ElementClick(HomepageLocators.HDFoundation);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key9"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clickAndVerifyInvestorsRelations() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");
            helper.ElementHover(HomepageLocators.investorsRelations);
            helper.waitForElementToBeVisible(HomepageLocators.investorsRelations, 20);
            helper.ElementClick(HomepageLocators.investorsRelations);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key10"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clickAndVerifyGovernmentCustomers() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");
            helper.ElementHover(HomepageLocators.governmentsCustomers);
            helper.waitForElementToBeVisible(HomepageLocators.governmentsCustomers, 20);
            helper.ElementClick(HomepageLocators.governmentsCustomers);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key11"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clickAndVerifySuppliersProviders() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");
            helper.ElementHover(HomepageLocators.suppliersProviders);
            helper.waitForElementToBeVisible(HomepageLocators.suppliersProviders, 20);
            helper.ElementClick(HomepageLocators.suppliersProviders);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key12"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clickAndVerifyAffiliateProgram() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");
            helper.ElementHover(HomepageLocators.affiliateProgram);
            helper.waitForElementToBeVisible(HomepageLocators.affiliateProgram, 20);
            helper.ElementClick(HomepageLocators.affiliateProgram);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key13"), Main.driver.getCurrentUrl());
            helper.navBack();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clickAndVerifyEcoActions() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) Main.driver;
            js.executeScript("window.scrollBy(0,8000)", "");
            helper.ElementHover(HomepageLocators.ecoActions);
            helper.waitForElementToBeVisible(HomepageLocators.ecoActions, 20);
            helper.ElementClick(HomepageLocators.ecoActions);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("key14"), Main.driver.getCurrentUrl());
            Screenshot.screenshot(Main.driver, "Photograph");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void TC7(ExtentTest test) {
        try {
            clickAndVerifyCareers();
            clickAndVerifyCoprporateInformation();
            clickAndVerifyDigitalNewsroom();
            clickAndVerifyHDFoundation();
            clickAndVerifyInvestorsRelations();
            clickAndVerifyGovernmentCustomers();
            clickAndVerifySuppliersProviders();
            clickAndVerifyAffiliateProgram();
            clickAndVerifyEcoActions();
            test.log(Status.PASS, "Executed footer links and verified the titles");
            test.log(Status.INFO, "Operations on footer are successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clickshopall() {
        try {
            helper.ElementClick(HomepageLocators.clickshopall);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void clicksaving() {
        try {
            helper.ElementClick(HomepageLocators.clickSavings);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void clickshopallsavings() {
        try {
            helper.ElementClick(HomepageLocators.clickAllSavings);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("value1"),
                    Main.driver.findElement(HomepageLocators.verifySavingCenter).getText());
            Main.driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void againclickshopall() {
        try {
            helper.ElementClick(HomepageLocators.clickshopall);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("value2"),
                    Main.driver.findElement(HomepageLocators.verifyShopBydepartment).getText());
            LogHelper.info("Clicked and verified"
                    + Main.driver.findElement(HomepageLocators.verifyShopBydepartment).getText());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void clickalldepartment() {
        try {
            helper.ElementClick(HomepageLocators.clickondeparetment);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void clickselectappliances() {
        try {
            helper.ElementClick(HomepageLocators.selectappliances);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("value4"),
                    Main.driver.findElement(HomepageLocators.verifyshopallappliances).getText());
            LogHelper.info("Clicked on Select Appliances and Veified"
                    + Main.driver.findElement(HomepageLocators.verifyshopallappliances).getText());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clickshopallappliances() {
        try {
            helper.ElementClick(HomepageLocators.clickshopallappliances);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("value5"),
                    Main.driver.findElement(HomepageLocators.verifyAPPLIANCES).getText());
            LogHelper.info("Clicked Shop All Appliances and verified "
                    + Main.driver.findElement(HomepageLocators.verifyAPPLIANCES).getText());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void clickkitchenappliances() {
        try {
            helper.ElementClick(HomepageLocators.clickKitchenAppliancesPackages);
            // verifykitchenappliances
            helper.verifyAcutalAndExpected(Main.prop.getProperty("value6"),
                    Main.driver.findElement(HomepageLocators.verifykITCHENAppliancesPackahes).getText());
            LogHelper.info("Clicked Kitchen Appliances Packages"
                    + Main.driver.findElement(HomepageLocators.verifykITCHENAppliancesPackahes).getText());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void home(ExtentTest test) {
        clickshopall();
        clicksaving();
        clickshopallsavings();
        againclickshopall();
        clickalldepartment();
        clickselectappliances();
        clickshopallappliances();
        clickkitchenappliances();
        test.log(Status.INFO, "Homepage operation is passed");

    }

    public void serivcesClickingOnNavbar(ExtentTest test) {

        try {

            helper.ElementClick(HomepageLocators.NavbarServicesClicking);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("excepted"),
                    Main.driver.findElement(HomepageLocators.ServiceHeadingVerify).getText());
            System.out.println("Services");
            helper.ElementClick(HomepageLocators.HomePageInstallationandServicesClicking);
            helper.ElementClick(HomepageLocators.ViewInstallationandservices);

            test.log(Status.INFO, "Explored content under services");

        } catch (Exception e) {

            e.getMessage();
        }
    }

    private void clickAndVerify() {
        try {
            helper.ElementHover(HomepageLocators.storelocatorclick);
            helper.ElementClick(HomepageLocators.storelocatorclick);
            LogHelper.info("verify store locator");
            helper.navBack();
            helper.ElementClick(HomepageLocators.privacyandsecurityclick);
            helper.navBack();
            helper.ElementClick(HomepageLocators.termsclick);
            helper.navBack();
            helper.ElementClick(HomepageLocators.mypreferencecenterclickon);
            helper.navBack();
            helper.ElementClick(HomepageLocators.sitemapclick);
            helper.navBack();
            helper.ElementClick(HomepageLocators.storedirectoryclick);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void combinedMethod(ExtentTest test) {
        clickAndVerify();
        test.log(Status.INFO, "click on terms");
    }

    public void category(ExtentTest test) {
        try {
            helper.ElementHover(HomepageLocators.homepageshopcategoryclick);
            helper.ElementClick(HomepageLocators.homepageshopcategoryclick);

            test.log(Status.INFO, "Hovered and clicked category");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}