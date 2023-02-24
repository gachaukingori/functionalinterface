package functionalinterface;
//Takes 2 inputs and return 2 inputs

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {
        // normal function
        System.out.println(incrementByOneAndMultiply(8,100));

        //BiFunction
        System.out.println(incrementAndMultiplyBiFunction.apply(8,100));

    }


    static BiFunction<Integer,Integer, Integer> incrementAndMultiplyBiFunction =
            (numberToIncrement, numberToMultiply)-> (numberToIncrement + 1) * numberToMultiply;




    public static int incrementByOneAndMultiply(int number, int numberToMultiplyWith){
        return (number + 1) * numberToMultiplyWith;
    }
}
