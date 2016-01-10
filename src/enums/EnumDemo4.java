package enums;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        System.out.println("All apple consts");
        for (Apple a: Apple.values()) System.out.println(a + " " + a.ordinal());
        ap = Apple.Red;
        ap2 = Apple.Golden;
        ap3 = Apple.Red;

        if(ap.compareTo(ap2)<0) System.out.println(ap + " is before " +ap2);
        if(ap.compareTo(ap2)>0) System.out.println(ap2 + " is before " + ap);
        if(ap.compareTo(ap3)==0) System.out.println(ap + " equals " + ap3);
        System.out.println();
        if(ap.equals(ap2)) System.out.println("error");
        if(ap.equals(ap3)) System.out.println(ap + " equals " + ap3);
        if(ap==ap3) System.out.println(ap + " == " + ap3);

    }
}
