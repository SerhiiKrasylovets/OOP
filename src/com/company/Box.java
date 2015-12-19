package com.company;

public class Box {
    double height, width, length;

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double volume() {return width * length * height;}

    protected void finalize() {System.out.println("Goodbye Box");}
}

class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 15, 20);
        Box mybox2 = new Box(5, 7, 11);

        double vol;

        vol = mybox1.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);

        mybox1 = null;
        System.gc();
    }
}
