package TestCases.BuyProduct;


import PageObject.BuyProduct.OB_BP_013;
import PageObject.BuyProduct.OB_BP_016;
import org.testng.annotations.Test;

public class TC_BP_016 extends OB_BP_016 {
    // Validate after buy product there is no product in Bag
    @Test
    public void Test16(){
        Log.info("Validate after buy product there is no product in Bag");

        OB_BP_016 OB  = new OB_BP_016();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.ClickOnCheckOutOption();
        OB.AddShippingAddressDetails("Rahul","LastName","Address","bihar","TEXTPostalCode");
        OB.ClickOnSubmit();
        OB.ClickOnContinueShoppingOption();
        OB.NavigateToBagSection();
        OB.ValidateProductIsAvailableOrNot();


    }


}
