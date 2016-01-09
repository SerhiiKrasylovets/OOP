package com.company;

public class EqualsInteger {
    public static void main(String[] args) {
        Integer iOb = 100;
        Integer kOb = 100;
        /*Integer iOb = 1000;
        Integer kOb = 1000;*/

        if (iOb.equals(kOb)) {
            System.out.println("equals");
        } else System.out.println("not equals");
        if (iOb == kOb) {
            System.out.println("== equal");
        } else System.out.println("== no equal");
    }
}
