import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.util.Date;

public class ExtentReportNG {

    public static ExtentReports getReportObject()
    {
        Date date= new Date();
        String dtfString=date.toString();
        String dtString=	dtfString.replace(" ", "_").replace(":", "_").trim();



        String path = System.getProperty("user.dir")+ File.separator+"TestFiles"+ File.separator+dtString+"report.html";
        ExtentSparkReporter spark = new ExtentSparkReporter(path);
        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Extent Report for Regression");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Tester","Gyana");
        return extent;


    }


}
