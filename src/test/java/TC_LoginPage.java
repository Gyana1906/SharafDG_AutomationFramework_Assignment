import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_LoginPage extends BaseTest {



    @Test
    public void loginPage() throws Exception {
        PageObject_Registration reg = new PageObject_Registration(driver);
        reg.Cookiehandle();
        reg.navigatesignin();
        Thread.sleep(2000);

        PageObject_Login loginpo = new PageObject_Login(driver);
        loginpo.emailidelement(emaili);
        loginpo.nextbtn();
        loginpo.loginwithpw();
        Thread.sleep(2000);
        loginpo.passwordele(passc);
        loginpo.loginelement();
        Assert.assertTrue(reg.userdashboardbutton().isDisplayed(), "userdashboard dropdown button not visible");


    }
}
