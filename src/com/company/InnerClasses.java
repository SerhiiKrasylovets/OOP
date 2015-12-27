package com.company;
import static java.lang.System.out;

public class InnerClasses {
    public String testfield = "testfield";

    public static class Mynested {
        public String nested = "nested";
        public void nestedshow() {out.println(nested);}
    }

    public class Myinner {
        public String inner = "inner";
        public void innershow() {out.println(inner);}
    }

        public void show() {System.out.println(testfield);}
    }

class inner {
    public static void main(String[] args) {
        InnerClasses a = new InnerClasses();
        a.show();
        InnerClasses.Mynested a1 = new InnerClasses.Mynested();
        a1.nestedshow();
        InnerClasses.Myinner a2 = a.new Myinner();
        InnerClasses.Myinner a3 = a.new Myinner();
        a2.innershow();
        a3.innershow();
    }
}