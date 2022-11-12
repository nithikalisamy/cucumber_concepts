package TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

	public WebDriver driver;
//	public LandingPage landingPage;

	public WebDriver InitialiseDriver() throws IOException {
		System.out.println("BaseTest.InitialiseDriver");

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+ "//src//main//java//nithiautomationpractice//resources//globaldata.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.contains("chrome")) {
			System.out.println("Openign Browser Chrome : " + browserName);			
			ChromeOptions browserOption = new ChromeOptions();
			if(browserName.contains("headless"))
			{
				browserOption.addArguments("headless");
			}			
			System.setProperty("webdriver.chrome.driver", "D:\\Nithi\\Studies\\Selenium\\Setup\\chromedriver-105.exe");
			driver = new ChromeDriver(browserOption);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://automationpractice.com/index.php");

		return driver;

//		login();
	}

//	@BeforeTest(alwaysRun = true)
//	public LandingPage LaunchApplication() throws IOException {
//		driver = InitialiseDriver();
//		landingPage = new LandingPage(driver);
//		landingPage.goTo();
//		return landingPage;
//	}
	
	@BeforeTest(alwaysRun = true)
	public void LaunchApplication() throws IOException {
		driver = InitialiseDriver();
//		landingPage = new LandingPage(driver);
//		landingPage.goTo();
//		return landingPage;
	}

	@AfterTest(alwaysRun = true)
	public void tearDown() {
		System.out.println("TearDown Method");
//		driver.close();
	}

}
