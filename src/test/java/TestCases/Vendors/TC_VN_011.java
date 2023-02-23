package TestCases.Vendors;


import PageObject.Vendors.OB_VN_011;
import org.testng.annotations.Test;

public class TC_VN_011 extends OB_VN_011 {
    //Validate Vendors option For all product.
    @Test
    public void Test11() throws InterruptedException {
Log.info("Validate Vendors option For all product.");
        OB_VN_011 OB =new OB_VN_011();
        OB.LoginToApplication();
        OB.SelectAllVendor();
        OB.ValidateTotalProductsAvailable();
        OB.ValidateAllProducts();

    }
    }

