package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_PageSourceTest {
    // Go to the Amazon URL: https://www.amazon.com/
    // Verify that it writes "Performance Metrics" and "MEOW" from the Source code.
    public static void main(String[] args) {

        //  Driver imizin yolunu javaya tanittik.
        System.setProperty("webdriver.chrome.driver","Dependencies/driver/chromedriver.exe");
        //Driver objemizi olusturuyoruz
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.com");

        String source =driver.getPageSource();
        //page source u (kaynagi) aldik
        String pageSource = driver.getPageSource();

        //Page source testimizi yapiyoruz
        System.out.println("Page source testi yapiliyor...");

        System.out.println(pageSource);
        if (pageSource.contains("Performance Metrics") && pageSource.contains("MEOW")){
            System.out.println("Page source test PASSED");
        }else{
            System.out.println("Page source test FAILED");
        }

        //driver objemizi kapattik
        driver.quit();

    }
}
