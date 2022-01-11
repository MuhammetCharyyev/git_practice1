package day10_NestedIf;

public class FizzBuzz {

    public static void main(String[] args) {

        /*
         Create a class called FizzBuzz, an integer variable named number is given to you, write a program that prints
         "Fizz" if the number is divisible by 3, prints "Buzz" if the number is divisible by 5,
          and prints FizzBuzz if the number is divisible by both 3 and 5.

            Ex:
                number 15

            Output:
                FizzBuzz
         */
        int number = -185;

        String signal = (number%3==0 && number% 5==0)? "FizzBuzz" : (number% 5==0)? "Buzz" :(number% 3==0)? "Fizz" : "NA";

        System.out.println(signal);

    }

}
