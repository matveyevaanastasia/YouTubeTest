import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLSelectElement;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class YoutubeTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com/");
        driver.getTitle();
        if (driver.getTitle().equals("YouTube")) {
            System.out.println("Page name is correct");}
        else {
            System.out.println("Page name is not correct"); }

        WebElement search = driver.findElement(By.xpath("//input[@id = 'search']"));
        search.sendKeys("1234");
        //search.sendKeys(Integer.toString(new Random().nextInt()));
        driver.manage().window().maximize();
        search.sendKeys(Keys.SPACE);
        WebElement secondelement = driver.findElement(By.id("sbse1"));
        secondelement.click();

        WebElement video = driver.findElement(By.xpath("//a[@href='/watch?v=KUULz4h8CBY' and @id='video-title']"));
        video.click();
        WebElement videoautor = driver.findElement(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-video-owner-renderer']"));
        videoautor.click();
        WebElement subscribe = driver.findElement(By.xpath("//div[@id='subscribe-button' and @class='style-scope ytd-c4-tabbed-header-renderer']"));
        subscribe.click();
        WebElement enter = driver.findElement(By.xpath("//paper-button[@aria-label='Войти']"));
        System.out.println(enter.getText());
        if (enter.getText().equals("ВОЙТИ")){System.out.println("Text is correct");}
        else {
            System.out.println("Text is not correct"); }
        driver.quit();
        }
    }



