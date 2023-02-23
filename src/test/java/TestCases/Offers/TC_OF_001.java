package TestCases.Offers;

import PageObject.Offers.OB_OF_001;
import org.testng.annotations.Test;

public class TC_OF_001 extends OB_OF_001 {
    //Validate total Offers available for user.
    @Test
    public void Test1() throws InterruptedException {
       Log.info("Validate total Offers available for user.");
        OB_OF_001 OB = new OB_OF_001();
        OB.LoginToApplication();
        OB.NavigateToOffers();
        OB.ValidateOffersAvailableOrNot();

    }
}
