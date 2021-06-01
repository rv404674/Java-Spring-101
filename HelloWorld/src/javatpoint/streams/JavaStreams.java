package javatpoint.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) throws IOException {
        /**
         * NOTE:
         * once you have used a stream, you can't use it again.
         */
        List<Integer> values = Arrays.asList(1,2,3,4);
        Stream<Integer> integerStream = values.stream();

        integerStream.forEach(i -> System.out.println(i)); // will work
        integerStream.forEach(i -> System.out.println(i)); // will throw exception


        // Example 1
        IntStream
                .range(1,10)
                .forEach(System.out::println);

        // skip 1-5
        System.out.println("Ex2");
        IntStream
                .range(1,10)
                .skip(5)
                .forEach(x -> System.out.println(x));

        // filter and sort
        String[] names = {"Rahul", "Verma", "Sachin"};
        Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(x -> System.out.println(x));

        // stream from list
        List<String> people = new ArrayList<>(Arrays.asList("Rahul", "Verma", "Alka", "abhi"));
        people
                .stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("al"))
                .forEach(x -> System.out.println(x));

        // findFirst is a termination method, and returns the first element
        List<String> people2 = new ArrayList<>(Arrays.asList("Rahul", "Verma", "Alka", "abhi"));
        System.out.println(people
                .stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("al"))
                .findFirst().orElse("UNKNOWN")
        );
                //.forEach(x -> System.out.println(x));


        // Collect Stream result
        System.out.println("COLLECT STREAM");
        List<String> bands = Files.lines(Paths.get("bands.txt"))
                .filter(x -> x.length()>6)
                .collect(Collectors.toList());

        bands.forEach(x -> System.out.println(x));

    }
}
