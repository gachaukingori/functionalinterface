package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWIthStreams {
    public static void main(String[] args) {

        // Stream from a list
        List<String> names = List.of("Trump", "Obama", "Biden" );
        Stream<String> stream = names.stream();

        // intemediate operators == > returns a stream eg, filter, reduce, map. return 7 names starting withb
        Stream<String> filteredStream = stream.filter(name -> name.startsWith("B")).limit(7);


        // Terminal operation we are done with the abstraction .. eg collect, count toList, forEach

       Set<String> uniqueNamesStartingWithB = filteredStream.collect(Collectors.toSet());



       // Transformations

      List<Integer>  numbersDivisbleBy2 = Stream.of(9,8,8,40,38,30,04)
                                            .map((x)->2/x)
                                             .collect(Collectors.toList());



        // Stream from an array
        String[] namesArray = {"Trump", "Obama", "Biden"};
        Stream<String> stream1 = Arrays.stream(namesArray);

    }
}
