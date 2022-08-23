package listners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportgen {

		static ExtentReports extent;
		public static ExtentReports extentReportGenerator()
		{
			String path = System.getProperty("user.dir")+"//reports//InsuranceReport.html";
			
			ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
			
			reporter.config().setTheme(Theme.DARK);
			
			reporter.config().setReportName("Policy bazaar Report");
			
			extent = new ExtentReports();
			
			extent.attachReporter(reporter);
			
			extent.setSystemInfo("Project name", "PolicyBazaar");
			
			extent.setSystemInfo("Environment", "SIT");
			
			extent.setSystemInfo("Executed by", "sneha ingle");
					
			return extent;
		}



	
}
