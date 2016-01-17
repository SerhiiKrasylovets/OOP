package exceptions;

public class MyException extends Exception{
    private int number;
    MyException (int a) {number = a;}

    public static void main(String[] args) {
        try {throw new MyException(12345);}
        catch (MyException e) {System.out.println("Next catch " + e);}
    }
}


