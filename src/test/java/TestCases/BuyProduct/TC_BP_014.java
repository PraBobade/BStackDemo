package TestCases.BuyProduct;

import PageObject.BuyProduct.OB_BP_013;
import PageObject.BuyProduct.OB_BP_014;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_BP_014 extends OB_BP_014 {
    //Validate the Order placed Date.
    @Test
    public void Test14(){
        Log.info("Validate the Order placed Date.");
        OB_BP_014 OB  = new OB_BP_014();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddShippingAddressDetails("Rahul","LastName","Address","bihar","TEXTPostalCode");
        OB.ClickOnSubmit();
        OB.ClickOnContinueShoppingOption();
        OB.NavigateToOrdersSection();
        OB.ValidateDateIsPresentOrNot();

    }
}
