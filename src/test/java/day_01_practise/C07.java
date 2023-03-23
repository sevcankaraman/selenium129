package day_01_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C07 {
    public static void main(String[] args) {
        // https://www.amazon.com/ adresine gidin
        // arama motorunda nutella yazip aratınız
        // sayfada kac tane link oldugunu bulunuz
        // linkleri yazdiriniz
        // pencereyi kapatiniz

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");

        // arama motorunda nutella yazip aratınız
        //WebElement aramaMotoru=driver.findElement(By.id("twotabsearchtextbox") );
        //aramaMotoru.sendKeys("nutella"+ Keys.ENTER);
     
        // sayfada kac tane link oldugunu bulunuz
        List<WebElement> linklerlistesi= driver.findElements(By.tagName("a"));
        System.out.println("sayfadakı lınk sayısı: "+linklerlistesi.size()); // kac tane lınk oldugunuz size () methodu verıyor

        // linkleri yazdiriniz
        int sayi=1;
        for (WebElement each:linklerlistesi){
            System.out.println(sayi+ " . link "+ each.getText());   // gettext  sayıyı strınge cevırıyor
            sayi++;

            }
        driver.close();
        }
        // pencereyi kapatiniz

    }
