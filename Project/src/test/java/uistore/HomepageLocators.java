package uistore;

import org.openqa.selenium.By;

public class HomepageLocators {

        public static By footerLinks = By.xpath("//li[@class='sui-text-sm sui-mb-2 sui-underline']/a");

        public static By searchBarClick = By.xpath("//input[@id='typeahead-search-field-input']");
        public static By searchBarIconClick = By.id("typeahead-search-icon-button");

        public static By careers = By.cssSelector("a[href='https://careers.homedepot.com/']");
        public static By corporateInformation = By.cssSelector("a[href='https://corporate.homedepot.com/']");
        public static By digitalNewsroom = By.xpath("//a[@alt='Digital Newsroom']");
        public static By HDFoundation = By.cssSelector("a[alt='Home Depot Foundation']");
        public static By investorsRelations = By.xpath("//a[@alt='Investor Relations']");
        public static By suppliersProviders = By.xpath("//a[@href='/c/suppliers_and_providers']");
        public static By governmentsCustomers = By.xpath("//a[@title='Government Customers']");
        public static By affiliateProgram = By
                        .cssSelector("a[href='https://www.homedepot.com/c/SF_MS_The_Home_Depot_Affiliate_Program']");
        public static By ecoActions = By.xpath("//a[@alt='Eco Actions']");

        public static By clickshopall = By.cssSelector("button[data-testid='header-button-Shop All']");
        public static By clickSavings = By.id("menu-item-id-7dXOWs1aPY2W48fWUYKp0n");

        public static By clickAllSavings = By.id("menu-item-id-6DDUSZAwiVUKrMhR841Mk0");

        public static By verifySavingCenter = By.xpath("//h1[contains(text(),'SAVINGS CENTER')]");

        public static By verifyShopBydepartment = By.xpath("//span[contains(text(),'Shop By Department')]");

        public static By clickondeparetment = By.xpath(
                        "(//span[@class='sui-font-regular sui-text-base sui-tracking-normal sui-normal-case sui-line-clamp-unset sui-font-normal sui-text-primary group-focus-visible/sui-menu-item:sui-text-inverse'])[3]");

        public static By verifyappliances = By.xpath("(//span[contains(text(),'Appliances')])[2]");

        public static By selectappliances = By.cssSelector("[id='menu-item-id-1WzEG1m6Q4uGb1Sl04qQOk']");

        public static By verifyshopallappliances = By.xpath("//span[contains(text(),'Shop All Appliances')]");

        public static By clickshopallappliances = By
                        .cssSelector("a[href='/b/Appliances/N-5yc1vZbv1w'][data-testid='menu-item-id-77ouRyqbJMBL1bSPQCk133']");

        public static By verifyAPPLIANCES = By.xpath("//h1[contains(text(),'Appliances')]");

        public static By clickKitchenAppliancesPackages = By
                        .cssSelector("a[href='https://www.homedepot.com/b/Appliances-Kitchen-Appliance-Packages/N-5yc1vZ2fkpfuj']");

        public static By verifykITCHENAppliancesPackahes = By
                        .xpath("//h1[contains(text(),'KITCHEN APPLIANCE PACKAGES')]");

        public static By clickDIY = By.cssSelector("button[data-testid='header-button-DIY']");

        public static By clcikFReeWorkshops = By.id("menu-item-id-6YhoLf9ZeosLGieEGaRCoB");

        public static By verifyFreeWorkshops = By.xpath("//p[contains(text(),'Free Workshops')]");

        public static By clickkidsworkshops = By.cssSelector("a[id='menu-item-id-47TL36DOOOPklZDcmLgPCN']");

        public static By verifyKidsworkshops = By.xpath("//span[contains(text(),'Kids Workshops')]");

        public static By NavbarServicesClicking = By.xpath("(//p[text()='Services'])[1]");
        public static By ServiceHeadingVerify = By.xpath("(//p[text()='Services'])[2]");
        public static By HomePageInstallationandServicesClicking = By.xpath("//span[text()='Installation & Services']");
        public static By ViewInstallationandservices = By.xpath("//span[text()='View All Installation & Services']");

        public static By storelocatorclick = By
                        .cssSelector("a[class='sui-ml-1 md:sui-underline'][title='Store Locator']");
        public static By privacyandsecurityclick = By
                        .cssSelector("a[class='sui-ml-1 md:sui-underline'][title='Privacy & Security Statement']");
        public static By termsclick = By.cssSelector("a[class='sui-ml-1 md:sui-underline'][alt='Terms']");
        public static By mypreferencecenterclickon = By
                        .cssSelector("a[class='sui-ml-1 md:sui-underline'][title='My Preference Center']");
        public static By sitemapclick = By
                        .cssSelector("a[class='sui-hidden md:sui-block sui-ml-1 md:sui-underline'][title='Site Map']");
        public static By storedirectoryclick = By
                        .cssSelector("a[class='sui-hidden md:sui-block sui-ml-1 md:sui-underline'][title='Store Directory']");
        public static By verifyInfo = By.cssSelector("div[class='info']");

        public static By homepageshopcategoryclick = By.xpath(
                        "//div[@class='sui-flex-auto sui-text-xs sui-leading-normal sui-font-bold'][contains(text(),'Building Materials')]");

        public static By gift = By.xpath("//a[@title='Gift Cards']");
        public static By privacy = By.xpath("//a[@title='Privacy & Security Center']");
}
    

