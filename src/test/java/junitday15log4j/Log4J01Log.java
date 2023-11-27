package junitday15log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4J01Log {
    //Testlerin Loglarini tutarsak geriye donuk bakmak icin tutulur
    //Ilk olarak log4j dependecy ekleriz
    //Log4j icin configurasyonun icinde oldugu bir xml dosyasi olusturmaliyiz
    //Bu xml de farkli farkli appender ler var  , bunlarin amaci bu loglari bir dosyaya atmak
    //name=File value=logfile.log ornek olarak bilgiler var , true false olmasi her yaptiginda sil ya da silme demek
    //name =Target value System.out appender i ile de loglari terminalde yazdirabiliriz
    //root Info ile bilgileri aliyoruz

    //Class da bir log mekanizmasini olusturucam method ve class larla sonra bu class iistedigim yerde kullanicam

    static Logger logger=Logger.getLogger(Log4J01Log.class);//obje olusturdum icine bu class i(verileri alacagim) koydum

    public Log4J01Log() {
        DOMConfigurator.configure("log4j.xml");//oNCEDEN CONFIGURE ETTIGIM XML DOSYASINA ULASTIM

    }

    public void info(String message){ //bu mesaji info tag i ile bir log a yazacagiz
        logger.info(message);
    }

    public void warn(String message){
        logger.warn(message);
    }

    public void error(String message){
        logger.error(message);

    }







}
