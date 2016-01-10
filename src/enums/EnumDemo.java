package enums;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.Red;
        System.out.println("Value of ap " + ap);

        ap = Apple.Golden;

        if (ap ==Apple.Golden) System.out.println("ap contains Golden");

        switch (ap){
            case Jonathan:
                System.out.println("Jonathan is red");
            case Golden:
                System.out.println("Golden is yellow");
            case Red:
                System.out.println("Red is red");
            case Winesap:
                System.out.println("Winesap is red");
            case Cortland:
                System.out.println("Cortland is red");
        }
    }
}
