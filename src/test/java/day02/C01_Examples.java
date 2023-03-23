package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01_Examples {
    /*
   Browser'ı açıp maximize yapın
   Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
   Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
   Amazon sayfasına geri dönün
   Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
   Sayfanın konumunu ve boyutunu yazdırın
   Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
   İstediğiniz şekilde olup olmadığını test edin
   Sayfayı kapatın
    */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.get("http://google.com");

//        Browser'ı açıp maximize yapın
        driver.manage().window().maximize();

//        Tüm sayfa için maksimum bekleme süresi olarak 15 saniye belirleyin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        Sırasıyla Amazon, Facebook ve Youtube sayfalarına gidin
        driver.get("http://amazon.com");
        driver.get("http://facebook.com");
        driver.get("http://youtube.com");

//        Amazon sayfasına geri dönün
        driver.navigate().back();
        driver.navigate().back();
//        Amazon sayfasının adresinin(Url) https://www.amazon.com/ adresine eşit olduğunu test edin
        String actualUrl=driver.getCurrentUrl(); // Asıl URL
        String expectedurl="https://www.amazon.com/"; // Beklenen URL

        if (actualUrl.equals(expectedurl)){
            System.out.println("URL Testi PASSED");
        }else{
            System.out.println("URL Testi FAILED");
        }


//        Sayfanın konumunu ve boyutunu yazdırın
        System.out.println("Sayfa Konumu:" + driver.manage().window().getPosition());
        System.out.println("Sayfa Boyutu:" +driver.manage().window().getSize());


//        Sayfanın konumunu ve boyutunu istediğimiz şekilde ayarlıyın
        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(600,600));
        System.out.println("yeni Sayfa Konumu:" + driver.manage().window().getPosition());
        System.out.println("yeni Sayfa Boyutu:" +driver.manage().window().getSize());

//        İstediğiniz şekilde olup olmadığını test edin
        Point actualposition = driver.manage().window().getPosition();// konum bılgılerını get posıtıon ıle bır poınt konteynırının ıcıne koyuyoruz
        if (actualposition.x==48 && actualposition.y==48){// burda x ve y degerlerını poınt konteynırından alarak karsılastırıyoruz
            System.out.println("konum testı PASSED");
        }else{
            System.out.println("konum testi FAILED");
        }
        Dimension actualDimension =driver.manage().window().getSize();
        if (actualDimension.getWidth()==602 && actualDimension.getHeight()==602){
            System.out.println("boyut testi PASSED");
        }else{
            System.out.println("boyut testi FAILED");
        }

//        Sayfayı kapatın
        driver.close();
    }
}
