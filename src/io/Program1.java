package io;

class AffableThread extends Thread{
    @Override
    public void run(){
        System.out.println("side thread");
    }
}

public class Program1{
    static AffableThread mSecondThread;

    public static void main(String[] args) {
        mSecondThread = new AffableThread();
        mSecondThread.start();
        System.out.println("main thread is finished");
    }
}
