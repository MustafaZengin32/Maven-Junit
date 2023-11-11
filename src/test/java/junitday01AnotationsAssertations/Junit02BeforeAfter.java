package junitday01AnotationsAssertations;

import org.junit.*;

public class Junit02BeforeAfter {

    //Before notasyonu yapilan her test oncesi before yazilan testi calistirir
    //Before methodlarina setup methodu denir/Ilk basta herseyi yaptigi icin
    //After notasyonu yapilan her test sonrasi after yazilan testi calistir
    //After methoduna da teardown denir /En son kuyruk manasinda

    //Before ve Afterlarin yaninda run cikmaz cunku onlar diger testlere bagimli

    //BeforeClass o class da en ilk calisir bir kere calisir
    //AfterClass o class da en son calisir bir kere calisir
    //Ancak AfterClass ve BeforeClass statik olmak zorunda


    @Test
    public  void test01(){
        System.out.println("test01");
    }

    @BeforeClass
    public static void test00(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void test06(){
        System.out.println("AfterClass");
    }
    @Test
    public  void test02(){
        System.out.println("test02");
    }

    @Ignore
    @Test
    public  void test03(){
        System.out.println("test03");
    }

    @Before
    public  void test04(){
        System.out.println("before");
    }

    @After
    public  void test05(){
        System.out.println("after");
    }

}
