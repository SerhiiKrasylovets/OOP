package com.company;

public class Box {
    double height, width, length;

    Box (Box ob) {width = ob.width; height = ob.height; length = ob.length;}

    Box(double width, double height, double length, double v) {
        this.width = width;
        this.height = height;
        this.length = length;}

    Box () {width = -1; height = -1; length = -1;}

    Box (double len) {width = height = length = len;}

    double volume() {return width * length * height;}

    protected void finalize() {System.out.println("Goodbye Box");}
}

class BoxWeight extends Box {
    double weight;

    BoxWeight (double w, double h, double l, double m) {
        width = w; height = h; length = l; weight = m;
    }
}

class BoxColor extends Box {
    String color;

    BoxColor (double w, double h, double l, String c) {
        width = w; height = h; length = l; color = c;
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 15, 20, 34.5);
        BoxWeight mybox2 = new BoxWeight(5, 7, 11, 0.88);
        BoxColor mybox3 = new BoxColor(3, 12, 0.5, "gray");
        double vol;

        vol = mybox1.volume();
        System.out.println(vol);
        System.out.println(mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println(vol);
        System.out.println(mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println(vol);
        System.out.println(mybox3.color);

        mybox1 = null;
        System.gc();
    }
}
