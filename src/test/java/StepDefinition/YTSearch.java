package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestComponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YTSearch extends BaseTest{
	
	WebDriver driver;

	@Given("User opens youtube.com")
	public void user_opens_youtube_com() throws InterruptedException {
		System.out.println("user_opens_youtube_com");
//		System.setProperty("webdriver.chrome.driver", "D:\\Nithi\\Studies\\Selenium\\Setup\\chromedriver-107.exe");
//		
//		driver = new ChromeDriver();
//		
//		driver.get("http://www.youtube.com");
//		
//		Thread.sleep(2000);
	}

	@When("The serach box is clicked")
	public void the_serach_box_is_clicked() {
		System.out.println("the_serach_box_is_clicked");

	}

	@Then("Type {string} study material and serach")
	public void type_cucumber_study_material_and_serach(String course) {
		System.out.println("Provided Text : " + course);

	}

	@Then("Take top {string} video links")
//	@Then("^Take top \"([^\"]*)\" video links")
	public void take_top_video_links(String int1) {
		System.out.println("take_top_video_links : " + int1);

	}

}
