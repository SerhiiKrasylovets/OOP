package com.company;

public abstract class Shape {
    protected String color = "red";
    public abstract void draw();
    public Shape (String color){
        this.color = color;
    }
}

class Circle extends Shape {
    protected int x, y, r;

    public Circle (int x, int y, int r, String color){
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void draw(){
        System.out.println(x+" "+y+" "+r+" "+super.color );
    }
}

class Rectangle extends Shape {
    protected int x, y, x1, y1;
    public Rectangle(String color, int x, int y, int x1, int y1) {
        super(color);
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }
    public void draw(){
        System.out.println(x+" "+y+" "+x1+" "+y1+" "+super.color);
    }

}
