package com.example.utils;

/**
 * Created by ProVM on 19.05.2017.
 */
public class Fibo implements IFibo {

    private int a;
    private int b;
    private int index = 0;
    protected int d = 10;
    int e=15;
    public static int g=25;

    public Fibo() {
        a = 1;
        this.b = 0;
    }

    @Override
    public int next() {
        int c;
        c = a + b;
        b = a;
        a = c;
        index = index + 1;
        return b;

    }

    @Override
    public void reset() {
        a = 1;
        b = 0;
        index = 0;
    }

    @Override
    public int getIndex() {
        return index;
    }

}

class Fibo2 extends Fibo {
    int getd() {
        return d;
    }

}

