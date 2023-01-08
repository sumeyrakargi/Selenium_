package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BrowswrComands {

    public static void main(String[] args) {

// Create main method
// Set Path
// Create chrome driver
// Open google home page: https://www.google.com
// Get Title on page
// Get Current URL on page
// Close/Quit the browser


        //Adim 1 - Chrome driver imizin pathini belirtiyoruz. (Projeye tanitiyoruz)
        System.setProperty("webdriver.chorme.driver","Dependencies/driver/chromedriver.exe");
        // Adim 2 - driver objemizi olusturmus olduk.
        WebDriver driver=new ChromeDriver();
        // Adim 3 - https://www.google.com adresini ziyaret ettik
        driver.get("http://www.google.com");

        // sayfa basligi (pageTitle) ve suanda bulunan url (currentUrl) degerini aldik.
        String pageTitle = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();


        //Aldigimiz degerleri yazdirdik
        System.out.println("Page title = " + pageTitle);
        System.out.println("Current Url = " + currentUrl);

        // driver objemizi (browser) kapattik
        driver.quit();

    }
}
