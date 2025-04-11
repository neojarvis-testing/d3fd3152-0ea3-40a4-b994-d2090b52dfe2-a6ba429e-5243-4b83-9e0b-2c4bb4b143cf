package uistore;

import org.openqa.selenium.By;

public class ProductsPageLocators {
    public static By wrench = By.xpath("//h1[contains(text(),'wrench')]");
 
    public static By wrenchSetsClick = By.xpath("//span[contains(text(),'Wrench Sets')]");
    public static By ratcheting =By.xpath("(//span[contains(text(),'Ratcheting Wrenches')])");
    public static By adjustablewrenches =By.xpath("(//span[contains(text(),'Adjustable Wrenches')])");
    public static By impactWrenches =By.xpath("(//span[contains(text(),'Impact Wrenches')])[1]");

     
     public static By productpageclickonconcrete=By.xpath("(//a[contains(text(),'Concrete, Cement & Masonry')])");
 
     public static By productpageclickondecking=By.xpath("(//a[contains(text(),'Decking')])");
     public static By productpageclickoninsulation=By.xpath("(//a[contains(text(),'Insulation')])");
     public static By productpageclickondrywall=By.xpath("(//a[contains(text(),'Drywall')])");
 
     public static By productpageclickonshopalldrywall=By.xpath("//a[contains(text(),'Shop All Drywall')]");
 
     public static By productpageclickonallfilters=By.xpath("//div[@class='sui-pl-2 sui-text-nowrap']//p[contains(text(),'All Filters')]");
}
