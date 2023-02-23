package TestCases.Add_To_Cart;

import PageObject.Add_To_Cart.OB_AC_009;
import org.testng.annotations.Test;

public class TC_AC_009 extends OB_AC_009 {
    //Validate Orders When there is no product Buy.
    @Test
    public void Test9(){
        Log.info("Validate Orders When there is no product Buy.");
        OB_AC_009 OB = new TC_AC_009();
        OB.LoginToApplication();
        OB.GoToOrders();
        OB.ValidateProductAvailableOrNot("No orders found");

    }
}
