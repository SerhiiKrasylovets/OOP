package com.company;
import com.company.Shape;

public class Main {
    public static void main(String[] args) {
        Shape s[] = new Shape[3];
        s[0] = new Circle(10,10,5,"black");
        s[1] = new Rectangle("yellow",10,10,50,50);
        s[2] = new Circle(10,10,5,"green");

        for (int i = 0; i<s.length;i++) s[i].draw();
    }

}
