package com.example.pattern.singlton;

import com.example.pattern.singleton.SingletoneInstaticField;
import org.junit.Test;

/**
 * Created by ProVM on 20.05.2017.
 */
public class SingltoneTest {
    @Test
    public void singltonetest(){

    System.out.println(SingletoneInstaticField.class);
        System.out.println(SingletoneInstaticField.getInstance());
        System.out.println(SingletoneInstaticField.getInstance());
    }



}
