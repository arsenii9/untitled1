package lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Actions actions = new Actions(driver);
        driver.findElement(By.id("APjFqb")).sendKeys("https://www.guinnessworldrecords.com/account/register?");
        actions.keyDown(Keys.ENTER);
        actions.keyUp(Keys.ENTER);
        actions.keyDown(Keys.CONTROL);
    }
}
