package lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://demoqa.com/modal-dialogs");
        driver.findElement(By.id("showSmallModal")).click();
      WebElement element =  webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("closeSmallModal"))));
        System.out.println(driver.findElement(By.xpath("//div[text() = 'This is a small modal. It has very less content' ]")).getText());;
    element.click();

        driver.findElement(By.id("showLargeModal")).click();
        WebElement element1 =  webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("closeLargeModal"))));
        System.out.println(driver.findElement(By.xpath("//p[contains(text(), 'Lorem Ipsum is simply ') ]")).getText());;
        element1.click();
    }
}
