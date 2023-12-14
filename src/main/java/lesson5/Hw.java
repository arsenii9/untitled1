package lesson5;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.Set;

public class Hw {
    public static void openLinkInANewTab(WebDriver driver, String url){
        Set<String> set1 = driver.getWindowHandles();
        ((JavascriptExecutor)driver).executeScript("window.open()");
        Set<String> set2 = driver.getWindowHandles();
        set2.removeAll(set1);
        String newDescriptor = set2.iterator().next();
        driver.switchTo().window(newDescriptor);
        driver.get(url);
    }
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);





        String[] urls = {
                "https://uhomki.com.ua/ru/koshki/1074/",
                "https://zoo.kiev.ua/",
                "https://www.w3schools.com/",
                "https://taxi838.ua/ru/dnepr/",
                "https://klopotenko.com/"
        };

        try {
            for (int i =0; i<urls.length; i++) {
                openLinkInANewTab(driver, urls[i]);

                System.out.println("Title: " + driver.getTitle());
                System.out.println("URL: " + driver.getCurrentUrl());
            }


            Set<String> windowHandles = driver.getWindowHandles();


            for (String windowHandle : windowHandles) {

                driver.switchTo().window(windowHandle);

                if (driver.getTitle().toLowerCase().contains("зоопарк")) {
                    driver.close();
                    System.out.println("Closed the window with 'зоопарк' in the title.");
                }
            }
        } finally {

            driver.quit();


            }
        }
    }

   


