package TestCases.Add_To_Cart;

import PageObject.Add_To_Cart.OB_AC_001;
import org.testng.annotations.Test;

public class TC_AC_001 extends OB_AC_001 {
    //Validate adding the product to Cart from 'Product Display' Page
    @Test
    public void Test1(){
        Log.info("Validate adding the product to Cart from 'Product Display' Page");
        OB_AC_001 OB = new TC_AC_001();
        OB.LoginToApplication();
        OB.AddProductToCart();
        OB.CheckProductAddedToCartOrNot();
    }
}
