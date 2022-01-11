package day04_Variables;

public class KgToPounds {

    public static void main(String[] args) {
        int kilogram = 65;
        double conversionFactor = 2.205;
        double pounds = kilogram * conversionFactor;

        System.out.println("kilogram = " + kilogram);
        System.out.println("conversionFactor = " + conversionFactor);
        System.out.println("pounds = " + pounds);

    }

}

/*

Create a class named KgToPounds, write a program that can convert kg (int) to pounds (double)
                    Hints: 1 kg = 2.2 pounds
 */
