package TestCases.BuyProduct;

import PageObject.BuyProduct.OB_BP_008;
import PageObject.BuyProduct.OB_BP_010;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_BP_010 extends OB_BP_010 {
    //Validate successfully order placed message.
    @Test
    public void Test10() throws InterruptedException {
        Log.info("Validate successfully order placed message.");
        OB_BP_010 OB  = new OB_BP_010();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddPostalCodeString("Rahul","LastName","Address","bihar","TEXTPostalCode");
        OB.ClickOnSubmit();
        OB.ValidateOrderPlacedMessage("Your Order has been successfully placed.");

    }
}
