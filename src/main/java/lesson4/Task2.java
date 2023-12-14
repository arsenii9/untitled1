package lesson4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task2 {
    /*
    Открыть страницу http://www.automationpractice.pl/index.php?controller=contact ввести в поле Message любой произвольный текст.
    В поле Subject Heading выбрать Customer service. Остальные поля оставить пустыми. Нажать кнпку Send.
    Получить из уведомления об ошибке количество этих ошибок типа int. Вывести в консоль это количество ошибок.
    */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\Admin\\Desktop\\Importent pakage QA\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php?controller=contact");
    }
}
