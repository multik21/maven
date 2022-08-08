package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumstart {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "/path/to/chomedriver");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://lunda.ru);
        driver.findElement(By.name("Каталог")).click();
        driver.quit();

    }
}
