package classwork.day21;

import org.openqa.selenium.By;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Selenide.*;

public class SelenideBookingTest {

    public static void main(String[] args) {

        open("https://booking.com");

        $x("//button[@aria-label='Скрыть меню входа в аккаунт.']").click();

        $(By.name("ss")).sendKeys("Париж");
        $x("//button[@data-testid='searchbox-dates-container']").click();
//        driver.findElement(By.xpath("//span[@data-date='2025-06-06']")).click();
//        driver.findElement(By.xpath("//span[@data-date='2025-06-12']")).click();

        LocalDate checkInDate = LocalDate.now().plusDays(3);
        LocalDate checkOutDate = checkInDate.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        $x("//span[@data-date='" + checkInDate.format(formatter) + "']").click();
        $x("//span[@data-date='" + checkOutDate.format(formatter) + "']").click();

        $x("//button[@data-testid='occupancy-config']").click();
        $x("//label[@for='group_adults']/../following-sibling::div/button[2]").click();
        $x("//label[@for='group_adults']/../following-sibling::div/button[2]").click();

        $x("//label[@for='no_rooms']/../following-sibling::div/button[2]").click();

        $x("//button[@type='submit']").click();

//        $x("//button[@data-testid='sorters-dropdown-trigger']").click();
//        $x("//span[text()='Оценка объекта (по возрастанию)']").click();

    }
}
