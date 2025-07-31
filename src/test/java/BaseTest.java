import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import io.github.bonigarcia.wdm.managers.InternetExplorerDriverManager;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class BaseTest {

   public WebDriver driver;
    String emaili = "gyanalipu.mohanty@gmail.in";
    String passc = "pihu@123";

    public WebDriver initDriver() throws IOException {
        String pathofpropfile= System.getProperty("user.dir")+ File.separator+"TestFiles"+File.separator+"Prop.properties";
        FileInputStream fis=new FileInputStream(pathofpropfile);
        Properties properties=new Properties();
        properties.load(fis);
        String browserName= properties.getProperty("Browser");

        if (browserName.equalsIgnoreCase("Chrome"))
        {
            ChromeDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("Firefox"))

        {
            FirefoxDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }else if (browserName.equalsIgnoreCase("Ie"))

        {
            InternetExplorerDriverManager.iedriver().setup();
            driver=new InternetExplorerDriver();
        }

        return driver;
    }

    public WebDriver Parentwindow() {
        Set<String> set = driver.getWindowHandles();
        Iterator<String> it = set.iterator();
        String parent = it.next();
        return driver.switchTo().window(parent);


    }

    public WebDriver Childwindow() {
        Set<String> set = driver.getWindowHandles();
        Iterator<String> it = set.iterator();
        String parent = it.next();
        String Child = it.next();
        return driver.switchTo().window(Child);


    }
    public String screshoot(String TestcaseName,WebDriver driver) throws IOException {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy_HHmmss");
        String formattedDateTime = formatter.format(date);
        String pathdestn=System.getProperty("user.dir")+ File.separator+"Screenshots"+ File.separator+"Screenshot_"+TestcaseName+formattedDateTime+".png";
        File filedest=new File(pathdestn);
        TakesScreenshot ts=(TakesScreenshot)driver;
        File filSource=ts.getScreenshotAs(OutputType.FILE);
        FileUtil.copyFile(filSource,filedest);

        return "../Screenshots/Screenshot_" + TestcaseName + "_" + formattedDateTime + ".png";
    }

    @BeforeMethod(alwaysRun = true)
    public void launchweb() throws IOException, InterruptedException {
       // Sharaf DG Staging Website Details
       // https://uae.sdgstage.com
        //Basic auth username: nginx
        //Basic auth password: Y2XD.4vM9xcfh0!E]QI9wTu}UcTkMO)oPGn


        initDriver().get("https://nginx:Y2XD.4vM9xcfh0!E]QI9wTu}UcTkMO)oPGn@uae.sdgstage.com");

        Thread.sleep(2000);
        driver.manage().window().maximize();



    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }



}



