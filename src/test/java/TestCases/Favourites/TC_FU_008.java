package TestCases.Favourites;

import PageObject.Favourite.OB_FU_007;
import PageObject.Favourite.OB_FU_008;
import org.testng.annotations.Test;

public class TC_FU_008 extends OB_FU_008 {
    //Validate Add product to favorite then select Order_By (Lowest To Highest) and check Product is available in favorite or not.
    @Test
    public void Test8() throws InterruptedException {
        Log.info("Validate Add product to favorite then select Order_By (Lowest To Highest) and check Product is available in favorite or not.");
        OB_FU_008 OB = new OB_FU_008();
        OB.LoginToApplication();
        OB.AddProductToFavourite();
        OB.SelectOrderByLowestToHighest();
        OB.GoToFavoriteOption();
        OB.ValidateProductInFavourite("1 Product(s) found.");


    }


}
