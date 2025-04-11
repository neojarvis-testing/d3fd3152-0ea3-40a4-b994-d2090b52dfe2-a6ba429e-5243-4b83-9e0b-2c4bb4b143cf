package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ReporterUtil {
	
	public static TakesScreenshot ts;
    private static ExtentReports reports;


    /**
     * Description: Generates an ExtentReports instance with a specified report name.
     * @param String
     * @return ExtentReports
     */
    public static ExtentReports generateReport(String reportName) {
        if (reports == null) {
        	reports = createReport(reportName);
        }
        return reports;
    }

    /**
     * Description: Creates an ExtentReports instance with a specified report name.
     * @param String
     * @return ExtentReports
     */
    private static ExtentReports createReport(String reportName) {
        ExtentReports extentReport = new ExtentReports();

        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        TimeZone time = TimeZone.getTimeZone("Asia/Kolkata"); // IST timezone
        date.setTimeZone(time);
        String timestamp = date.format(new Date());

        File target = new File(System.getProperty("user.dir") + "/reports");
        if (!target.exists()) {
            target.mkdir();
        }

        String path = System.getProperty("user.dir") + "/reports/";
        if (reportName == null || reportName.isEmpty()) {
            reportName = "Test Report";
        }
        path += reportName + "_" + timestamp + ".html";

        File reportFile = new File(path);

        ExtentSparkReporter reporter = new ExtentSparkReporter(reportFile);

        reporter.config().setTheme(Theme.DARK);
        reporter.config().setReportName("test Report");
        reporter.config().setDocumentTitle("test Automation Report");
        reporter.config().setTimeStampFormat("yyyy.MM.dd.HH.mm.ss");

        extentReport.attachReporter(reporter);
        extentReport.setSystemInfo("Operating System", System.getProperty("os.name"));
        extentReport.setSystemInfo("Username", System.getProperty("user.name"));
        extentReport.setSystemInfo("Java Version", System.getProperty("java.version"));

        return extentReport;

}
    
    /**
     * Description: Captures a screenshot and returns the file path.
     * @param String, WebDriver
     * @return String
     */
    public static String ScreenShot(String filename, WebDriver driver) {
        String time = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + time + ".png";

        String destPath = "./" + name;

        ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);

        // Create the screenshots directory if it doesn't exist
        File targetDir = new File(System.getProperty("user.dir") + "/reports");

        if (!targetDir.exists()) {
            targetDir.mkdirs();
        }

        File target1 = new File(targetDir, name);
        try {
            Files.copy(file, target1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destPath;
    }

    /**
     * Description: Attaches a screenshot to the ExtentTest report with a description.
     * @param String, ExtentTest, String, WebDriver
     * @return NA
     */
    public static void attachToReport(String filename, ExtentTest test, String description, WebDriver driver) {
        try {
            test.log(Status.INFO, description, MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot(filename, driver)).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
