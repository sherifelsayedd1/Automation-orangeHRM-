package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriver webDriver;
    Select select;

      BasePage(WebDriver webDriver){
          this.webDriver=webDriver;
      }


    public void enterData(By by,String Data){
        waitUntilSeeElement(by);
        webDriver.findElement(by).sendKeys(Data);
    }
    public void waitUntilSeeElement(By by){
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void clickOnButton(By by){
        new WebDriverWait(webDriver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(by));
        webDriver.findElement(by).click();
    }
    public void selectElement(By by,String element){
        select = new Select(webDriver.findElement(by));
        select.selectByVisibleText(element);
    }
    public List<WebElement> getelements(By by){
        return webDriver.findElements(by);
    }


}
