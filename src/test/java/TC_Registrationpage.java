import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Registrationpage extends BaseTest {

@Test
    public void registration() throws InterruptedException {


    String Windowtittle="My Account – Sharaf DG UAE";
    String emailid="gyanalipim.mohanty@gmail.in";
    String passw="pihu@123";
    String FstName="Gyana";
    String LstName="Mohanty";
    String MobNum="550300429";

    PageObject_Registration reg=new PageObject_Registration(driver);
    reg.Cookiehandle();
    reg.navigatesignin();
    Thread.sleep(2000);
    Assert.assertEquals(driver.getTitle(),Windowtittle,"not adding on my account registration page");
    reg.createaccount();

    reg.email(emailid);
    reg.password(passw);
    reg.firstName(FstName);
    reg.lastName(LstName);
    reg.MobileNum(MobNum);
    Thread.sleep(200);
    reg.checkBox();
    reg.submitclick();
    Assert.assertTrue(reg.userdashboardbutton().isDisplayed(),"userdashboard dropdown button not visible");








    }


}
