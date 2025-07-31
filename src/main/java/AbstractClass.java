import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractClass {

    WebDriver driver;

    public AbstractClass(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement waitVisibilityofText(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOf(element));

    }

    public Select SelectText(WebElement element) {
        return new Select(element);
    }

    public void ScrollBywindowarguments(int x, int y)
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
    }

    public void scrollIntoView(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void ScrolltoHight(WebDriver driver)
    {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, document.body.scrollHeight);");
    }

    public void ScrollBywindowargumentsClick(WebDriver driver,WebElement element)
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",element);
    }

}
