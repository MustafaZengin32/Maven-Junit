package junitday10exceptions;

import org.junit.Test;

public class Exceptions01 {

    //Herkes exception alabilir , normal
    //ELe alabilmek , tecrube gostergesi
    //En cok gorulen NoSuchElementException
    //NSEE : Yanlis Locator , Popup , Yeni Pencere ,Iframe
    //Sayfa dolmada problem , yavaslamalar , sakli olan elementler vb sebebiyle
    //NSE de ilk locator dogru mu , manuel iframe ,windows , alert var mi , bekleme ver

    //TimeOutException : Explicitly wait & yanlis locator
    //TOE da locator dogru mu , sureyi arttir , fm de hazir methodlarla ele al
    //farkli methodlar kullan , visiblty elemetn yerine presenceelement ya da js vb

    //NullPointerException WebDriver driver; yazip = new Chrome driver tanimlamaz isek
    //driver.get("") olupo ici bos alirsa bu hatayi aliriz

    //StaleElementException , eskimis , bozulmus , tarihi gecmis demek
    //Ayni elemani tekrar tekrar kullaninca alinabilir
    //Sayfayi refersh yapinca ya da ileri geri yapilinca alinabilir
    //Cozum tekrar locate etmek
    //Ayni elementi tekrar tanimlamak ya da farkli bir yol ile almak

    //Hata mesaji oku
    //Genelde locate , zaman ,iframe vb
    //5 exception i say
    // NoSuchElement , TimeOutException , NullPointerException
    //StaleElementException , Web Driver Exception
    //Hangi wait i tercih ediyorsun impicitly , hala varsa exp wait kullanilir








    @Test
    public void test(){

        /*


Try-catch

try
   {
     // Some code
   }
catch(Exception e)
  {
     // Code for Handling the exception
  }

Multiple catch blocks

try
   {
      //Some code
   }
catch(ExceptionType1 e1)
   {
     //Code for Handling the Exception 1
   }
catch(ExceptionType2 e2)
   {
     //Code for Handling the Exception 2
   }


Throw / Throws



public static void anyFunction() throws Exception
{

try
   {
     // write your code here
   }
catch (Exception e)
   {
      // Do whatever you wish to do here

      // Now throw the exception back to the system
      throw(e);
   }
}

Multiple Exceptions
One can mention various Exceptions in the throws clause. Refer to the example below:

public static void anyFunction() throws ExceptionType1, ExceptionType2

{
 try
   {
     // write your code here
   }
 catch (ExceptionType1 e1)
   {
    // Code to handle exception 1
   }
 catch (ExceptionType1 e2)
   {
    // Code to handle exception 2
   }
}


Finally
The Finally keyword is used to create a block of code under the try block. This finally code block always executes irrespective of the occurrence of an exception

try
  {
    //Protected code
  }
catch(ExceptionType1 e1)
  {
    //Catch block
  }
catch(ExceptionType2 e2)
  {
    //Catch block
  }
catch(ExceptionType3 e3)
  {
    //Catch block
  }

finally
   {
     //The finally block always executes.
   }

One can also use the following methods to display Exception Information:

printStackTrace(): It prints the stack trace, name of the exception, and other useful description
toString(): It returns a text message describing the exception name and description
getMessage(): It displays the description of the exception
         */





    }


}
