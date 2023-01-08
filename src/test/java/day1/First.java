package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

    public static void main(String[] args) {

        //Adim 1 - Chrome driver imizin pathini belirtiyoruz. (Projeye tanitiyoruz)
        System.setProperty("webdriver.chorme.driver","Dependencies/driver/chromedriver.exe");
        // Adim 2 - driver objemizi olusturmus olduk.
        WebDriver driver=new ChromeDriver();
        // Adim 3 - https://www.google.com adresini ziyaret ettik
        driver.get("http://www.google.com");


    }
}
