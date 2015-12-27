package com.company;

public class Main implements MyInterface{
    public static void main(String[] args) {

        Enum_in_interface s = Enum_in_interface.C;
        System.out.println("Enum from interface" + s);

        MyInterface.static_method_in_interface();

        MyInterface g = new Main();
        g.default_method_in_interface();

        Class_in_interface f = new Class_in_interface();
        f.print();
    }
}
