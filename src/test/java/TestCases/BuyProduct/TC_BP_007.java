package TestCases.BuyProduct;


import PageObject.BuyProduct.OB_BP_007;
import org.testng.annotations.Test;

public class TC_BP_007 extends OB_BP_007 {
    //Validate checkout without sending State and Postal code in shipping Address.
    @Test
    public void Test7() throws InterruptedException {
        Log.info("Validate checkout without sending State and Postal code in shipping Address.");
        OB_BP_007 OB  = new OB_BP_007();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddShippingAddressWithoutPostalCodeAndState("Rahul","LastName","Address");
        OB.ClickOnSubmit();
        OB.ValidateMsg("true");
    }
}
