package exceptions;

import static jdk.nashorn.internal.objects.NativeFunction.function;
import static jdk.nashorn.internal.objects.NativeFunction.toSource;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            function(a);}
        catch (ArithmeticException e) {System.out.println("division by zero" + e);}}

    public static void function(int a) {
        try {
            if (a == 1) a = a / (a - a);
            if (a == 2) {
                int c[] = {1};
                c[42] = 99;}}
        catch (ArrayIndexOutOfBoundsException e) {System.out.println("out of bounds" + e);}}}