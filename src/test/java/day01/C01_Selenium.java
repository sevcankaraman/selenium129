package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_Selenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
       // WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
     //  WebDriver driver = new ChromeDriver();


        /*
         en temel haliyle otomosyon yapmak icin classimiza gerekli olan web driver
         yerini belirtiyoruz. java kutuphanesindeki " System.setProperty" methoduyla
         driverimizin yolunu belirtiyoruz.
 */

        WebDriver edge = new EdgeDriver();
      //  driver.get("https://www.google.com/");
        edge.get("https://www.google.com/");

    }
}