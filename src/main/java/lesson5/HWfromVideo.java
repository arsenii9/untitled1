package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HWfromVideo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.findElement(By.id("search_query_top")).sendKeys("Printed Chiffon Dress");
        driver.findElement(By.name("submit_search")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@title= 'Printed Chiffon Dress']")).click();
        Thread.sleep(10000);
        driver.findElement(By.id("product")).click();
        Thread.sleep(3000);
        driver.findElement(By.tagName("Close"));
        driver.findElement(By.className("(//i[@class = 'icon-chevron-left left'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title = 'Women']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("search_query_top")).sendKeys("faded short");
        driver.findElement(By.name("submit_search")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text() = 'Faded Short Sleeve T-shirts']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@span = 'Add to cart']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//@span[text() = 'Continue shopping']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//b[text() = 'Cart']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//@span[text() = 'Check out']")).click();
        Thread.sleep(3000);

        driver.quit();

    }
}
