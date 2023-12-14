package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hw {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(20000);
        driver.findElement(By.xpath("//circle[style = '-webkit-tap-highlight-color: rgba(0, 0, 0, 0); fill-opacity: 0; cursor: pointer;']")).click();
        driver.quit();
    }
}
