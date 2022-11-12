package StepDefinition;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YTSelect {

	@Given("youtube is open")
	public void youtube_is_open() {
		System.out.println("youtube_is_open");
	}

	@When("videos are displayed")
	public void videos_are_displayed() {
		System.out.println("videos_are_displayed");
	}

	@Then("extract the first video name in suggestions")
	public void extract_the_first_video_name_in_suggestions() {
		System.out.println("extract_the_first_video_name_in_suggestions");
	}


}
