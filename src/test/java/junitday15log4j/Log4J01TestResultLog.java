package junitday15log4j;


import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class Log4J01TestResultLog implements TestWatcher {
    //TestWatcher interface i projede ekli olmali
    //Test Sonuclarini Depolar
    //TestWatcher interface i methodlarini yukaridaki code segmesinden implement ederiz
    //Daha sonra bu methodlari kendimize gore degistirir doldururuz

    Log4J01Log log=new Log4J01Log();


    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) { //Biz Test Sayfamizda @Test den once
        // @Disabled deyip () icine aciklama yazabiliriz , @Disabled yazarsak Junit bunu kosmaz
        TestWatcher.super.testDisabled(context, reason);
    }

    @Override
    public void testSuccessful(ExtensionContext context) { //Test BAsarili Oldu Buradakileri Log a yazdirmak icin kullanilir
        String testName = context.getDisplayName();
        log.info(testName + " PASSED");
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) { //skip demek ayni zamanada
        String testName = context.getDisplayName();
        String testFailCause = cause.getMessage() ;
        log.error(testName + " FAILED with cause : " + testFailCause);
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) { //Failed sebebinide cause ile yazdiririz
        TestWatcher.super.testFailed(context, cause);
    }
}
