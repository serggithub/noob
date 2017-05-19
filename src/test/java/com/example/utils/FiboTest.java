package com.example.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by ProVM on 19.05.2017.
 */
public class FiboTest {
    @Test public void fiboTest() {

        Fibo fibo = new Fibo();
       //assertNotNull("app should have a greeting", classUnderTest.getGreeting());
        //System.out.println(fibo.b);


        assertEquals(1,fibo.next());

        assertEquals(1,fibo.next());
        assertEquals(2,fibo.next());
        assertEquals(3,fibo.next());
        assertEquals(5,fibo.next());
        assertEquals(5,fibo.getIndex());

    }


}
