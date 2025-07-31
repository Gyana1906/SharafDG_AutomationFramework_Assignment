import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_Login extends AbstractClass {

    WebDriver driver;

    public PageObject_Login(WebDriver driver) {
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(name = "phone-email")
    WebElement emailid;


    @FindBy(xpath = "//input[@value='Next']")
    WebElement nextbutton;
    @FindBy(id = "login_with_password")
    WebElement loginwithpassword;


    @FindBy(id = "password")
    WebElement passwordelement;


    @FindBy(name = "login")
    WebElement loginele;


    public void loginelement() {
        loginele.click();
    }

    public void passwordele(String passcode) {
        passwordelement.sendKeys(passcode);

    }


    public void loginwithpw() {
        waitVisibilityofText(loginwithpassword).click();
    }


    public void nextbtn() {

        waitVisibilityofText(nextbutton).click();

    }

    public void emailidelement(String email_id) {
        emailid.sendKeys(email_id);
    }


}
