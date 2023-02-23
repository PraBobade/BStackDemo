package TestCases.BuyProduct;


import PageObject.BuyProduct.OB_BP_004;
import org.testng.annotations.Test;

public class TC_BP_004 extends OB_BP_004 {
    //Validate Check out without Any shipping Address.
    @Test
    public void Test4() throws InterruptedException {
        Log.info("Validate Check out without Any shipping Address.");
        OB_BP_004 OB = new OB_BP_004();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.ClickOnSubmitWithOutShippingAddress();
        OB.ValidateMsg("true");
    }
}
