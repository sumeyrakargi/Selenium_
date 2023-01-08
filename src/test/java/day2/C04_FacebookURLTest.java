package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_FacebookURLTest {
    // Invoke Chrome Driver
    // Navigate to Facebook homepage URL: https://www.facebook.com/
    // Verify expected equals actual URL.
    // Verify expected contains Facebook Word.

    public static void main(String[] args) {

        //  Driver imizin yolunu javaya tanittik.
        System.setProperty("webdriver.chrome.driver","Dependencies/driver/chromedriver.exe");
        //Driver objemizi olusturuyoruz
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");

        //URL testimizi yapıyoruz
        System.out.println("URL testimizi yapıyoruz");
        String expectedURL = "http://www.facebook.com";
        String actURL=driver.getCurrentUrl();

        if (expectedURL.equals(actURL)){
            System.out.println("URL test PASSED");
        }else System.out.println("URL test FAILED");

        //title testimizi yapıyoruz
        System.out.println("Title testi yapıyoruz");
        String actTitle=driver.getTitle();
        if (actTitle.contains("Facebook")){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        driver.quit();

    }
}
