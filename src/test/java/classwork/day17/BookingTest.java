package classwork.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    @Test
    public static void main(String[] args) {

//       1. Перейти на сайт booking.com
//       2. Найти отели для города «Париж», с проживанием на 7 ночей заездом через 3 дня, для 4 взрослых в 2 номерах
//       3. Отфильтровать отели с рейтингом 5
//       4. Отсортировать по рейтингу начиная с самого низкого и проверить, что у первого в списке он == 5

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://booking.com");

        driver.findElement(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']")).click();

        driver.findElement(By.name("ss")).sendKeys("Париж");
        driver.findElement(By.xpath("//button[@data-testid='searchbox-dates-container']")).click();
//        driver.findElement(By.xpath("//span[@data-date='2025-06-06']")).click();
//        driver.findElement(By.xpath("//span[@data-date='2025-06-12']")).click();

        LocalDate checkInDate = LocalDate.now().plusDays(3);
        LocalDate checkOutDate = checkInDate.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        driver.findElement(By.xpath("//span[@data-date='" + checkInDate.format(formatter) + "']")).click();
        driver.findElement(By.xpath("//span[@data-date='" + checkOutDate.format(formatter) + "']")).click();

        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
        driver.findElement(By.xpath("//label[@for='group_adults']/../following-sibling::div/button[2]")).click();
        driver.findElement(By.xpath("//label[@for='group_adults']/../following-sibling::div/button[2]")).click();

        driver.findElement(By.xpath("//label[@for='no_rooms']/../following-sibling::div/button[2]")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//div[(text()='Найдите качественные отели и жилье для отдыха.')]/../following-sibling::div/div[@data-filters-item='class:class=5']")).click();

        driver.findElement(By.xpath("//button[@data-testid='sorters-dropdown-trigger']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Оценка объекта (по возрастанию)']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

        String rate = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath("//div[@data-testid='property-card'][1]//div[@data-testid='rating-stars']//..")))
                .getAttribute("aria-label");

        assertEquals("Ожидаемый рейтинг отелей не соответствует", "5 из 5", rate);
    }
}