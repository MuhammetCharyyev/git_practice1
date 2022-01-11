package day23_CustomMethod_Void;

public class CustomMethod_Practice {

    public static void main(String[] args) {

        helloWorld5times();

        System.out.println("____________________");

        helloCydeo5times();

        System.out.println("____________________");

        evenNumbers();

    }

    // create a function that can print "Hello World" 5 times

    public static void helloWorld5times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

    }

    // create a function that can print "Hello Cydeo" 5 times

    public static void helloCydeo5times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }

    }

    // create function that print all even num 1~10 ==> evenNumbers

    public static void evenNumbers(){

        for (int i = 2; i < 11; i+=2) {

            System.out.println(i);

        }

    }



}
