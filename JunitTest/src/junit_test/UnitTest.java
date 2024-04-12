package junit_test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnitTest {
    @Test
    public void testGoogleSearch() {
        // Set the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/home/appinventiv/Downloads/chromedriver-linux64/chromedriver");

        // Initialize Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Perform Selenium actions (e.g., interact with web elements, assert results)

       
        driver.quit();
    }
}