/*провести исследовани - ArrayList и LinkedList добавить/удалить в начало, средину, конец, засечь время,
    добавить множество элементов (от 500)
    засечь время методом System.nanoTime()*/

package collections;
import java.util.*;

public class HomeTaskCollections {
    public static void main(String[] args) {
        Random rand = new Random();
            ArrayList<Object> al = new ArrayList<>();
        System.out.println(al);
                for (int i = 0; i < 1; i++){al.add(rand.nextInt(1000000));}
        System.out.println(al);
                for (int i = 0; i < 1; i++){al.add(1, rand.nextInt(1000000));}
        System.out.println(al);
        }
    }