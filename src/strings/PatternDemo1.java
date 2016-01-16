package strings;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PatternDemo1 {
    public static void main(String[] args) {
        System.out.println(Pattern.compile(":")
                .splitAsStream("foobar:foo:bar")
                .filter(s -> s.contains("bar"))
                .sorted()
                .collect(Collectors.joining(":")));

        Pattern pattern = Pattern.compile(".*gmail\\.com");
        System.out.println(Stream.of("bob@gmail.com", "alice@hotmail.com")
                .filter(pattern.asPredicate())
                .count());
    }
}
