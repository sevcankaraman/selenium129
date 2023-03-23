package day_01_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C05 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().maximize();

        System.out.println("max pencere konumu: "+driver.manage().window().getPosition());
        System.out.println("max pencere olcusu: "+driver.manage().window().getSize());


        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().fullscreen();

        System.out.println("full screen konumu: "+driver.manage().window().getPosition());
        System.out.println("full screen pencere olcusu: "+driver.manage().window().getSize());

        // sayfayi kapatiniz
        driver.close();
    }
}