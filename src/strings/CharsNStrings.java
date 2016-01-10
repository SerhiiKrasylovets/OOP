package strings;

public class CharsNStrings {
    public static void main(String[] args) {

        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String s = new String(chars, 2, 3);
        System.out.println(s);
    }
}