package strings;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PatternDemo {
    public static void main(String[] args) {
        System.out.println(String.join(":","foobar","foo","bar")
                .chars()
                .distinct()
                .mapToObj(c->String.valueOf((char)c))
                .sorted()
                .collect(Collectors.joining()));

    }
}
