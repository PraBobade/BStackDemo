package TestCases.BuyProduct;

import PageObject.BuyProduct.OB_BP_001;
import PageObject.BuyProduct.OB_BP_009;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_BP_009 extends OB_BP_009 {
    //Validate click on 'Stack Demo' Option to Navigate Home page, After order placed.
    @Test
    public void Test9() throws InterruptedException {
        Log.info("Validate click on 'Stack Demo' Option to Navigate Home page, After order placed.");
        OB_BP_009 OB = new OB_BP_009();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddShippingAddressCorrect();
        OB.ClickOnSubmit();
        OB.ClickOnStackDemoLogo();
        OB.ValidateUserIsOnHomePage();
    }
}
