package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ButtonSteps {

    WebDriver driver;

    @Given("I open the demoqa elements page")
    public void openDemoQaPage() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
    }

    @When("I click on the Buttons section")
    public void clickButtonsSection() {
        WebElement buttonsSection = driver.findElement(By.id("#item-4"));
        buttonsSection.click();
    }

    @When("I click the Click Me button")
    public void clickClickMeButton() {
        WebElement clickMeButton = driver.findElement(By.id("doubleClickBtn"));
        clickMeButton.click();
    }

    @Then("I should see the message {string}")
    public void verifyMessage(String expectedMessage) {
        WebElement message = driver.findElement(By.id("doubleClickMessage"));
        assertEquals(expectedMessage, message.getText());
        driver.quit();
    }
}
