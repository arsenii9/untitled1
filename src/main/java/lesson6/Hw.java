package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Hw {
    public static void drop(By lokator1, By lokator2, WebDriver driver, int x, int y) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(lokator1))
                .moveToElement(driver.findElement(lokator2), x, y)
                .release().build().perform();
    }


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.ashortjourney.com/");
        Actions actions = new Actions(driver);
        Thread.sleep(30000);
            drop(By.cssSelector(("[r='40']")), By.cssSelector( "[r='8']"), driver, 0, 50) ;
            Thread.sleep(5000);
            drop(By.cssSelector(("[r='40']")), By.cssSelector( "[r='8']"), driver, 50, 0) ;
            Thread.sleep(5000);
            drop(By.cssSelector(("[r='40']")), By.cssSelector( "[r='8']"), driver, 50, 0) ;
            Thread.sleep(5000);
        drop(By.cssSelector(("[r='40']")), By.cssSelector( "[r='8']"), driver, -50, -50) ;
        Thread.sleep(5000);
        drop(By.cssSelector(("[r='40']")), By.cssSelector( "[r='8']"), driver, 0, 50) ;
        Thread.sleep(5000);
        drop(By.cssSelector(("[r='40']")), By.cssSelector( "[r='8']"), driver, 50, 0) ;
        Thread.sleep(5000);
        drop(By.cssSelector(("[r='40']")), By.cssSelector( "[r='8']"), driver, -50, -50) ;


}



}


