package generics;

public interface MinMax <T extends Comparable <T>>{T min(); T max();}

class MyClass <T extends Comparable <T>> implements MinMax<T> {
    T[] vals;

    MyClass(T[] o) {vals = o;}

    public T min(){
        T v = vals[0];
        for (int i=1; i<vals.length; i++)
            if(vals[i].compareTo(v) < 0) v = vals[i];
        return v;
    }

    public T max() {
        T v = vals[0];
        for (int i=1; i<vals.length; i++)
            if(vals[i].compareTo(v) > 0) v = vals[i];
        return v;
    }
}

class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[] = {3,6,2,8,6};
        Character chs[] = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);

        System.out.println("max value in enums " + iob.max());
        System.out.println("min value in enums " + iob.min());
        System.out.println("max value in chars " + cob.max());
        System.out.println("min value in chars " + cob.min());
    }
}
