package junitday09fakerclass;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Faker01 {

    //Testleri yaparken gercek kullanici verileri(end user) kullanilmaz ,
    // hazirlanmis test datalari ya da faker class daki fake veriler kullanilir
    //dependency ye faker class i ekleriz
    //Test datalari
    // 1.Bussiness Analistten (Acceptance Criterea yazar--> Requerimentlari yazar
    // 2.Test Lead
    // 3.Manuel Tester
    //4.Tech Team * Team Lead*Dev Lead
    //5.Developer
    //6.Data Base
    //7.Api Call
    //8.Documents (Api swagger...)
    //9.Faker Class en son kullanilir

    @Test
    public void test(){

        Faker faker=new Faker();

        //isim olustur

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.name().name() = " + faker.name().name());
        System.out.println("faker.name().title() = " + faker.name().title());
        System.out.println("faker.name().username() = " + faker.name().username());

        System.out.println("***************************************************");

        faker.address().city();
        faker.address().countryCode();
        faker.address().fullAddress();
        faker.address().state();

        System.out.println("***************************************************");

        faker.animal();
        faker.artist();
        faker.aviation().METAR();
        faker.avatar();
        faker.book().author();
        faker.business().creditCardType();
        faker.color();
        faker.idNumber();

        System.out.println("***************************************************");

        faker.internet().emailAddress();
        System.out.println("faker.number().digit() = " + faker.number().digits(5));
        faker.number().numberBetween(3,9);
        long l = faker.number().randomNumber(4,true);
        faker.internet().password(4,10);
        faker.internet().password(5,11,true);
        faker.internet().password(6,12,true,true);






    }

}
