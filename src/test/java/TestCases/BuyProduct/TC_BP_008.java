package TestCases.BuyProduct;

import PageObject.BuyProduct.OB_BP_007;
import PageObject.BuyProduct.OB_BP_008;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_BP_008 extends OB_BP_008 {
    //Validate Sending all Correct information in shipping address but send PostalCode as String.
    @Test
    public void Test8() throws InterruptedException {
        Log.info("Validate Sending all Correct information in shipping address but send PostalCode as String.");
        OB_BP_008 OB  = new OB_BP_008();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddPostalCodeString("Rahul","LastName","Address","bihar","TEXTPostalCode");
        OB.ClickOnSubmit();
        OB.ValidateOrderShouldNotPlace();

    }
}
