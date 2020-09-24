package intro.streams;

import java.util.Collection;
import java.util.stream.Stream;

public class BasicStream {
    public static void main(String[] args) {

//        String[] arr = new String[]{"a", "b", "c"};
//        Stream<String> stream = Arrays.stream(arr);

        Stream<String> stream = Stream.of("d2", "a1", "a2", "b1", "b3", "c");
        stream.filter(s -> s.startsWith("a")).map(s -> s.toUpperCase()).forEach(System.out::println);

    }
}
