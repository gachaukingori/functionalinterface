package functionalinterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {
        List<Integer> myList = List.of(21,82,3,20,8, 92);
        Predicate <Integer> predicate = x->x>30;
        Consumer<Integer> consumer = integer->{

                System.out.println(integer);

        };


        myList
                .stream()
                .filter(predicate)
                .forEach(consumer);
    }


}
