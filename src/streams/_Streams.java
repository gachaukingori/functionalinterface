package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Streams {
    public static void main(String[] args) {
        List<Integer> myList = List.of(21,82,3,20,8, 92);

        List<Integer>  multiply2 = myList.stream()
                .map((integer -> integer * 2)).toList();


        // contain only even numbers

        Predicate<Integer>  evenPredicate =  integer -> integer%2==0;
        boolean containsOnlyEven = multiply2.stream()
                .allMatch(evenPredicate);



        System.out.println("contains only even " + containsOnlyEven);

        boolean containsAtleastOneEven = myList.stream()
                .anyMatch(evenPredicate);
        System.out.println("contains atleast one even " + containsAtleastOneEven);

        boolean containsNoEven = myList.stream()
                .noneMatch(evenPredicate);
        System.out.println("contains no even " + containsNoEven);
    }



}
