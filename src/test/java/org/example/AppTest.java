package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AppTest {
    @Test
    public void testcase1() throws InterruptedException {

        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\HOME\\IdeaProjects\\welcome\\src\\test\\resources\\webdriver\\chromedriver.exe"
        );
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.lambdatest.com/selenium-playground/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        WebElement box = driver.findElement(By.xpath("(//*[@id=\"user-message\"])[1]"));
        box.sendKeys("Welcome to LambdaTest");
        driver.findElement(By.xpath("//*[@id=\"showInput\"]")).click();
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
    @Test
    public void testcase2() throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\HOME\\IdeaProjects\\welcome\\src\\test\\resources\\webdriver\\chromedriver.exe"
        );
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo");
        driver.manage().window().maximize();

        WebElement greenslider = driver.findElement(By.xpath("//*[@id=\"rangeSuccess\"]"));
        driver.findElement(By.id("exit_popup_close")).click();
        Actions action = new Actions(driver);
        action.dragAndDropBy(greenslider,95,0).perform();
        Thread.sleep(3000);
        driver.close();
        driver.quit();

    }
    @Test
    public void testcase3() throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\HOME\\IdeaProjects\\welcome\\src\\test\\resources\\webdriver\\chromedriver.exe"
        );
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.lambdatest.com/selenium-playground/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[5]/a")).click();
        Thread.sleep(3000);
        WebElement box = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        box.sendKeys("srinag");
        driver.findElement(By.name("country")).click();

        driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[6]/button")).click();
        Thread.sleep(3000);
        driver.close();
        driver.quit();

    }

}
