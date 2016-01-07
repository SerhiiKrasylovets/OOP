package com.company;

class Box {
    private double height, width, length;

    Box (Box ob) {width = ob.width; height = ob.height; length = ob.length;}

    Box(double width, double height, double length) {this.width = width;this.height = height;this.length = length;}

    Box () {width = -1; height = -1; length = -1;}

    Box (double len) {width = height = length = len;}

    double volume() {
        return width * length * height;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight (BoxWeight ob) {super(ob); weight = ob.weight;}

    BoxWeight (double w, double h, double l, double m) {
        super (w, h, l); weight = m;}

    BoxWeight(){super(); weight = -1;}

    BoxWeight (double len, double m){super(len); weight=m;}
}

class Shipment extends BoxWeight{
    double cost;
    Shipment(Shipment ob) {super(ob); cost = ob.cost;}

    Shipment (double w, double h, double l, double m, double c){
        super (w, h, l, m);
        cost = c;}

    Shipment(){super();cost = -1;}

    Shipment (double len, double m, double c) {super(len, m);cost = c;}
}

class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 15, 20, 34.5);
        BoxWeight mybox2 = new BoxWeight(5, 7, 11, 0.88);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
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
        System.out.println(mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println(vol);
        System.out.println(myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println(vol);
        System.out.println(mycube.weight);
        System.out.println();

    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println(vol);
        System.out.println(shipment1.weight);
        System.out.println(shipment1.cost);
        vol = shipment2.volume();
        System.out.println(vol);
        System.out.println(shipment2.weight);
        System.out.println(shipment2.cost);
    }
}
