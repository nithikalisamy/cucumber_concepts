package StepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestComponents.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YTSearch extends BaseTest {

	WebDriver driver;

	@Given("User opens youtube.com")
	public void user_opens_youtube_com() throws InterruptedException {
		System.out.println("user_opens_youtube_com");
	}

	@When("The serach box is clicked")
	public void the_serach_box_is_clicked() {
		System.out.println("the_serach_box_is_clicked");
	}

	@Then("Type {string} study material and serach")
	public void type_cucumber_study_material_and_serach(String courseName) {
		System.out.println("Provided Text : " + courseName);
	}

	@Then("Take top {int} video links")
	public void take_top_video_links_(Integer linkCount) {
		System.out.println("take_top_video_links : " + linkCount);
	}

	@Then("^Take top \"([^\"]*)\" video links")
	public void take_top_video_links(Integer linkCounts) {
		System.out.println("take_top_video_links : " + linkCounts);
	}

	@Then("Type sportsname and serach")
	public void type_sportsname_and_serach(io.cucumber.datatable.DataTable dataTable) {
		/*
		List<List<String>> sportsName = dataTable.asLists();
		System.out.println("First Sports : " + sportsName.get(0).get(0));
		System.out.println("Second Sports : " + sportsName.get(1).get(0));
		*/
		
		List<Map<String, String>> sportsName = dataTable.asMaps();
		
		System.out.println("First Sports : " + sportsName.get(0).get("sportsName"));
		System.out.println("Second Sports : " + sportsName.get(1).get("sportsName"));
	
	}

}
