package homework.day17;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class W3SchoolTest {

    @Test
    public static void main(String[] args) {

//        1. Перейти на сайт https://www.w3schools.com/java/
//        2. Двойным кликом выделить в заголовке слово Tutorial
//        3. Скопировать используя горячие клавиши Ctrl+c
//        4. Перейти на сайт https://google.com
//        5. Вставить в строку поиска скопированное
//        6. Запустить поиск клавишей Enter
//        7. Убедиться, что каждый из результатов содержит искомое слово

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.w3schools.com/java/");

        WebElement tutorial = driver.findElement(By.xpath("//h1/span[text()='Tutorial']"));
        Actions make = new Actions(driver);
        make
                .doubleClick(tutorial)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("c").clickAndHold()
                .perform();

        //флажок против капчи
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");

        WebDriver driver1 = new ChromeDriver(options);
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver1.get("https://google.com");

        WebElement search = driver1.findElement(By.name("q"));
        Actions make1 = new Actions(driver1);
        make1
                .click(search)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("v")
                .keyDown(Keys.ENTER)
                .perform();

        List<WebElement> results = driver1.findElements(By.xpath("//h3"));

        for (WebElement result : results) {
            String text = result.getText().toLowerCase();
            assertTrue("Результат не содержит слово 'tutorial': " + text, text.contains("tutorial"));
        }
    }
}
