package com.company;

public class Ball {
    public static int count = 0;
    static int getCountInstance (){
        return count;
    }
    private String color = "none";
    public Ball(String color){
        this.color = color;
        count++;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                '}';
    }

    protected void finalize(){
        System.out.println("ASD");
        count--;
    }
}

class BallTest {
    public static void main(String[] args) {
        Ball sd = new Ball ("red");
        System.out.println(sd.toString());
        System.out.println(Ball.getCountInstance());
        System.out.println(Ball.count);
    }
}
