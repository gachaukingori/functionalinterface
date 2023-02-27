package functionalinterface;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

// represents a supplier of results, no arguments and a return
public class _Supplier {
    public static void main(String[] args) {
        System.out.println("Random no supplier");
        System.out.println(getRandomFromAList());

        System.out.println("Random from supplier");
        System.out.println(getRandomFromIntegerSupplier.get());

    }

    static Integer getRandomFromAList(){
        List<Integer> list = List.of(9,4,58, 8,50);
        int randomIndex = new Random().nextInt(list.size()-1);
        return list.get(randomIndex);
    }

    static Supplier<Integer> getRandomFromIntegerSupplier = ()->{
        List<Integer> list = List.of(9,4,58, 8,50);
        int randomIndex = new Random().nextInt(list.size()-1);
        return list.get(randomIndex);
    };
}
