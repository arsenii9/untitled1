package lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@title = 'Women']") )).perform();
        driver.findElement(By.xpath("(//a[@title = 'Casual Dresses'])[1]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        actions.moveToElement(driver.findElement(By.xpath("(//a[@title = 'Printed Dress'])[1]"))).perform();
        driver.findElement(By.cssSelector(".add_to_compare")).click();
        driver.findElement(By.xpath("//button[@class = 'btn btn-default button button-medium bt_compare bt_compare']")).click();
        System.out.println(driver.getTitle());



    }
}
