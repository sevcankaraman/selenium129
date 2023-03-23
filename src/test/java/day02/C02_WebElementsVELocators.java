package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsVELocators {
    /*
     Amazon sayfasına gidin
     Search kutusunu locate edin
     Search kutusunda iphone aratın
     Sayfadaki <input> ve <a> tag'larinin sayısını yazdırın
     Sayfayı kapatınız
     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        Amazon sayfasına gidin
        driver.get("http://amazon.com");

//        Search kutusunu locate edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

//        Search kutusunda iphone aratın
        aramaKutusu.sendKeys("iphone"+ Keys.ENTER);
        /*
        Bir web elementi locate etmek istersek önce sayfayı acıp elemnt üzerinde sağ tıklayıp incele(inspect)
        seceneğini tıklıyoruz.karsımıza cıkan HTML kodlarından eşsiz olan locator olarak seciyoruz.
        Genellikle id attribute ü eşssiz olarak kullanılır.==>

        driver.findElement(By.id("id değeri"))
         */

//        Sayfadaki <input> ve <a> tag'larinin sayısını yazdırın

        List<WebElement> inputList = driver.findElements(By.tagName("input"));
        System.out.println("input tag sayısı: "+inputList.size());

        List<WebElement> aTagtList = driver.findElements(By.tagName("a"));
        System.out.println("Link sayısı sayısı: "+aTagtList.size());

//        Sayfayı kapatınız

        driver.close();

    }

}
