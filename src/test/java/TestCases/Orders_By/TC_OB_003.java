package TestCases.Orders_By;

import PageObject.Orders_By.OB_OB_002;
import PageObject.Orders_By.OB_OB_003;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_OB_003 extends OB_OB_003 {
    //Validate order_by By  Highest to Lowest
    @Test
    public void Test3() throws InterruptedException {
        Log.info("Validate order_by By  Highest to Lowest");
        OB_OB_003 OB = new OB_OB_003();
        OB.SelectOrderByLowestToHighest();
        OB.ValidateProductIsAccordingToOrderBy();


    }
}
