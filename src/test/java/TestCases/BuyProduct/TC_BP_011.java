package TestCases.BuyProduct;

import PageObject.BuyProduct.OB_BP_011;
import org.testng.annotations.Test;

public class TC_BP_011 extends OB_BP_011 {
    //Validate Download Order receipt option.
    @Test
    public void Test11() throws InterruptedException {
        Log.info("Validate Download Order receipt option");
        OB_BP_011 OB  = new OB_BP_011();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddShippingAddressDetails("Rahul","LastName","Address","bihar","TEXTPostalCode");
        OB.ClickOnSubmit();
        OB.ValidateOrderPlacedMessage("Your Order has been successfully placed.");
        OB.ClickOnDownloadReceiptOption();
        OB.validateFileIsDownloadedOrNot();
    }

}
