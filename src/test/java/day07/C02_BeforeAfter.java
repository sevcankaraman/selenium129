package day07;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C02_BeforeAfter {
    @Before
    public void setup(){
        System.out.println("her test methodu oncesı bır kez calısır");
    }
    @After
    public void teardown (){
        System.out.println("her test metodu sonrası bır kez calısacak");
    }

    @Test
    public void test01(){
        System.out.println("ilk test");
    }
    @Test
    public void test02(){
        System.out.println("ıkıncı test");
    }

}
