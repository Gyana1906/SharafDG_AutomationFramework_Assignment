import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_Registration extends AbstractClass{

    WebDriver driver;

    public PageObject_Registration(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//button[text()='OK']")
    WebElement cookiebtn;

    @FindBy(xpath = "//span[@class='signin-text']")
    WebElement SigninBtn;

    @FindBy(css = "a[class='btn btn-secondary']")
    WebElement createAccountPagebtn;


    @FindBy(id ="reg_email")
    WebElement emailid;



    @FindBy(id ="reg_password")
    WebElement password;


    @FindBy(id ="first_name")
    WebElement firstname;

    @FindBy(id ="last_name")
    WebElement lastname;
    @FindBy(id ="account_mobile_no")
    WebElement mobilenum;

    @FindBy(css =".input-checkbox.checkbox")
    WebElement checkboxselect;



    @FindBy(xpath ="//input[@type='submit']")
    WebElement submitclick;


    @FindBy(css =".sh.sh-login")
    WebElement userdashboardbutton;

    public WebElement userdashboardbutton()
    {
      return  waitVisibilityofText(userdashboardbutton);
    }


    public void Cookiehandle()
   {
       cookiebtn.click();

   }
public void navigatesignin()
{  SigninBtn.click();

}
    public void createaccount()
    {
        createAccountPagebtn.click();
    }

    public void email(String mail)
    {

        emailid.sendKeys(mail);
    }

    public void password(String pw)
    {
        password.sendKeys(pw);
    }


    public void firstName(String fstname)
    {
        firstname.sendKeys(fstname);
    }

    public void lastName(String lastName)
    {
        lastname.sendKeys(lastName);
    }

    public void MobileNum(String phoneNum)
    {
        mobilenum.sendKeys(phoneNum);
    }

    public void checkBox()
    {
        waitVisibilityofText(checkboxselect).click();
    }
    public void submitclick()
    {
        ScrollBywindowarguments(0,550);

        waitVisibilityofText(submitclick).click();    }
}
