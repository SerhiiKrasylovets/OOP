/*провести исследовани - ArrayList и LinkedList добавить/удалить в начало, средину, конец, засечь время,
    добавить множество элементов (от 500)
    засечь время методом System.nanoTime()*/

package collections;
import java.util.*;

public class HomeTaskCollections {

    public static void main(String[] args) {
        Random rand = new Random();
        int value = 1000000, iter = 500;

        ArrayList<Object> al = new ArrayList<>();
        LinkedList<Object> ll = new LinkedList<>();

        {long timeal = System.nanoTime();
            for (int i = 0; i < iter; i++){al.add(rand.nextInt(value));}
            long diffal = System.nanoTime() - timeal;
            //System.out.println("ArrayList add elements time = " + diffal);
        long timell = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.add(rand.nextInt(value));}
            long diffll = System.nanoTime() - timell;
            //System.out.println("LinkedList add elements time = " + diffll);
        if (diffal < diffll ) System.out.println("ArrayList was quicker than LinkedList in " + (diffll-diffal) + " ns");
                else System.out.println("LinkedList was quicker than ArrayList in " + (diffal-diffll) + " ns");
            System.out.println();}

        {long time = System.nanoTime();
            for (int i = 0; i < iter; i++){al.add(0, rand.nextInt(value));}
            long diff = System.nanoTime() - time;
            System.out.println("ArrayList add elements in the beginning time = " + diff);}
        {long time = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.addFirst(rand.nextInt(value));}
            long diff = System.nanoTime() - time;
            System.out.println("LinkedList add elements in the beginning time = " + diff);
            System.out.println();}

        {long time = System.nanoTime();
            for (int i = 0; i < iter; i++){al.add(al.size(), rand.nextInt(value));}
            long diff = System.nanoTime() - time;
            System.out.println("ArrayList add elements int the end time = " + diff);}
        {long time = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.addLast(rand.nextInt(value));}
            long diff = System.nanoTime() - time;
            System.out.println("LinkedList add elements in the end time = " + diff);
            System.out.println();}

        {long time = System.nanoTime();
            for (int i = 0; i < iter; i++){al.add(al.size()/2, rand.nextInt(value));}
            long diff = System.nanoTime() - time;
            System.out.println("ArrayList add elements int the middle time = " + diff);}
        {long time = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.add(ll.size()/2, rand.nextInt(value));}
            long diff = System.nanoTime() - time;
            System.out.println("LinkedList add elements in the middle time = " + diff);
            System.out.println();}

        {long time = System.nanoTime();
            for (int i = 0; i < iter; i++){al.remove(0);}
            long diff = System.nanoTime() - time;
            System.out.println("ArrayList remove elements from the beginning time = " + diff);}
        {long time = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.removeFirst();}
            long diff = System.nanoTime() - time;
            System.out.println("LinkedList remove elements from the beginning time = " + diff);
            System.out.println();}

        {long time = System.nanoTime();
            for (int i = 0; i < iter; i++){al.remove(al.size()-1);}
            long diff = System.nanoTime() - time;
            System.out.println("ArrayList remove elements from the end time = " + diff);}
        {long time = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.removeLast();}
            long diff = System.nanoTime() - time;
            System.out.println("LinkedList remove elements from the end time = " + diff);
            System.out.println();}

        {long time = System.nanoTime();
            for (int i = 0; i < iter; i++){al.remove(al.size()/2);}
            long diff = System.nanoTime() - time;
            System.out.println("ArrayList remove elements from the middle time = " + diff);}
        {long time = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.remove(al.size()/2);}
            long diff = System.nanoTime() - time;
            System.out.println("ArrayList remove elements from the middle time = " + diff);
            System.out.println();}

        }
    }
