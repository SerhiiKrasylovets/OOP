package exceptions;

public class DivisionWithTry {
    public static void main(String[] args) {
        int d, a;
        try {d = 0;a = 42 / d;
            System.out.println("this won't be printed");}
        catch (ArithmeticException e) {
            System.out.println("Division by zero");}
        finally {System.out.println("finally");}

        System.out.println("after try-catch");
    }
}
