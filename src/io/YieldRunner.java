package io;

public class YieldRunner {
    public static void main(String[] args) {

        new Thread(){
            public void run(){
                System.out.println("thread 1 start");
                Thread.yield();
                System.out.println("thread 1 finish");
            }
        }.start();
        new Thread(){
            public void run(){
                System.out.println("thread 2 start");
                System.out.println("thread 2 finish");
            }
        }.start();
    }
}
