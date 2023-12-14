package lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task {
/*    Написать три метода.
    1) Метод, возвращающий WebElement и принимающий в параметры его локатор.
            2) Метод, который будет кликать на элемент, локатор которого будет передан в параметр метода
    3) Метод, который будет отправлять текст в элемент. В параметры метода передается локатор и текст.*/
   public static WebElement abc(By locator, WebDriver driver){
      return driver.findElement(locator);


   }
    public static void abcd(By locator, WebDriver driver){
        driver.findElement(locator).click();

    }
    public static void abcde(String text, By locator, WebDriver driver){
       driver.findElement(locator).sendKeys(text);
    }


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");
        abcde("some text", By.name("search"), driver);


    }

}
