package day_01_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_Tekrar {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Pencereyi maximize yapiniz

        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String title=driver.getTitle();
        System.out.println("title: "+title);

        String URL=driver.getCurrentUrl();
        System.out.println("url: "+URL);

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (title.contains("Teknoloji")){
            System.out.println("içeriyor");
        }else {
            System.out.println("içermiyor");
        }

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (URL.contains("teknosa")){
            System.out.println("içeriyor");
        }else{
            System.out.println("içermiyor");
        }
        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String medunnatitle=driver.getTitle();
        System.out.println("medunna title"+medunnatitle);

        String medunnaURL= driver.getCurrentUrl();
        System.out.println("medunna url" + medunnaURL);

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (medunnatitle.contains("MEDUNNA")){
            System.out.println("içeriyor");
        }else{
            System.out.println("içermiyor");
        }
        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz

        if (medunnaURL.contains("medunna")){
            System.out.println("içeriyor");
        }else{
            System.out.println("içermiyor");
        }
        // teknosa adresine geri donunuz
        driver.navigate().back();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // medunna adresine ilerleyiniz
        driver.navigate().forward();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();
    }
}
