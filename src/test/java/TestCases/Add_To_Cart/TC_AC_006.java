package TestCases.Add_To_Cart;

import PageObject.Add_To_Cart.OB_AC_006;
import PageObject.Add_To_Cart.OB_AC_011;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_AC_006 extends OB_AC_006 {
    //Validate Adding more than one different products and Check the total Price.
    @Test
    public void Test6(){
        Log.info("Validate Adding more than one different products and Check the total Price.");
        OB_AC_006 OB = new OB_AC_006();
        OB.LoginToApplication();
        OB.AddProductsToCart();
        OB.CheckAdditionOfPrice();
        OB.CheckActualPrice();


    }
}
