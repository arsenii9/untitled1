package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.foxtrot.com.ua/");
    }

    @DataProvider(name = "searchWords")
    public Object[][] searchData() {
        return new Object[][]{
                {"машина"},
                {"input"},
                {"смысл"}
        };
    }

    @Test(dataProvider = "searchWords")
    public void testFoxtrotSearch(String searchWord) {
        WebElement searchInput = driver.findElement(By.cssSelector("input[name='q']"));
        searchInput.sendKeys(searchWord);
        searchInput.submit();

        WebElement highlightedElement = driver.findElement(By.cssSelector(".highlighted")); // Предположим, что выделенный элемент содержит класс "highlighted"

        Assert.assertTrue(highlightedElement.getText().contains(searchWord),
                "Expected word '" + searchWord + "' is not present in the highlighted element.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
