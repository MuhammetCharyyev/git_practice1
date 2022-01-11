package day10_NestedIf;

public class NumberOfDay {

    public static void main(String[] args) {

        /*
        Create a class named NumberOfDays, an integer variable named month that has numbers 1 ~12 is given to you,
        write a program that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)
         */
        int month = 2;

        String howManyDays = (month>=0 && month<=12)?  (month==1 && month==3 && month==5 && month==7 && month==8 &&
                month==10 && month==12) ? "31 days" :(month == 2)? "28 days" :"30 days" : "NA";

        System.out.println(howManyDays);

    }
}
