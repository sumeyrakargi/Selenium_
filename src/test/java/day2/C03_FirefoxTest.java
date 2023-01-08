package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C03_FirefoxTest {
    //        Invoke FireFox Driver
    //        Go to https://www.youtube.com/
    //        Verify the page title contains the word video.
    //        Close the driver.

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "Dependencies/driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        driver.get("http://www.youtube.com");
        //title testi yapılıyor
        System.out.println("Title testi yapılıyor");
        String pageTitle=driver.getTitle();

        if (pageTitle.contains("video")) {
            System.out.println("Title testi PASSED");
        }else System.out.println(  "Title testi FAILED");

    }
}
