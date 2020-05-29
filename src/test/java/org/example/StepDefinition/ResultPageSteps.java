package org.example.StepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;
import org.example.PageObject.ResultPage;
import org.openqa.selenium.WebDriver;

public class ResultPageSteps {
    public static WebDriver driver;
    Homepage homepage = new Homepage();
    ResultPage resultPage = new ResultPage();

    @When("^user clicks on home cinema speaker$")
    public void user_clicks_on_home_cinema_speaker() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user should be able to see all the home cinema speakers$")
    public void user_should_be_able_to_see_all_the_home_cinema_speakers() throws Throwable {
        Thread.sleep(2000);
        resultPage.homeCinemaButton();
    }

    @When("^user selects Stereo Bookshelf Speaker$")
    public void user_selects_Stereo_Bookshelf_Speaker() throws Throwable {
        Thread.sleep(2000);
        resultPage.selectingSpeaker();
    }

    @When("^user clicks where to buy information button$")
    public void user_clicks_where_to_buy_information_button() throws Throwable {
        Thread.sleep(2000);
        resultPage.wtbButton();
    }

    @Then("^user should be able to see the result page$")
    public void user_should_be_able_to_see_the_result_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
    }
