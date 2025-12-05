package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Sample {
    public static void main(String[] args) throws MalformedURLException {
        URL gridUrl = new URL("http://localhost:4444/wd/hub");

        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new RemoteWebDriver(gridUrl, options);

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev");
        System.out.println("Title: " + driver.getTitle());

    }
}
