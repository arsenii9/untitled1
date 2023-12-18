package lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;  // Added import for TimeUnit

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\path\\to\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try {
            driver.get("https://www.google.com/search");

            WebElement searchInput = driver.findElement(By.name("q"));
            searchInput.sendKeys("https://www.guinnessworldrecords.com/account/register?");
            searchInput.submit();
            wait.until(ExpectedConditions.urlContains("https://www.guinnessworldrecords.com/account/register?"));

            openLinkInNewWindow(driver);

            searchInput = driver.findElement(By.name("q"));
            searchInput.clear();
            searchInput.sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");
            searchInput.submit();
            wait.until(ExpectedConditions.urlContains("https://www.hyrtutorials.com/p/alertsdemo.html"));

            openLinkInNewWindow(driver);

            driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");

            fillAndSubmitForm(driver);

            WebElement resultElement = driver.findElement(By.id("demo"));
            System.out.println("Result Text: " + resultElement.getText());

            switchToWindow(driver, "https://www.guinnessworldrecords.com/account/register?");

            fillRegistrationForm(driver);

            WebElement passwordMismatchMessage = driver.findElement(By.id("confirm-msg"));
            System.out.println("Password Mismatch Message: " + passwordMismatchMessage.getText());

            switchToWindow(driver, "https://www.hyrtutorials.com/p/alertsdemo.html");

            clickAndHandleAlert(driver, wait, "btn1");
            clickAndHandleAlert(driver, wait, "btn2");
            clickAndHandleAlertWithInput(driver, wait, "btn3", "Final stepofthistask");

        } finally {
            driver.quit();
        }
    }

    private static void openLinkInNewWindow(WebDriver driver) {
        Set<String> windowHandles = driver.getWindowHandles();
        windowHandles.forEach(handle -> driver.switchTo().window(handle));
        // Switch to the last window
        driver.switchTo().window((String) windowHandles.toArray()[windowHandles.size() - 1]);
    }

    private static void fillAndSubmitForm(WebDriver driver) {
        driver.switchTo().frame("iframeResult");

        WebElement firstNameField = driver.findElement(By.name("fname"));
        WebElement lastNameField = driver.findElement(By.name("lname"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));

        firstNameField.sendKeys("YourFirstName");
        lastNameField.sendKeys("YourLastName");
        submitButton.click();

        driver.switchTo().defaultContent();
    }

    private static void switchToWindow(WebDriver driver, String url) {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getCurrentUrl().equals(url)) {
                break;
            }
        }
    }

    private static void fillRegistrationForm(WebDriver driver) {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));

        usernameField.sendKeys("YourUsername");
        passwordField.sendKeys("Password123");
        confirmPasswordField.sendKeys("DifferentPassword");

        confirmPasswordField.submit();
    }

    private static void clickAndHandleAlert(WebDriver driver, WebDriverWait wait, String buttonId) {
        WebElement button = driver.findElement(By.id(buttonId));
        button.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        WebElement outputElement = driver.findElement(By.id("popupboxoutput"));
        System.out.println(outputElement.getText());
    }

    private static void clickAndHandleAlertWithInput(WebDriver driver, WebDriverWait wait, String buttonId, String inputText) {
        WebElement button = driver.findElement(By.id(buttonId));
        button.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().sendKeys(inputText);
        driver.switchTo().alert().accept();
        WebElement outputElement = driver.findElement(By.id("popupboxoutput"));
        System.out.println(outputElement.getText());
    }
}
