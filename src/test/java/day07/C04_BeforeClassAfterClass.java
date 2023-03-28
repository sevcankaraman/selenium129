package day07;

import org.junit.*;

public class C04_BeforeClassAfterClass {
    /*
     @BeforeClass ve  @AfterClass notasyonları sadece static methodlar ile çalışır.

     */
    @BeforeClass
    public static void setUp() {
        System.out.println("Tüm testlerden önce bir kez çalışır");
        System.out.println("===============");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("Tüm testlerden sonra bir kez çalışır");
        System.out.println("===============");
    }
    @Before
    public void setup(){
        System.out.println("her testten önce calısır");
        System.out.println("==================");
    }
    @After
    public void tearDown(){
        System.out.println("her testten sonra calısır");
        System.out.println("==================");
    }


    @Test
    public void test01() {
        System.out.println("İlk Test");
        System.out.println("===============");
    }

    @Test
    public void test02() {
        System.out.println("İkinci Test");
        System.out.println("===============");
    }

    @Test
    public void test03() {
        System.out.println("Üçüncü Test");
        System.out.println("===============");
    }


}