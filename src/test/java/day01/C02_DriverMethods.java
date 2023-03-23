package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        WebDriverManager.edgedriver().setup();
        WebDriver edge = new EdgeDriver(); // burda boş bır browser actık
        edge.get("https://www.google.com/"); // gitmek ıstedgımız sayfayı
        System.out.println("Sayfa baslıgı" + edge.getTitle());//edge.getTitle() sayfa baslıgını getırır
        System.out.println("Sayfa adresi(URL)" + edge.getCurrentUrl());//edge.getCurrentUrl() sayfa adresını getırır
        //System.out.println(edge.getPageSource());//edge.getPageSource() sayfa kaynak kodlarını getırır
        System.out.println(edge.getWindowHandle());//edge.getWindowHandle() sayfanın (window) hash degerını getırır../
        // bu hash degerlerı ıle baska sayfadan bu sayfaya dırekt dönebılmeyı saglar.yanı sayfalar arası gecıs.


    }
}
