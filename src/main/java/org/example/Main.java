package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Intellij\\Secondproject\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*driver.get("https://cogmento.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Log In']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gdivya1024@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Divya@123");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();*/

        driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
        WebElement ele = driver.findElement(By.xpath("//frame[@src=\"htmlf.htm\"]"));
        driver.switchTo().frame(ele);
        driver.findElement(By.xpath("//a[@href=\"intro.htm\"]")).click();
        driver.switchTo().defaultContent();
        WebElement exe = driver.findElement(By.xpath("//frame[@src=\"message.htm\"]"));
        driver.switchTo().frame(exe);
        driver.findElement(By.xpath("//input[@size=\"40\"]")).click();
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Divya");
        driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
        // driver.switchTo().alert().accept();
        String alertText = driver.switchTo().alert().getText();
        if(alertText.contains("abkedhdf")) {

            driver.switchTo().alert().accept();
        }

        else{
            Thread.sleep(3000);
            driver.switchTo().alert().dismiss();
        }
    }
}