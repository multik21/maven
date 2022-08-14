package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait = webDriverWait(driver, Duration.ofSeconds(5));
        Actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@data-denger='women']")
    public WebElement SignInButton;


    public void clickSingInButton() {
        SignInButton.click();
    }


}
