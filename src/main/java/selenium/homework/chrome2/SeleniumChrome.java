package selenium.homework.chrome2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChrome {
    public static void main(String[] args) {

        // Create a new instance of the Chrome browser using the WebDriver interface selenium 4
        WebDriver driver = new ChromeDriver();

        // Navigate to Home Depot's website
        driver.get("https://www.homedepot.com/");
    }
}
