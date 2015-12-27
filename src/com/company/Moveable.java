package com.company;

public interface Moveable {
    int defaultX=0; int defaultY=0;

    void moveRight();
    void moveLeft();
    void moveUp();
    void moveDown();
    void moveToDefaultPosition();
}

class Circle extends Shape implements Moveable {
    protected int x, y, r;

    public Circle (int x, int y, int r, String color){super(color);this.x = x;this.y = y;this.r = r;}

    @Override    public void moveRight() {x=+1;}
    @Override    public void moveLeft() {x=-1;}
    @Override    public void moveUp() {y=+1;}
    @Override    public void moveDown() {y=-1;}
    @Override    public void moveToDefaultPosition() {x=defaultX; y=defaultY;}
    @Override    public void draw() {System.out.println(x + " " + y + " " + r + " " + super.color);}
}

