package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C01_Tekrar {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com");

//        “city bike” araması yapın
        WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("city bike "+ Keys.ENTER);

//        Arama sonuç metnini yazdırın

        List<WebElement> aramasonucu=driver.findElements(By.className("sg-col-inner"));
        System.out.println("arama sonucu : "+ aramasonucu.get(0).getText());

//        Sonuç sayısını yazdırın
        String sonucsayisi=aramasonucu.get(0).getText().split(" ")[2];
        System.out.println("sonuc sayısı : " + sonucsayisi);

//        Sonuc sayısını LAMBDA ile yazdırın


//        Çıkan ilk sonucun resmine tıklayın.
        List<WebElement> resim= driver.findElements(By.className("s-image"));
         resim.get(0).click();

//                Sayfayı kapatın
        driver.close();

    }
}
