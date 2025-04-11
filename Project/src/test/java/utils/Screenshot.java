package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {


    /**
     * Description: Logs a message at the TRACE level.
     * 
     * @param WebDriver, String
     * @return NA
     */
    public static void screenshot(WebDriver driver, String filename) {
        try {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String screenshotName = filename + "_" + timestamp + ".png";

            TakesScreenshot ts = (TakesScreenshot) driver;
            File file = ts.getScreenshotAs(OutputType.FILE);
            File target = new File(System.getProperty("user.dir") + "/screenshots");

            if (!target.exists()) {
                target.mkdir();
            }

            FileHandler.copy(file, new File(target.toString() + "/" + screenshotName + ".png"));


	
	/**
     * Description: Logs a message at the TRACE level.
     * @param WebDriver, String
     * @return NA
     */
    public static void screenshot(WebDriver driver,String filename){
        try {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String screenshotName = filename + "_" + timestamp + ".png";
    
            TakesScreenshot ts = (TakesScreenshot) driver;
                File file = ts.getScreenshotAs(OutputType.FILE);
                File target = new File(System.getProperty("user.dir")+"/screenshots");
                
                if(!target.exists()){
                    target.mkdir();
                }
    
                FileHandler.copy(file, new File(target.toString()+"/"+screenshotName+".png"));
            

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

