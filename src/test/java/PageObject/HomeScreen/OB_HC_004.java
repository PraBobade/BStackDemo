package PageObject.HomeScreen;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OB_HC_004 extends BaseClass {
    //Validate Total Vendors Present on Home Screen
    int ActualVendor;
    public void getVendorCount(){
        ActualVendor = driver.findElements(By.cssSelector("span[class='checkmark']")).size();
    }
    public void ValidateTotalVendors(int ExpectedVendors){
        if (ExpectedVendors == ActualVendor){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
    }


}
