package io.brightEdge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class brightEdge {

    @Test
    public void webDriver() {

        //Initialize chromedriver
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver");
        ChromeDriver driver;
        driver=new ChromeDriver();
        //driver.manage().window().fullscreen();

        //Action for hovering over the solutions option
        Actions action=new Actions(driver);
        //Navigate to URL
        driver.navigate().to("https://www.brightedge.com/");
        //Hover over solutions link
        WebElement solutions=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
        action.moveToElement(solutions).perform();
        //Click on DataMind
        driver.findElement(By.xpath("//a[contains(text(),'DataMind')]")).click();

        //Close the driver
        driver.close();
    }
}
