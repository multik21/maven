package Lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AfishaTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;


    private final static String AFISHA_BASE_URL = "https://afisha.cheb.ru";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver()
    }
    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();
        WebDriverWait = new WebDriverWait(driver. Duration.ofSeconds(5));
        actions = new Actions(driver);
        driver.get(AFISHA_BASE_UR);
    }
    @AfterEach
    void quitBrowser() {
        driver.quit();
    }
    @Test

}
