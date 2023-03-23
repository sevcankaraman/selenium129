package day_01_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01_Tekrar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // "https://www.amazon.com/" adresine gidiniz.
        driver.get("https://www.amazon.com/");

        // "https://www.n11.com/" adresine gidiniz.
        driver.get("https://www.n11.com/");

        // amazon adresine geri donunuz
        driver.navigate().back();

        // n11 adresine ilerleyiniz
        driver.navigate().to("https://www.n11.com/");

        // sayfayi yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();

        // Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("hersey yolunda");


    }
}
