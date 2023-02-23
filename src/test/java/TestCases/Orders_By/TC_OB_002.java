package TestCases.Orders_By;

import PageObject.Orders_By.OB_OB_002;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_OB_002 extends OB_OB_002 {
    //Validate order_by By Lowest to Highest
    @Test
    public void Test2() throws InterruptedException {
        Log.info("Validate order_by By Lowest to Highest");
        OB_OB_002 OB = new OB_OB_002();
        OB.SelectOrderByHighestToLowest();
        OB.ValidateProductIsAccordingToOrderBy();
    }
}
