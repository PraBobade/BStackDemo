package TestCases.BuyProduct;

import PageObject.BuyProduct.OB_BP_011;
import PageObject.BuyProduct.OB_BP_013;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_BP_013 extends OB_BP_013 {
    //Validate the Order is present in Orders Section or not after order placed.
    @Test
    public void Test13() throws InterruptedException {
        Log.info("Validate the Order is present in Orders Section or not.");
        OB_BP_013 OB  = new OB_BP_013();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddShippingAddressDetails("Rahul","LastName","Address","bihar","TEXTPostalCode");
        OB.ClickOnSubmit();
        OB.ValidateOrderPlacedMessage("Your Order has been successfully placed.");
        OB.ClickOnContinueShoppingOption();
        OB.NavigateToOrdersSection();
        OB.CheckProductIsAvailableOrNotInOrderSection();



    }
}
