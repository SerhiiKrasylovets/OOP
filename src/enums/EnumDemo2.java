package enums;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("All apple const");

        Apple allapples[] = Apple.values();
        for (Apple a: allapples) System.out.println("a");

        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}
