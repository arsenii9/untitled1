package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class HWNo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");


        Select carSelect = new Select(driver.findElement(By.id("Carlist")));
        carSelect.selectByVisibleText("Renault");


        Select fromCountrySelect = new Select(driver.findElement(By.name("FromLB")));
        fromCountrySelect.selectByVisibleText("France");
        fromCountrySelect.selectByVisibleText("Germany");
        fromCountrySelect.selectByVisibleText("Italy");
        fromCountrySelect.selectByVisibleText("Spain");


        WebElement moveButton = driver.findElement(By.xpath("//input[@onclick='move(this.form.FromLB,this.form.ToLB)']"));
        moveButton.click();


        System.out.println("Автомобили доступные для выбора:");
        printOptions(new Select(driver.findElement(By.name("FromLB"))));


        System.out.println("Страны из первой таблицы:");
        printOptions(new Select(driver.findElement(By.name("FromLB"))));


        System.out.println("Страны из второй таблицы:");
        printOptions(new Select(driver.findElement(By.name("ToLB"))));


        driver.quit();
    }


    private static void printOptions(Select select) {
        for (WebElement option : select.getOptions()) {
            System.out.println(option.getText());
        }
    }
}
