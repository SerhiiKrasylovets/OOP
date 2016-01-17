package exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        int a;
        try {
            a = args.length;
            int b = 42 / a;
            int [] c = new int[a];
            c[a] = 666;}
        catch (ArithmeticException e) {System.out.println("division by zero" + e);}
        catch (ArrayIndexOutOfBoundsException e) {e.printStackTrace();}
        System.out.println("after try-catch-catch block");
    }
}