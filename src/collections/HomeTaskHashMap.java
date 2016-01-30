package collections;
import java.util.*;

public class HomeTaskHashMap {
    public static void main(String[] args) {
        HashMap<String, Float> hm = new HashMap<String, Float>();

        hm.put("Gold", new Float(156.12));
        hm.put("Silver", new Float(28567.5));
        hm.put("Bronze", new Float(65012.8));
        hm.put("Iron", new Float(400050.9));

        Set <Map.Entry<String, Float>> set = hm.entrySet();

        for (Map.Entry<String, Float> me: set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());}
            System.out.println();

        float total = hm.get("Gold");
        hm.put("Gold", total + 350);

        System.out.println("New weight of Gold is: " + hm.get("Gold"));


    }
}
