package junitday10fileexistdownloadupload;

import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class File01Exist {

    //Selenium ile windows uygulamalarini test edemeyiz
    //Bunu test etmek icin Java kullanilir

    @Test
    public void test(){


        System.out.println(System.getProperty("user.dir"));//C:\Users\Lenovo i5\IdeaProjects\Junit
                                                           //icinde bulunulan klasorun yolunu verir
        String userhome = System.getProperty("user.home");
        System.out.println(userhome);//C:\Users\Lenovo i5
                                                            //bilgisayardaki user klasorunu verir
        System.out.println(Files.exists(Paths.get("C://Users//Lenovo i5//IdeaProjects//Junit//src//test//java//File Exist Calismasi.xlsx")));
        //Yukaridaki ifade boolean dondurur ve "" icindeki path i verilen dosya var mi yok mu kontrol eder

        String logoPath=userhome+"//Downloads//Logo.png";

        System.out.println("Files.exists(Paths.get(logoPath)) = " + Files.exists(Paths.get(logoPath)));


    }
}
