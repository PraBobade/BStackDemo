package TestCases.Orders_By;

import PageObject.Orders_By.OB_OB_003;
import PageObject.Orders_By.OB_OB_004;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_OB_004 extends OB_OB_004 {
    //Validate order_by By selecting nothing.
    @Test
    public void Test4() throws InterruptedException {
        Log.info("Validate order_by By selecting nothing.");
        OB_OB_004 OB = new OB_OB_004();
        OB.ValidateFirstProductBefore();
        OB.SelectOrderByNothing();
        OB.ValidateProductDisplayAfter();

    }
}
