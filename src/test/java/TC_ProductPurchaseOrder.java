
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_ProductPurchaseOrder extends BaseTest {
    String ConfirmationMesgExpected = " Thank you for 20 years of tech, trust, and transformation. ";

    @Test
    public void purchaseOrder() throws InterruptedException {
        PageObject_Registration reg = new PageObject_Registration(driver);
        reg.Cookiehandle();
        PageObject_Productpurchase pp = new PageObject_Productpurchase(driver);
        pp.searchbar("Apple iPhone 14 Pro (256GB) – Silver");
        Thread.sleep(2000);
        pp.productselection();
        pp.addtoCart();
        pp.proceedToCheckout();

        PageObject_Login loginpo = new PageObject_Login(driver);
        loginpo.emailidelement(emaili);
        loginpo.nextbtn();
        loginpo.loginwithpw();
        Thread.sleep(2000);
        loginpo.passwordele(passc);
        loginpo.loginelement();
        pp.ClickOnState();

        Thread.sleep(200);
        pp.selectState("Sharjah");

        pp.SelectAreaField();
        Thread.sleep(200);

        pp.AreaSelect();
        pp.shipingAddres("4th Block Abu shagara , UAE");
        Thread.sleep(2000);


        pp.CODSelect();
        Thread.sleep(300);
        pp.PlaceOrder();
        Assert.assertEquals(pp.ConfirmationMesg().getText().trim(), ConfirmationMesgExpected.trim(), "message confirmation is not matching");


    }
}
