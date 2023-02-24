import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<Cat> optionalCat = findCatByName("Hosea");
        Cat cat = optionalCat.orElse(new Cat("Kamau", 0));

        String catName = optionalCat.map((x)-> {
            System.out.println(x);
            return cat.name;
        }).orElseGet(()->{
            return "Mutua";
        });

        System.out.println(catName);

    }



    public static Optional<Cat>  findCatByName(String name){

        Cat cat = new Cat(name, 8);
        return Optional.ofNullable(null);
    }

    record Cat(String name, int age){}
}

