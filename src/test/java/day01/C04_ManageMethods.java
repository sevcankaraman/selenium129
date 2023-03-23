package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C04_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new EdgeDriver();

        //techproeducation sayfasına gıdelım
        driver.get("http://techproeducation.com");

        //sayfanın konumunu ve boyutlarını yazdırın
        System.out.println("sayfanın konumu" + driver.manage().window().getPosition());
        System.out.println("sayfanın boyutları" + driver.manage().window().getSize());

        //sayfayı minimize(simge durumu) yapalım
        Thread.sleep(2000);
        driver.manage().window().minimize();

        //sayfanın konumunu ve boyutlarını yazdırın
        System.out.println("sayfanın konumu" + driver.manage().window().getPosition());
        System.out.println("sayfanın boyutları" + driver.manage().window().getSize());

        //sayfayı maximize (tam ekran) yapalım
        Thread.sleep(2000);
        driver.manage().window().maximize();

        //sayfanın konumunu ve boyutlarını yazdırın
        System.out.println("sayfanın konumu" + driver.manage().window().getPosition());
        System.out.println("sayfanın boyutları" + driver.manage().window().getSize());

        //sayfayı full screen yapalım
        Thread.sleep(2000);
        driver.manage().window().fullscreen();

        //sayfayı kapatın
        Thread.sleep(2000);
        driver.close();



    }
}
