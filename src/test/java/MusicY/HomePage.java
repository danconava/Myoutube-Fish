package MusicY;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
    public static void main(String[] arg) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/anggacikal/Documents/Myoutube-Fish/driver/geckodriver");
        WebDriver YoutubeMusic = new FirefoxDriver();
        YoutubeMusic.get("https://music.youtube.com/");
        YoutubeMusic.manage().window().maximize();


        //Scrool//
        JavascriptExecutor pr = (JavascriptExecutor) YoutubeMusic;
        WebElement prscroll = YoutubeMusic.findElement(By.xpath("/html/body/ytmusic-app/ytmusic-app-layout/div[3]/ytmusic-browse-response/div[2]/ytmusic-section-list-renderer/div[2]/ytmusic-tastebuilder-shelf-renderer/div/h2/yt-formatted-string"));
        pr.executeScript(  "arguments[0].scrollIntoView();", prscroll);
        //End//

        WebElement test01 = YoutubeMusic.findElement(By.xpath("/html/body/ytmusic-app/ytmusic-app-layout/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[2]/yt-formatted-string"));
        test01.click();
        Thread.sleep(3000);

        WebElement test02 = YoutubeMusic.findElement(By.xpath("/html/body/ytmusic-app/ytmusic-app-layout/div[3]/ytmusic-browse-response/div[2]/ytmusic-section-list-renderer/div[2]/ytmusic-grid-renderer/div[2]/ytmusic-navigation-button-renderer[1]/button/yt-formatted-string"));
        test02.click();
        Thread.sleep(2000);

        WebElement test03 = YoutubeMusic.findElement(By.xpath("/html/body/ytmusic-app/ytmusic-app-layout/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[2]/yt-formatted-string"));
        test03.click();
        Thread.sleep(3000);

        WebElement test04 = YoutubeMusic.findElement(By.xpath("/html/body/ytmusic-app/ytmusic-app-layout/div[3]/ytmusic-browse-response/div[2]/ytmusic-section-list-renderer/div[2]/ytmusic-grid-renderer/div[2]/ytmusic-navigation-button-renderer[2]/button"));
        test04.click();
        Thread.sleep(2000);

        WebElement test05 = YoutubeMusic.findElement(By.xpath("/html/body/ytmusic-app/ytmusic-app-layout/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[2]/yt-formatted-string"));
        test05.click();
        Thread.sleep(3000);

        WebElement test06 = YoutubeMusic.findElement(By.xpath("/html/body/ytmusic-app/ytmusic-app-layout/div[3]/ytmusic-browse-response/div[2]/ytmusic-section-list-renderer/div[2]/ytmusic-grid-renderer/div[2]/ytmusic-navigation-button-renderer[3]/button"));
        test06.click();
        Thread.sleep(2000);

        WebElement test07 = YoutubeMusic.findElement(By.xpath("/html/body/ytmusic-app/ytmusic-app-layout/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[2]/yt-formatted-string"));
        test07.click();
        Thread.sleep(3000);

        WebElement test08 = YoutubeMusic.findElement(By.xpath("/html/body/ytmusic-app/ytmusic-app-layout/ytmusic-nav-bar/div[2]/ytmusic-search-box/div/div[1]/tp-yt-paper-icon-button[1]"));
        test08.click();
        Thread.sleep(3000);

        WebElement test09 = YoutubeMusic.findElement(By.xpath("/html/body/ytmusic-app/ytmusic-app-layout/ytmusic-nav-bar/div[2]/ytmusic-search-box/div/div[1]/tp-yt-paper-icon-button[1]"));
        test09.click();
        Thread.sleep(3000);

        WebElement test10 = YoutubeMusic.findElement(By.xpath(" //*[@id=\"icon\"]"));
        test10.click();
        Thread.sleep(3000);





















YoutubeMusic.close();


    }
}
