package functionalinterface;

import java.util.function.Predicate;

// Reprsents a predicate (boolean-valued function) of one argument
public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isValidPhone("+254701502303"));
        System.out.println(isValidPhone("070150233"));

        System.out.println("With prediicate");
        System.out.println( isValidPhonePredicate.test("+254701502303"));

        System.out.println("joining predicate");

        System.out.println(
                "is phone number valid and international: "+
                        isValidPhonePredicate.and(isPhoneInternational).test("+254701502303")
        );

        System.out.println(
                "is phone number valid and international: "+
                        isValidPhonePredicate.and(isPhoneInternational).test("0701502303")
        );
    }

    public static Predicate<String> isValidPhonePredicate =
            phone-> (phone.startsWith("+254") && phone.length() == 13) || (phone.startsWith("07") && phone.length() == 10);
    public static Boolean isValidPhone(String phone){

        return (phone.startsWith("+254") && phone.length() == 13) || (phone.startsWith("07") && phone.length() == 10);
    }

    static  Predicate<String> isPhoneInternational = phone-> phone.startsWith("+");

}

