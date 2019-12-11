import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        окно
        driver.manage().window().maximize();
//        ожидания
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        переход на сайт
        driver.get("https://selenium.dev/");
//        поиск элемента
        WebElement queryInput = driver.findElement(By.id("gsc-i-id1"));
//        ввод значения в строку
        queryInput.sendKeys("Selenium");
//        подтверждение значения формы
        queryInput.submit();
//         вывод параметра title  в командную строку
        System.out.println("Page title is: " + driver.getTitle());

        WebElement documentationPage = driver.findElement(By.linkText("Documentation"));
        documentationPage.click();
        System.out.println("Opened page is: " + driver.getTitle());
        driver.quit();
    }
}
