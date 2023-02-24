package TestCases.BuyProduct;

import PageObject.BuyProduct.OB_BP_011;
import PageObject.BuyProduct.OB_BP_012;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_BP_012 extends OB_BP_012 {
    //Validate Order number.
    @Test
    public void Test12() throws InterruptedException {
        Log.info("Validate Order number.");
        OB_BP_012 OB  = new OB_BP_012();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddShippingAddressDetails("Rahul","LastName","Address","bihar","TEXTPostalCode");
        OB.ClickOnSubmit();
        OB.ValidateOrderPlacedMessage("Your Order has been successfully placed.");
        OB.ValidateOrderNumber();

    }
}
