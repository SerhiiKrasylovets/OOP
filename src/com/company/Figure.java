package com.company;

abstract class Figure {

    double dim1, dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure{
    Rectangle (double a, double b){
        super(a,b);
    }

    double area(){
        System.out.println("rectangle");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle (double a, double b){
        super(a, b);
    }

    double area (){
        System.out.println("triangle");
        return dim1*dim2/2;
    }
}

class FindAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref;

        figref = r;
        System.out.println("S = " + figref.area());
        figref = t;
        System.out.println("S = " + figref.area());
    }
}
