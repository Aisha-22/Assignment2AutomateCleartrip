package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateClearTrip {
    public void runTestAutomation() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.cleartrip.com");

        driver.findElement(By.id("Adults")).click();

        Select select = new Select(driver.findElement(By.name("adults")));
        select.selectByValue("2");

        driver.findElement(By.id("Childrens")).click();

        Select s = new Select(driver.findElement(By.name("childs")));
        s.selectByIndex(3);

        driver.findElement(By.id("DepartDate")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"MoreOptionsLink\"]/strong")).click();

        driver.findElement(By.name("airline")).sendKeys("Mango Airlines");

        driver.findElement(By.id("SearchBtn")).click();

        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

    }
}
