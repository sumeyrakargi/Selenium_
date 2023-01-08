package day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageWindowCommands {
    // Go to the Amazon URL : https://www.amazon.com/
    // Print the position and size of the page.
    // Adjust the position and size of the page as desired.
    // Test that the page is in the position and size you want.
    // Close the page.
    public static void main(String[] args) throws InterruptedException {

        //  Driver imizin yolunu javaya tanittik.
        System.setProperty("webdriver.chrome.driver","Dependencies/driver/chromedriver.exe");

        //Driver objemizi olusturuyoruz
        WebDriver driver = new ChromeDriver();

        Thread.sleep(5000);
        //Browser pozisyonu ve boyutunu yazdırdık
        System.out.println("Browser imizin pozisyonu = "+driver.manage().window().getPosition());
        System.out.println("Browser imizin boyutu = "+driver.manage().window().getSize());

        Thread.sleep(5000);

        //browser imizin pozisyonunu (190,70)olarak set ettik
        driver.manage().window().setPosition(new Point(190,70));

        //browser imizin boyutunu(300,500)olarak set ettik
        driver.manage().window().setSize(new Dimension(800,1000));

        //browser imizin boyut  doğruluyoruz

        int height=driver.manage().window().getSize().getHeight();
        int width=driver.manage().window().getSize().getWidth();

        System.out.println("width="+width+" height="+height);

        System.out.println("Browser boyutu test ediliyor");
        if (height==1000&&width==800){
            System.out.println("Boyut testi PASSED");
        }else {
            System.out.println("Boyut testi FAILED");}

        //browser imizin bpozisyonunu  doğruluyoruz
        int x=driver.manage().window().getPosition().getX();
        int y=driver.manage().window().getPosition().getY();

        System.out.println("Browser pozisyonu test ediliyor");
        if (x==190&&y==70){
            System.out.println("Pozisyon testi PASSED");
        }else {
            System.out.println("Pozisyon testi FAILED");}

        Thread.sleep(5000);
        driver.quit();


    }
}
