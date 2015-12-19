package com.company;

public class Access {
    int a; public int b; private int c;

    void setC(int i){c=i;}

    int getC (){return c;}
}

class AccessTest {
    public static void main(String[] args) {
        Access acc = new Access();

        acc.a = 10; acc.b = 20; acc.setC(100);

        System.out.println(acc.a + " " + acc.b + " " + acc.getC());
    }
}