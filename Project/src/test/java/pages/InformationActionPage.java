package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomepageLocators;
import uistore.InformationPageLocators;
import utils.LogHelper;
import utils.Main;
import utils.ReadingExcel;
import utils.ReporterUtil;
import utils.Screenshot;
import utils.UtilsHelper;

public class InformationActionPage {

    UtilsHelper helper = new UtilsHelper(Main.driver);

    private void clickDiy() {
        try {
            helper.ElementHover(HomepageLocators.clickDIY);
            helper.ElementClick(HomepageLocators.clickDIY);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void clickFreeWorkshops() {
        try {
            helper.waitForElementToBeVisible(HomepageLocators.clcikFReeWorkshops, 5);
            helper.ElementClick(HomepageLocators.clcikFReeWorkshops);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void clickKidWorkshop() {
        try {
            helper.waitForElementToBeVisible(HomepageLocators.clickkidsworkshops, 5);
            helper.ElementClick(HomepageLocators.clickkidsworkshops);

            helper.verifyAcutalAndExpected(Main.prop.getProperty("value7"),
                    Main.driver.findElement(HomepageLocators.verifyKidsworkshops).getText());
            LogHelper.info(
                    "ClickedKidsWorkshops" + Main.driver.findElement(HomepageLocators.verifyKidsworkshops).getText());

            helper.ElementClick(InformationPageLocators.clicklearnmore);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("value7"), Main.driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void clickRegister() {
        try {
            helper.ElementClick(InformationPageLocators.clickregisternow);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("value9"),
                    Main.driver.findElement(InformationPageLocators.verifyparentname).getText());

            helper.ElementClick(InformationPageLocators.clickparentfirstnamefield);
            helper.sendValues(InformationPageLocators.clickparentfirstnamefield,
                    Main.prop.getProperty("parentfirstname"));

            helper.ElementClick(InformationPageLocators.clickparentlastnamefield);
            helper.sendValues(InformationPageLocators.clickparentlastnamefield,
                    Main.prop.getProperty("parentlastname"));

            helper.ElementClick(InformationPageLocators.clickemailfield);
            helper.sendValues(InformationPageLocators.clickemailfield, Main.prop.getProperty("email"));

            helper.waitForElementToBeVisible(InformationPageLocators.selectchooseyourworkshsop, 5);

            helper.ElementClick(InformationPageLocators.selectchooseyourworkshsop);
            helper.waitForElementToBeVisible(InformationPageLocators.clickchoosebuffermay, 5);
            helper.ElementClick(InformationPageLocators.clickchoosebuffermay);
            helper.waitForElementToBeVisible(InformationPageLocators.selecthowdidyouhearaboutus, 5);

            helper.ElementClick(InformationPageLocators.selecthowdidyouhearaboutus);
            helper.waitForElementToBeVisible(InformationPageLocators.clickfriendfamilymember, 5);

            helper.ElementClick(InformationPageLocators.clickfriendfamilymember);
            helper.waitForElementToBeVisible(InformationPageLocators.clickregister, 5);

            helper.ElementClick(InformationPageLocators.clickregister);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void registration(ExtentTest test) {

        clickDiy();
        clickFreeWorkshops();
        clickKidWorkshop();
        clickRegister();
        test.log(Status.PASS,"Explored workshops under location section");
        test.log(Status.INFO,"Various sections under navigation bar is done");

    }
    private void verifyHeading() {
        try {

            helper.verifyAcutalAndExpected(Main.prop.getProperty("excepted"),
                    Main.driver.findElement(InformationPageLocators.VerifyHomeServicesHeading).getText());
            System.out.println("Home Services");
            LogHelper.info("Heading verified"
                    + Main.driver.findElement(InformationPageLocators.VerifyHomeServicesHeading).getText());

        } catch (Exception e) {

            e.getMessage();
        }
    }
    private void clickActionOnFlooring() {
        try {
            helper.waitForElementToBeVisible(InformationPageLocators.flooringclick, 5);
            helper.ElementClick(InformationPageLocators.flooringclick);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("excepted1"),
                    Main.driver.findElement(InformationPageLocators.VerifyFlooringInstallationheading).getText());
            System.out.println("Flooring Installation");
            LogHelper.info("Clicked and verified"
                    + Main.driver.findElement(InformationPageLocators.VerifyFlooringInstallationheading).getText());
            helper.navBack();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    private void clickActionOnBathroom() {
        try {
            helper.waitForElementToBeVisible(InformationPageLocators.flooringclick, 5);
            helper.ElementClick(InformationPageLocators.BathroomClicking);
            helper.waitForElementToBeVisible(InformationPageLocators.zipcodeOnVerifcationPage, 10);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("excepted2"),
                    Main.driver.findElement(InformationPageLocators.VerifyBathroomInstallationServiceHeading)
                            .getText());
            System.out.println("Bathroom Installation Services");
            LogHelper.info("Clicked and verified"
                    + Main.driver.findElement(InformationPageLocators.VerifyBathroomInstallationServiceHeading)
                            .getText());
            helper.navBack();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    private void clickActionOnDoorsAndWindow() {
        try {
            helper.waitForElementToBeVisible(InformationPageLocators.flooringclick, 5);
            helper.ElementClick(InformationPageLocators.Doorsandwindowclicking);
            helper.waitForElementToBeVisible(InformationPageLocators.ImageonVerificationPage, 10);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("excepted3"),
                    Main.driver.findElement(InformationPageLocators.VerifyWindowAndDoorServicesHeading).getText());
            System.out.println("Window & Door Services");
            LogHelper.info("Clicked and verified"
                    + Main.driver.findElement(InformationPageLocators.VerifyWindowAndDoorServicesHeading).getText());
            helper.navBack();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    private void clickActionOnHeatingAndCooling() {
        try {
            helper.waitForElementToBeVisible(InformationPageLocators.flooringclick, 5);
            helper.ElementClick(InformationPageLocators.HeatingAndCoolingClicking);
            helper.waitForElementToBeVisible(InformationPageLocators.inputfieldonVerificationPage, 10);
            helper.verifyAcutalAndExpected(Main.prop.getProperty("excepted4"),
                    Main.driver.findElement(InformationPageLocators.VerifyHVACServicesHeading).getText());
            System.out.println("HVAC Services");
            LogHelper.info("Clicked and verified"
                    + Main.driver.findElement(InformationPageLocators.VerifyHVACServicesHeading).getText());
            helper.navBack();

        } catch (Exception e) {
            e.getMessage();
        }
    }
    public void InformationOperations(ExtentTest test) {
        try {
            verifyHeading();
            clickActionOnFlooring();
            clickActionOnBathroom();
            clickActionOnDoorsAndWindow();
            clickActionOnHeatingAndCooling();
            test.log(Status.INFO,"Different operations carried out on Black Friday Sale");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void moveToCreditOffer() {
        try {
            helper.ElementHover(InformationPageLocators.creditCLick);
            helper.ElementClick(InformationPageLocators.creditCLick);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void applyNow() {
        try {
            helper.waitForElementToBeVisible(InformationPageLocators.applyNowClick, 20);
            helper.ElementClick(InformationPageLocators.applyNowClick);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void fillDetails() {
        try {
            String firstname = ReadingExcel.DataReader(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1",
                    1, 0);
            String lastname = ReadingExcel.DataReader(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1",
                    2, 0);
            String email = ReadingExcel.DataReader(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 3,
                    0);
            String number = ReadingExcel.DataReader(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 4,
                    0);

            helper.waitForElementToBeVisible(InformationPageLocators.firstNameClick, 20);
            helper.sendValues(InformationPageLocators.firstNameClick, firstname);
            helper.sendValues(InformationPageLocators.lastNameClick, lastname);
            helper.sendValues(InformationPageLocators.emailClick, email);
            helper.sendValues(InformationPageLocators.phoneClick, number);
            helper.ElementHover(InformationPageLocators.continueClick1);
            helper.ElementClick(InformationPageLocators.continueClick1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void addressDetails() {
        try {
            String address = ReadingExcel.DataReader(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1",
                    5, 0);
            String city = ReadingExcel.DataReader(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 6,
                    0);
            String state = ReadingExcel.DataReader(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 7,
                    0);
            String zip = ReadingExcel.DataReader(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 8,
                    0);

            helper.sendValues(InformationPageLocators.addressClick, address);
            helper.sendValues(InformationPageLocators.cityClick, city);
            WebElement element1 = Main.driver.findElement(InformationPageLocators.stateClick);
            Select select1 = new Select(element1);
            select1.selectByValue(state);
            helper.sendValues(InformationPageLocators.zipClick, zip);
            helper.ElementHover(InformationPageLocators.continueClick2);
            helper.ElementClick(InformationPageLocators.continueClick2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void residenceStatus(ExtentTest test) {
        try {
            String residence = ReadingExcel.DataReader(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1",
                    9, 0);
            String monthly = ReadingExcel.DataReader(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1",
                    10, 0);
            String yearly = ReadingExcel.DataReader(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1",
                    11, 0);
            String dob = ReadingExcel.DataReader(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 12,
                    0);
            String ssn = ReadingExcel.DataReader(System.getProperty("user.dir") + "/testdata/data.xlsx", "Sheet1", 13,
                    0);

            WebElement element1 = Main.driver.findElement(InformationPageLocators.residenceClick);
            Select select1 = new Select(element1);
            select1.selectByValue(residence);
            helper.sendValues(InformationPageLocators.monthlyPaymentClick, monthly);
            helper.sendValues(InformationPageLocators.annualIncomeClick, yearly);
            helper.sendValues(InformationPageLocators.dobClick, dob);
            helper.sendValues(InformationPageLocators.socialSecurityClick, ssn);
            helper.ElementHover(InformationPageLocators.continueClick3);
            helper.waitForElementToBeVisible(InformationPageLocators.continueClick3, 10);
            helper.ElementClick(InformationPageLocators.continueClick3);
            helper.waitForElementToBeVisible(InformationPageLocators.continueClick4, 10);
            helper.ElementClick(InformationPageLocators.continueClick4);

            List<WebElement> verifyElements = helper.getElements(InformationPageLocators.verifyAllDetais);
            String nameactual = verifyElements.get(0).getText();
            String emailactual = verifyElements.get(1).getText();
            String numberactual = verifyElements.get(2).getText();
            String addressactual = verifyElements.get(3).getText();
            String citystateactual = verifyElements.get(4).getText();
            String zipactual = verifyElements.get(5).getText();
            String rentactual = verifyElements.get(6).getText();
            String monthlyactual = verifyElements.get(7).getText();
            String yearlyactual = verifyElements.get(8).getText();

            helper.verifyAcutalAndExpected(nameactual,
                    Main.prop.getProperty("firstName") + " " + Main.prop.getProperty("lastName"));
            helper.verifyAcutalAndExpected(emailactual, Main.prop.getProperty("email"));
            helper.verifyAcutalAndExpected(numberactual, Main.prop.getProperty("number"));
            helper.verifyAcutalAndExpected(addressactual, Main.prop.getProperty("address"));
            helper.verifyAcutalAndExpected(citystateactual,
                    Main.prop.getProperty("city") + ", " + Main.prop.getProperty("state"));
            helper.verifyAcutalAndExpected(zipactual, Main.prop.getProperty("zip"));
            helper.verifyAcutalAndExpected(rentactual, Main.prop.getProperty("rent"));
            helper.verifyAcutalAndExpected(monthlyactual, Main.prop.getProperty("monthly"));
            helper.verifyAcutalAndExpected(yearlyactual, Main.prop.getProperty("yearly"));

            Screenshot.screenshot(Main.driver, "store_directory");
            ReporterUtil.attachToReport("store_directory", test, "This is the proof of verifictaion", Main.driver);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void combinedMethods(ExtentTest test) {
        moveToCreditOffer();
        applyNow();
        fillDetails();
        addressDetails();
        residenceStatus(test);
    }

}
