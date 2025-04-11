package uistore;

import org.openqa.selenium.By;

public class InformationPageLocators {

    public static By clicklearnmore = By.xpath("//a[contains(text(),'Learn More')]");

    public static By clickregisternow = By.cssSelector("a[href='#register']");

    public static By verifyparentname = By.xpath("//label[contains(text(),'Parent / Guardian First Name')]");
    public static By clickparentfirstnamefield = By.cssSelector("[placeholder='Parent / Guardian First Name']");
    public static By clickparentlastnamefield = By.cssSelector("[placeholder='Parent / Guardian Last Name']");
    public static By clickemailfield = By.cssSelector("[placeholder='johndoe@john.doe']");
    public static By selectchooseyourworkshsop = By.xpath("(//span[contains(text(),'Select an Option')])[1]");
    public static By clickchoosebuffermay = By.xpath("//li[contains(text(),'Birdy Buffet May 3, 2025')]");

    public static By selecthowdidyouhearaboutus = By.xpath("(//span[contains(text(),'Select an Option')])[1]");

    public static By clickfriendfamilymember = By.xpath("//li[contains(text(),'Friend / Family Member')]");
    public static By clickregister = By.xpath("//button[contains(text(),'Register')]");
   
    public static By VerifyHomeServicesHeading = By.xpath("//h1[text()='Home Services']");
    
    public static By flooringclick = By.xpath("//a[text()=' Flooring ']");
    public static By VerifyFlooringInstallationheading = By.xpath("//h1[text()='Flooring Installation']");

    public static By BathroomClicking = By.cssSelector("a[href='/services/c/bathroom-installation/d9843b7cb']");
    public static By VerifyBathroomInstallationServiceHeading = By
            .xpath("//h1[text()='Bathroom Installation Services']");
    public static By zipcodeOnVerifcationPage = By.cssSelector("input[name='postal']");

    public static By Doorsandwindowclicking = By.cssSelector("a[href='/services/h/windows-doors']");
    public static By VerifyWindowAndDoorServicesHeading = By.xpath("//h1[text()='Window & Door Services']");
    public static By ImageonVerificationPage = By.cssSelector("img[alt='Exterior and Interior Door Installation']");

    public static By HeatingAndCoolingClicking = By.cssSelector("a[href='/services/c/hvac-services/c16fbb4b7']");
    public static By VerifyHVACServicesHeading = By.xpath("//h1[text()='HVAC Services']");
    public static By inputfieldonVerificationPage = By.cssSelector("input[name='postal']");
    
    public static By creditCLick = By.xpath("(//a[@class='sui-text-sm sui-mb-2 sui-underline'])[2]");

    public static By applyNowClick = By.xpath("//a[text()='Apply Now']");

    public static By firstNameClick = By.id("cui_first_name");
    public static By lastNameClick = By.id("cui_last_name");
    public static By emailClick = By.id("cui_email_address");
    public static By phoneClick = By.id("cui_phone_number");

    public static By continueClick1 = By.id("nextContactInfo");

    public static By addressClick = By.id("cui_street_address");
    public static By cityClick = By.id("cui_city");
    public static By stateClick = By.id("cui_state");
    public static By zipClick = By.id("cui_zip_code");
    public static By continueClick2 = By.id("nextReviewInfo");

    public static By residenceClick = By.id("cui_residence_status");
    public static By monthlyPaymentClick = By.id("cui_monthly_payment");
    public static By annualIncomeClick = By.id("cui_annual_income");
    public static By dobClick = By.id("cui_date_of_birth");
    public static By socialSecurityClick = By.id("cui_social_security");
    public static By continueClick3 = By.id("nextReviewInfo");
    public static By verifyAllDetais = By.cssSelector("div[class='info']");
    public static By verifyAccountTerms = By.cssSelector(".tncHeader");

    public static By continueClick4 = By.id("contToSubmit");

}
