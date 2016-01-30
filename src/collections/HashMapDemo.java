package collections;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<String, Double>();

        hm.put("John Doe", new Double(3434.34));
        hm.put("Jane Doe", new Double(5454.54));
        hm.put("Jim Doe", new Double(3656.56));
        hm.put("Janet Doe", new Double(7878.78));

        Set <Map.Entry<String,Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me: set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);

        System.out.println("John Doe's new balance: " + hm.get("John Doe"));

    }
}