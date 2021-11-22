package mindtree.BDDBigSmall.utility;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static ExtentReports report;
	public static ExtentTest test;

	public static WebDriver initializeBrowser() {

		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\M1073173\\SeleniumStuff\\BDDBigSmall\\src\\test\\resources\\config.properties");
			prop.load(fis);

			String browserName = prop.getProperty("browser");
			String driverPath = prop.getProperty("driverPath");

			if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", driverPath);
				driver = new ChromeDriver();
			} else if (browserName.equals("edge")) {

				System.setProperty("webdriver.edge.driver", driverPath);
				driver = new EdgeDriver();
			} else {
				System.out.println("No browser Driver Specified for " + browserName);
			}

			// Implicit wait to avoid element not found exception
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Maximize browser
			driver.manage().window().maximize();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return driver;

	}

}
