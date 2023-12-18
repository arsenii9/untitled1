package lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionsClass {
    WebDriver driver;
    WaiterClass waiterClass;

    public ActionsClass(WebDriver driver) {
        this.driver = driver;
        this.waiterClass = new WaiterClass(driver);
    }

    public void click(By locator){
        waiterClass.waitForVisabilityOfWebElement(locator);
        driver.findElement(locator).click();
    }

    public void senKeys(By locator, String text){
        waiterClass.waitForVisabilityOfWebElement(locator);
        driver.findElement(locator).sendKeys(text);
    }

    public String getTextFromElement(By locator){
        waiterClass.waitForVisabilityOfWebElement(locator);
        return driver.findElement(locator).getText();
    }


    }

