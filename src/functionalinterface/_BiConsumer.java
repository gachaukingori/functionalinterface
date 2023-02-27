package functionalinterface;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {
        Customer customer = new Customer("Victor", "+36743994");
        greetCustomer(customer, true);
        greetCustomerBiConsumer.accept(customer,false);


    }
    record Customer(String name, String phoneNumber){

    }

 public static    BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber)-> {
        System.out.println("Hello from Biconsumer " +
                customer.name + "Your number is "+
                (showPhoneNumber?customer.phoneNumber:"xxxxxxxx"));
    };
    private static void greetCustomer(Customer customer, boolean showPhone){
        System.out.println("Hello  " +
                customer.name + "Your number is "+
                (showPhone?customer.phoneNumber:"xxxxxxxx"));
    }
}
