package com.company;

public interface MyInterface {
    int b=10;

    enum Enum_in_interface {A,B,C};

    static void static_method_in_interface(){
        System.out.println("Static method");
    }
    default void default_method_in_interface(){
        System.out.println("Default method");
    }
    class Class_in_interface{
        public void print(){
            System.out.println("Class in method");
        }
        interface Interface_in_interface{};
    };
}
