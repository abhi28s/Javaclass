package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\JetBrains\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());


        ;
    }
}