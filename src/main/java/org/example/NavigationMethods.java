package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();

        driver.navigate().to("https://www.youtube.com/");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("mahesh");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
    }
}
