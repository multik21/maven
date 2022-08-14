package Lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;

public class PageObjectTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Action action;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();

    }
    @BeforeEach
    void initDrive() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        action = new Actions(driver)
        driver.get(https://www.lamoda.ru);
    }


    @Test
    void putShirtToCartTest() throws InterruptedException {
        new MainPage(driver).SignInButton.click();

    }

    @AfterEach
    void killBrowser() {
        driver.quit();
    }
}
