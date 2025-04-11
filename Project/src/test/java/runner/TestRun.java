package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.CategoryActionPage;
import pages.HomepageActionPage;
import pages.InformationActionPage;
import pages.ProductsActionPage;
import utils.Main;
import utils.ReporterUtil;

public class TestRun extends Main {
    ExtentReports reports;
    ExtentTest test;

    @BeforeClass
    public void reportGenerate() {
        reports = ReporterUtil.generateReport("HomeDepot");

    }

    @BeforeMethod
    public void openedBrowser() {
        openingTheBrowser();
    }

    @Test(priority = 5)
    public void HompageFooterIteration() {
        HomepageActionPage act = new HomepageActionPage();
        test = reports.createTest("PortalHDTC-005- Verify Footer links Navigation first half");

        act.footerTestcase01(test);

    }

    @Test(priority = 6)
    public void HomepageFooterIterationTwo() {
        HomepageActionPage act1 = new HomepageActionPage();
        test = reports.createTest("PortalHDTC-006- Verify Footer link Navigation second half");

        act1.footerTestcase02(test);

    }

    @Test(priority = 1)
    public void testCase1() {
        try {
            HomepageActionPage hap = new HomepageActionPage();
            test = reports.createTest("PortalHDTC-001- Verify the data for the search Wrench");
            hap.HomepageActionMain(test);

            CategoryActionPage cap = new CategoryActionPage();
            cap.CategoryActionMain(test);

            ProductsActionPage pap = new ProductsActionPage();
            pap.ProductActionMain(test);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 7)
    public void testCase7() {
        try {
            HomepageActionPage hp = new HomepageActionPage();
            test = reports.createTest("PortalHDTC-007- Verify Footer link navigation Third part");
            hp.TC7(test);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void testCase2() {
        try {
            HomepageActionPage act = new HomepageActionPage();
            test = reports.createTest("PortalHDTC-002-Exploring products under shop all category");
            act.home(test);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test(priority = 4)
    public void testCase4() {
        try {
            InformationActionPage act1 = new InformationActionPage();
            test = reports.createTest("PortalHDTC-004- Exploring workshops under DIY category");
            act1.registration(test);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test(priority = 3)
    public void test_case03() {

        try {

            HomepageActionPage homePageActionPage = new HomepageActionPage();
            test = reports.createTest("PortalHDTC-003-Exploring different services under services category");
            homePageActionPage.serivcesClickingOnNavbar(test);

            InformationActionPage informationActionPage = new InformationActionPage();
            informationActionPage.InformationOperations(test);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test(priority = 9)
    public void material() {
        HomepageActionPage homepageAction = new HomepageActionPage();
        test = reports.createTest("PortalHDTC-009- Exploring building materials under shop by category");
        ProductsActionPage productpageAction = new ProductsActionPage();
        try {
            homepageAction.category(test);
            productpageAction.shopcategory(test);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 8)
    public void test8() {
        InformationActionPage action = new InformationActionPage();
        test = reports.createTest("PortalHDTC-008-Exploring credit offers by entering the customer details");
        action.combinedMethods(test);
    }

    @Test(priority = 10)
    public void test10() {
        HomepageActionPage action = new HomepageActionPage();
        test = reports.createTest("PortalHDTC-010-Exploring the information links in the extreme footer");
        action.combinedMethod(test);
    }

    @AfterMethod
    public void closecon() {
        driver.quit();
    }

    @AfterClass
    public void closeReport() {
        reports.flush();
    }


}

