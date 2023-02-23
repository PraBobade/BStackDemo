package TestCases.Orders_By;

import PageObject.Orders_By.OB_OB_001;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_OB_001 extends OB_OB_001 {
    //Validate placeholder for order by function
    @Test
    public void Test1(){
        Log.info("Validate placeholder for order by function");
        OB_OB_001 OB = new OB_OB_001();
        OB.GetPlaceHolderOfOrderBy();
        OB.ValidatePlaceHolder("Select\n" +
                "Lowest to highest\n" +
                "Highest to lowest");
    }
}
