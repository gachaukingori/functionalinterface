package functionalinterface;

import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {
        List<Integer> myList = List.of(21,82,3,20,8, 92);
//        Predicate<Integer> predicate = myList.stream().filter()
        myList
                .stream()
                .filter(integer -> integer>30)
                .forEach(System.out::println);
    }


}
