package junitday07cookies;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Cookies02 extends TestBase {

/*
    Cookies
        --> Çerezler, belirli kullanıcıları tanımlamak ve bu kullanıcıların göz atma deneyimini iyileştirmek için
        kullanıcının bilgisayarı ile web sunucusu arasında takas edilen, kullanıcı adı ve parola gibi küçük veri
        parçalarını içeren dosyalardır.
        --> İnternette gezinirken ziyaret ettiğiniz web sayfaları, bilgisayarınıza ve telefonunuza küçük bilgi dosyaları
        kaydeder. Bu dosyalar telefon veya bilgisayarınızın hafızasında saklanır. Daha sonra aynı siteleri ziyaret ettiğinizde
        bu kayıtlı bilgi dosyaları sayesinde siteler sizi tanıyabilir.
        --> Bilgileriniz bu dosyalara yazıldığından dolayı tekrar aynı websayfalarını ziyaret ettiğinizde bilgilerinizi
        yeniden girmeye gerek duymazsınız.
        --> Cookies, kişisel bilgiler de dahil olmak üzere birçok bilgiyi içerebilir. Web siteleri, ancak sizin izin
        verdiğiniz bilgilere erişebilir. Bu web sayfaları, sizin vermediğiniz bilgilere erişemez ya da bilgisayarınızdaki
        diğer dosyaları görüntüleyemez.

        Selenium ile cookies otomasyonu yapabiliriz.
            Driver.manage( ). method’u ile cookie’leri
                    -listeleyebilir
                    -Isim ile cagirabilir
                    -Yeni cookie ekleyebilir
                    -Var olanlari ismi silebilir
                    -Var olan tum cookie’leri silebiliriz

        driver.manage().addCookie();                --> void
        driver.manage().getCookies();               --> Set<Cookie>
        driver.manage().deleteAllCookies();         --> void
        driver.manage().deleteCookie();             --> void
        driver.manage().getCookieNamed();           --> Cookie
        driver.manage().getCookieNamed();           --> String

 */
@Test
public void handleCookiesTest() {

//        Amazona git
    driver.get("https://www.amazon.com");
    wait(3);
//        1.toplam cookie sayisini bul
    Set<Cookie> allCookies = driver.manage().getCookies(); // toplam cerez sayisi
    int cookieSayisi = allCookies.size();
    System.out.println("Sayfada "+cookieSayisi+ " adet cookie var");
//        3. Bir Cookie yi ismiyle bul

//        tum cokkie leri yazdiralim0
//        allCookies.stream().forEach(t -> System.out.println(t.getName()));

    int i=1;
    for (Cookie w : allCookies){
        System.out.println(i+". "+"COOKIE : "+w);//COOKIE NIN TAMAMINI YAZDIK  --> name = value <--ikilisi
        System.out.println(i+". "+"COOKIE ISIMLERI : "+ w.getName());
        i++;
    }

    System.out.println("COKKIEYI ISMIYLE CAGIRIYORUM : "+driver.manage().getCookieNamed("i18n-prefs"));


//        4. Yeni bir cookie ekle
    Cookie favoriCookiem= new Cookie("cikolatam","antem-fistikli-cikolata");//cookie olustur
    driver.manage().addCookie(favoriCookiem);//sayfaya yeni cookie ekle
    wait(3);
    System.out.println("Yeni Cookie Sayisi : "+driver.manage().getCookies().size());//cookie sayisi artti


//        5. Bir Cookie yi ismiyle sil
    driver.manage().deleteCookieNamed("session-id");

    System.out.println("Yeni Cookie Sayisi : "+driver.manage().getCookies().size());//cookie sayisi azaltti

//        6. Tum cookie leri sil
    driver.manage().deleteAllCookies();
    wait(5);
    System.out.println("TUM COOKIES LERI SILDIM. YENI COOKIE SAYISI : "+driver.manage().getCookies().size());



}

}
