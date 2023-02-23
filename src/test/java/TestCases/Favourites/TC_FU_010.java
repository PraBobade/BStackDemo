package TestCases.Favourites;

import PageObject.Favourite.OB_FU_003;
import PageObject.Favourite.OB_FU_010;
import org.testng.annotations.Test;

public class TC_FU_010 extends OB_FU_010 {
    //validate all products Add Favourite.
    @Test
    public void Test10() throws InterruptedException {
        Log.info("validate all products Add Favourite.");
        OB_FU_010 OB = new OB_FU_010();
        OB.LoginToApplication();
        OB.AddAllProductsToFavourite();
        OB.GoToFavoriteOption();
        OB.ValidateProductInFavourite("25 Product(s) found.");
    }
}
