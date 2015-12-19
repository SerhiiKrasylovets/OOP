package com.company;

public class Overload {
    void test(){
        System.out.println("No params");
    }
    void test(int...a){
        System.out.println("a: " + a);
    }
    void test (int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }
    double test (double a){
        System.out.println("double a: " + a);
        return a*a;
    }
    double test(int a){
        System.out.println("a double: " + a);
        return a;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Overload od = new Overload();
        double result;

        od.test();
        od.test(10);
        od.test(10, 20, 30, 40, 50);
        result=od.test(123.25);

        System.out.println("Result of test(123.25): " + result);
    }
}
