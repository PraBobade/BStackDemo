package TestCases.Vendors;

import PageObject.Vendors.OB_VN_009;
import PageObject.Vendors.OB_VN_010;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_VN_010 extends OB_VN_010 {
    //Validate Vendors option For Google and OnePlus product only
    @Test
    public void Test10() throws InterruptedException {
Log.info("Validate Vendors option For Google and OnePlus product only");
        OB_VN_010 OB =new OB_VN_010();
        OB.LoginToApplication();
        OB.SelectVendorGoogleAndOnePlus();
        OB.ValidateTotalProductsAvailable();
        OB.ValidateAllProducts();}


}
