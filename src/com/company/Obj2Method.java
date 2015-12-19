package com.company;


public class Obj2Method {
    int a, b;

    Obj2Method (int i, int j){
        a = i;
        b = j;
    }

    boolean compare (Obj2Method c){
        if (c.a == a && c.b == b) return true;
        else return false;
    }
    static class TestOB {
        public static void main(String[] args) {
            Obj2Method ob1 = new Obj2Method(100,22);
            Obj2Method ob2 = new Obj2Method(100,22);
            Obj2Method ob3 = new Obj2Method(-1,-3);

            System.out.println(ob1.compare(ob2));
            System.out.println(ob1.compare(ob3));

        }
    }
}
