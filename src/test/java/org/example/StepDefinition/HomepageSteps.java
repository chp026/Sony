package org.example.StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;
import org.openqa.selenium.WebDriver;

public class HomepageSteps {
    public static WebDriver driver;
    Homepage homepage = new Homepage();

    @Given("^user is on Sony website homepage$")
    public void user_is_on_Sony_website_homepage() throws Throwable {
    Thread.sleep(2000);
    homepage.homePageURL();
    }

    @When("^user accepts all cookie$")
    public void user_accepts_all_cookie() throws Throwable {
        Thread.sleep(2000);
        homepage.cookie();
    }

    @And("^user uses mouse hover action to select Electronic option$")
    public void userUsesMouseHoverActionToSelectElectronicOption() throws InterruptedException {
        Thread.sleep(2000);
        homepage.electronicMH();
    }

    @And("^user clicks on Home Theater & Sound Bars$")
    public void userClicksOnHomeTheaterSoundBars() throws InterruptedException {
        Thread.sleep(2000);
        homepage.action2();
    }

    @Then("^user should be able to see result page$")
    public void userShouldBeAbleToSeeResultPage() {
    }

    @Then("^user uses mouse hover action to select PlayStation option$")
    public void userUsesMouseHoverActionToSelectPlayStationOption() throws InterruptedException {
        Thread.sleep(5000);
        homepage.action3();
    }

    @Then("^user uses mouse hover action to select Enterainment option$")
    public void userUsesMouseHoverActionToSelectEnterainmentOption() throws InterruptedException {
        Thread.sleep(5000);
        homepage.action4();
    }

    @Then("^user uses mouse hover action to select Support option$")
    public void userUsesMouseHoverActionToSelectSupportOption() throws InterruptedException {
        Thread.sleep(5000);
        homepage.action5();
    }
}
