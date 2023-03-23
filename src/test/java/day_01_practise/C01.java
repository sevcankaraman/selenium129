package day_01_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();
        // "https://www.amazon.com/" adresine gidiniz.
        driver.get("https://www.amazon.com/");
        // "https://www.n11.com/" adresine gidiniz.
        driver.get("https://www.n11.com/");
        // amazon adresine geri donunuz
        driver.navigate().back();
        // n11 adresine ilerleyiniz
        driver.navigate().to("https://www.amazon.com/");
        // sayfayi yenileyiniz
        driver.navigate().refresh();
        // pencereyi kapat
        driver.close();
        // Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("HERSEY YOLUNDA");
    }
}
