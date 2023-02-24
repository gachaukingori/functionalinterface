package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Person person  =new Person("Victor", "Kingori");
        greetPerson(new Person("Victor", "Kingori"));
        greetPersonConsumer.accept(person);

    }

    static Consumer<Person> greetPersonConsumer = person-> System.out.println("hello "+person.lname + " "+person.fname);
    static void greetPerson(Person person){
        System.out.println("hello "+person.lname + " "+person.fname);
    }
    record Person(String fname, String lname){}
}
