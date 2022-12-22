package chapter6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStudy {
    public static void main(String[] args) {
        Stream<String> nameStream = Stream.of("Alice", "Bob", "Charlie");
        List<String> names = nameStream.collect(Collectors.toList());

        System.out.println(names);

        String[] cityArray = new String[] {"San Jose","seoul","Tokyo"};
        Stream<String> stream = Arrays.stream(cityArray);
        List<String> collect = stream.collect(Collectors.toList());

        HashSet<Integer> numberSet = new HashSet<>(Arrays.asList(3, 5, 7));
        Stream<Integer> numberStream = numberSet.stream();

        List<Integer> collect1 = numberStream.collect(Collectors.toList());
        System.out.println(collect1);

    }
}
