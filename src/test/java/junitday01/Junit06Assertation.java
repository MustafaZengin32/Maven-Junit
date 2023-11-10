package junitday01;

import org.junit.Assert;
import org.junit.Test;

public class Junit06Assertation {

    @Test
    public void denemeTesti(){

        String name1="Hasan";
        String name2="Hasan";
        Assert.assertEquals(name1,name2);

    }

    @Test
    public void denemeTesti2(){

        String name1="Has";
        String name2="Hasan";
        Assert.assertTrue(name1.length()<name2.length());

    }




}
