import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PageObject_Productpurchase extends AbstractClass {

    WebDriver driver;


    public PageObject_Productpurchase(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(className = "aa-Input")
    WebElement searchbar;


    @FindBy(xpath = "//div[contains(text(),'(256GB) - Silver')]")
    WebElement productselect;


    @FindBy(css = "div[id='nav-delivery'] div[class='add-to-cart-wrp clearfix']")
    WebElement addToCart;


    @FindBy(css = ".checkout-button.button.alt.wc-forward.btn.btn-primary")
    WebElement Toocheckout;


    @FindBy(css = ".selectize-control.state_select.single")
    WebElement clickonstate;

    @FindBy(css = ".selectize-dropdown-content")
    List<WebElement> selectfromdropdownstate;


    @FindBy(css = ".selectize-input.items.not-full.has-options")
    WebElement selectarea;


    @FindBy(xpath = "//div[text()='Abu Shagara']")
    WebElement areaElement;

    // driver.findElement(By.id("shipping_address_1")).sendKeys("4th Block Abu shagara , UAE");

    @FindBy(id = "shipping_address_1")
    WebElement Shipaddress;


    @FindBy(css = "label[for='payment_method_cod']")
    WebElement CashOnDelivery;

    @FindBy(id = "place_order")
    WebElement placeOrder;


    @FindBy(xpath = "//h3[contains(text(),'Thank you')]")
    WebElement ThankuMesgActual;

    public WebElement ConfirmationMesg()
    {
      return   waitVisibilityofText(ThankuMesgActual);

    }

    public void PlaceOrder()
    {
        waitVisibilityofText(placeOrder).click();

    }





    public void CODSelect() throws InterruptedException {


        ScrollBywindowarguments(0, 1000);
        ScrolltoHight(driver);

        Thread.sleep(200);
        ScrollBywindowargumentsClick(driver, CashOnDelivery);


    }


    public void shipingAddres(String address) {
        Shipaddress.sendKeys(address);


    }

    public void AreaSelect() {
        ScrollBywindowarguments(0, 5000);
        areaElement.click();
    }


    public void SelectAreaField() {
        waitVisibilityofText(selectarea).click();
    }


    public void selectState(String State) {
        for (WebElement li : selectfromdropdownstate) {
            if (li.getText().equalsIgnoreCase(State)) ;
            {
                li.click();
                //System.out.println(li.getText());
                break;
            }
        }
    }


    public void ClickOnState() {
        clickonstate.click();
    }

    public void proceedToCheckout() {
        waitVisibilityofText(Toocheckout).click();
    }

    public void addtoCart() {
        waitVisibilityofText(addToCart).click();
    }

    public void productselection() {
        productselect.click();
    }

    public void searchbar(String keys) {
        searchbar.sendKeys(keys);
    }


}