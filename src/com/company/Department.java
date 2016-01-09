package com.company;

public class Department {
    {System.out.println("logic 1 " + this.id);}
    static {System.out.println("static logic");}
    private int id = 7;
    public Department (int id){id=id;System.out.println("construct id " + id);}
    int getId(){return id;}
    {id = 10;
        System.out.println("logic 2 " + id);}
}

class DemoLogic {
    public static void main(String[] args) {
        Department obj = new Department(71);
        System.out.println("id " + obj.getId());
        Department obj1 = new Department(50);
        System.out.println(obj1.getId());
    }
}

