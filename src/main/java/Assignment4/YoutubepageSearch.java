package Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class YoutubepageSearch {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\JetBrains\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.youtube.com");


        WebElement searchyoutubetesttribe = driver.findElement(By.name("search_query"));

        searchyoutubetesttribe.sendKeys("Podtest");
        driver.findElement(By.id("search-icon-legacy")).click();

        driver.findElement(By.xpath("//input[@id='search']")).clear();

        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Podtest");
        driver.findElement(By.id("search-icon-legacy")).click();

        Thread.sleep(15000);
        driver.quit();
    }
}
