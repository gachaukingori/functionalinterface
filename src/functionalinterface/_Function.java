package functionalinterface;

import java.util.function.Function;

// Function<T,R> ===> represents a function that takes one argument and produce a result
public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(0);
        System.out.println(increment2);

        Integer incrementByThenAndMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function).apply(9);
        System.out.println("multiply after adding "+incrementByThenAndMultiplyBy10);
    }

    static  Function<Integer, Integer> incrementByOneFunction = number -> number+1;

    static Function<Integer, Integer> multiplyBy10Function = number-> number *10;

    /*
    takes one argument and returns the result
     */
    static int increment(int n){
        return n + 1;
    }


}
