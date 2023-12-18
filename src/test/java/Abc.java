import lesson8.ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class Abc {




    static WebDriver driver;
    static ActionsClass actionsClass;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void precondition(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chrome-win64\\chrome.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        actionsClass = new ActionsClass(driver);
    }

    @Test
    public void checkPageTitle() {
        driver.get("https://klopotenko.com/en/");
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Chef Ievgen Klopotenko"), "Name of page is not true");
        assertFalse(driver.getTitle().contains("Chef Ievgencc Klopotenko"), "Name of page is true");
        WebElement element = driver.findElement(By.xpath("(//a[text()='Ukrainian'])[2]"));
        Assert.assertEquals(element.getText(), "UKRAINIAN");
        Assert.assertNotEquals(element.getText(), "UKRAINIANw");
    }
    @Test
    public void searchFieldFunction() throws InterruptedException {
        driver.get("https://www.guinnessworldrecords.com/search");
        Thread.sleep(3000);
        String search = "handstand";
        actionsClass.senKeys(By.id("search-term"), search);
        actionsClass.click(By.id("search-button"));
        Assert.assertTrue(actionsClass.getTextFromElement(By.tagName("h2")).contains(search));
    }

    @AfterClass
    public void postConditions(){
        driver.quit();
    }
}
