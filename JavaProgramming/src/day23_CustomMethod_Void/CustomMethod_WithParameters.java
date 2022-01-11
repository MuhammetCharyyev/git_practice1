package day23_CustomMethod_Void;

public class CustomMethod_WithParameters {

    public static void main(String[] args) {

        oddOrEven(4); // method demands additional info to complete the task inside the ()

        ageOfPerson(1990);

    }

    // create a function that can check if the number is odd or even

    public static void oddOrEven(int num) { // without  the info such as (int num)the below is not possible

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }else{
            System.out.println(num+" is odd");
        }

    }

    // create a function that display age of person

    public static void ageOfPerson (int birthYear){ // you may add the second parameter after the coma "," ==>
        // (int x, int y) // even another variable , boolean for example // for this you'll need call
        // both parameters in main

        int age = 2021 -birthYear;

        System.out.println( "your age is " +age);
    }

}
