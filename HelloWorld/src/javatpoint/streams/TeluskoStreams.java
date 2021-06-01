package javatpoint.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TeluskoStreams {
    public static void main(String[] args){
        // How do you generally add values and print them
        List<Integer> values = new ArrayList<>();
        // NOTE: Approach 1
        for (int i=0; i<100;i++)
            values.add(i);

        for(int i:values)
            System.out.println(i);

        values.stream().forEach(i -> System.out.println());
        //values.parallelStream().forEach(i -> System.out.println());

        // Approach 2 using streams
        IntStream
                .range(1,100)
                .forEach(i -> System.out.println());

    }
}
