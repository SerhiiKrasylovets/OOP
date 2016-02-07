package io;

class threads implements Runnable{
    public void run(){
        System.out.println("side thread");
    }
}

public class Program{
    static threads mthreads;

    public static void main(String[] args) {
        mthreads = new threads();
        Thread myThready = new Thread(mthreads);
        myThready.start();
        System.out.println("main thread is finished");
    }
}
