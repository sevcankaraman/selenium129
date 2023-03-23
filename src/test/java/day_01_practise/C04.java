package day_01_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04 {

    public static void main(String[] args) {

      //NOT:  manuel olarak amazona gıttık ctrl+u ya bastık ve amazonun kaynak kodları yenı sayfada acıldı

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");



        // Kaynak Kodlarini konsola yazdiriniz
        String sayfaKaynakKodlari = driver.getPageSource();
        System.out.println(sayfaKaynakKodlari);






        // Kaynak Kodlarinda "Gateway" yazdigini test edin

        if(sayfaKaynakKodlari.contains("Gateway")){
            System.out.println("Kaynak Kodlarinda Gateway Yaziyor");
        }else{
            System.out.println("Kaynak Kodlarinda Gateway Yazmiyor");
        }



        // sayfayi kapatiniz
        driver.close();




    }
}