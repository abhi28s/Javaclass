package Assignment4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Youtube {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\JetBrains\\chromedriver.exe");

        driver.manage().window().maximize();

        driver.get("http://www.youtube.com");
        WebElement searchyoutubetesttribe = driver.findElement(By.name("search_query"));
        searchyoutubetesttribe.sendKeys("Testribe");
        driver.findElement(By.id("search-icon-legacy")).click();

        Thread.sleep(10000);
        driver.quit();

    }
}

