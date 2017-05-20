package com.example.pattern.singleton;

/**
 * Created by ProVM on 20.05.2017.
 */
public class SingletoneInstaticField {

    static private int a = 30;
    static private SingletoneInstaticField instance = new SingletoneInstaticField();


    private SingletoneInstaticField() {
    }

    public static SingletoneInstaticField getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Hello SingletoneInstaticField" + this.hashCode();
    }


}
