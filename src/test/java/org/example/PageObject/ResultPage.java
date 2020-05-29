package org.example.PageObject;

import org.example.BaseClass.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends DriverFactory {
    @FindBy(xpath = "//h2[contains(text(),'Home Cinema Speakers')]")
    WebElement homeCinemaSpeakerButton;
    public void homeCinemaButton(){
        homeCinemaSpeakerButton.click();
    }
    //@FindBy(css = ".product-link-to-pdp")
    //WebElement speaker;
    public void selectingSpeaker() {
        List<WebElement> speakers = driver.findElements(By.cssSelector(".product-link-to-pdp"));
        for (WebElement speaker : speakers) {
            System.out.println(speaker.getText());
            if (speaker.getText().contains("Stereo Bookshelf Speaker")) {
                speaker.click();
                break;
            }
        }
    }
    @FindBy(xpath = "//a[@class='btn btn-large btn-block buy buy-button']")
    WebElement button;
    public void wtbButton(){
        button.click();
    }
}
