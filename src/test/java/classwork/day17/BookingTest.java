package classwork.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BookingTest {

   public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://booking.com");

        driver.findElement(By.name("ss")).sendKeys("Париж");
        driver.findElement(By.xpath("//button[@data-testid='searchbox-dates-container']")).click();
        driver.findElement(By.xpath("//span[@data-date='2025-06-06']")).click();
        driver.findElement(By.xpath("//span[@data-date='2025-06-12']")).click();
        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
        //driver.findElement(By.xpath("")).click();
    }
}
