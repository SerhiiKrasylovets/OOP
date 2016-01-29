/*провести исследование - ArrayList и LinkedList добавить/удалить в начало, средину, конец, засечь время,
    добавить множество элементов (от 500)
    засечь время методом System.nanoTime()*
    https://docs.google.com/spreadsheets/d/1l2gdPrPVEW0p2imoTr5KCFn9l50VECpzZYNnpTuP_Kw/edit#gid=0
    */

package collections;
import java.util.*;

public class HomeTaskCollections {

    public static void main(String[] args) {
        Random rand = new Random();
        int value = 1000000, iter = 200000;

        ArrayList<Object> al = new ArrayList<>();
        LinkedList<Object> ll = new LinkedList<>();

        {long timeal = System.nanoTime();
            for (int i = 0; i < iter; i++){al.add(rand.nextInt(value));}
            long diffal = System.nanoTime() - timeal;
        long timell = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.add(rand.nextInt(value));}
            long diffll = System.nanoTime() - timell;
        if (diffal < diffll )
            System.out.println("Adding values: ArrayList was quicker than LinkedList by " + (diffll-diffal) + " ns");
                else
            System.out.println("Adding values: LinkedList was quicker than ArrayList by " + (diffal-diffll) + " ns");}

        {long timeal = System.nanoTime();
            for (int i = 0; i < iter; i++){al.add(0, rand.nextInt(value));}
            long diffal = System.nanoTime() - timeal;
        long timell = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.addFirst(rand.nextInt(value));}
            long diffll = System.nanoTime() - timell;
        if (diffal < diffll )
                System.out.println("Adding values in the beginning: ArrayList was quicker than LinkedList by " + (diffll-diffal) + " ns");
            else
                System.out.println("Adding values in the beginning: LinkedList was quicker than ArrayList by " + (diffal-diffll) + " ns");}

        {long timeal = System.nanoTime();
            for (int i = 0; i < iter; i++){al.add(al.size(), rand.nextInt(value));}
            long diffal = System.nanoTime() - timeal;
        long timell = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.addLast(rand.nextInt(value));}
            long diffll = System.nanoTime() - timell;
        if (diffal < diffll )
                System.out.println("Adding values in the end: ArrayList was quicker than LinkedList by " + (diffll-diffal) + " ns");
            else
                System.out.println("Adding values in the end: LinkedList was quicker than ArrayList by " + (diffal-diffll) + " ns");}

        {long timeal = System.nanoTime();
            for (int i = 0; i < iter; i++){al.add(al.size()/2, rand.nextInt(value));}
            long diffal = System.nanoTime() - timeal;
        long timell = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.add(ll.size()/2, rand.nextInt(value));}
            long diffll = System.nanoTime() - timell;
        if (diffal < diffll )
                System.out.println("Adding values in the middle: ArrayList was quicker than LinkedList by " + (diffll-diffal) + " ns");
            else
                System.out.println("Adding values in the middle: LinkedList was quicker than ArrayList by " + (diffal-diffll) + " ns");}

        {long timeal = System.nanoTime();
            for (int i = 0; i < iter; i++){al.remove(0);}
            long diffal = System.nanoTime() - timeal;
        long timell = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.removeFirst();}
            long diffll = System.nanoTime() - timell;
        if (diffal < diffll )
                System.out.println("Removing values from the beginning: ArrayList was quicker than LinkedList by " + (diffll-diffal) + " ns");
            else
                System.out.println("Removing values from the beginning: LinkedList was quicker than ArrayList by " + (diffal-diffll) + " ns");}

        {long timeal = System.nanoTime();
            for (int i = 0; i < iter; i++){al.remove(al.size()-1);}
            long diffal = System.nanoTime() - timeal;
        long timell = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.removeLast();}
            long diffll = System.nanoTime() - timell;
        if (diffal < diffll )
                System.out.println("Removing values from the end: ArrayList was quicker than LinkedList by " + (diffll-diffal) + " ns");
            else
                System.out.println("Removing values from the end: LinkedList was quicker than ArrayList by " + (diffal-diffll) + " ns");}

        {long timeal = System.nanoTime();
            for (int i = 0; i < iter; i++){al.remove(al.size()/2);}
            long diffal = System.nanoTime() - timeal;
        long timell = System.nanoTime();
            for (int i = 0; i < iter; i++){ll.remove(al.size()/2);}
            long diffll = System.nanoTime() - timell;
        if (diffal < diffll )
                System.out.println("Removing values from the middle: ArrayList was quicker than LinkedList by " + (diffll-diffal) + " ns");
            else
                System.out.println("Removing values from the middle: LinkedList was quicker than ArrayList by " + (diffal-diffll) + " ns");}

        }
    }
