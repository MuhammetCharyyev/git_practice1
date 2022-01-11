package day27_WrapperClasses;

public class WrapperClasses_Intro {

    public static void main(String[] args) {

        int num1 = 200;
        Integer n1 = num1; // this process is called Autoboxing

        int num2 = n1; //unboxing

        System.out.println("________________________________________");

        Integer integerValue = 100;

        long longValue = integerValue; // all primitives can accept all wrapper class value as long as
        // it is in their range , but it is not working in opposite, you can only convert the primitive to own WC

        System.out.println("________________________________________");

        Integer z = 100;
        Integer y = z; // acceptable, convert as primitive to WC

        System.out.println("________________________________________");

        int[] nums = {1,2,3,4,5,6};
        Integer[] nums2 = {1,2,3,4,5,6}; // if WC is actual class then it has method inside

    }

}
