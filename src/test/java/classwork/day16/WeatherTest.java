package classwork.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class WeatherTest {

    public static void main(String[] args) throws InterruptedException {

        //флажок против капчи
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");

        WebDriver driver = new ChromeDriver(options);

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("погода минск");

        Thread.sleep(500);
        driver.findElement(By.xpath("//ul[@role='listbox']/li[1]")).click();

        //driver.findElement(By.xpath("//*[@aria-label='18°Celsius среда 12:00']"));

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        String tomorrowDay = tomorrow.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("ru"));

        String weatherData = driver
                .findElement(By.xpath("//*[contains(@aria-label,'Celsius " + tomorrowDay + " 12:00')]"))
                .getAttribute("aria-label");
        System.out.println(weatherData);
        //driver.quit();
    }
}
