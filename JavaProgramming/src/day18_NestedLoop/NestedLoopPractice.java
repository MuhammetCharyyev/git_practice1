package day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.println("enter your age");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) { // while the age is invalid
                System.err.println("invalid, re-entry");
                age = scan.nextInt();
            }
            System.out.println("would like to continue"); // till you enter right age then return to the beginning
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || (a.equals("no")))) { // if the answer is invalid
                System.err.println("invalid, pls re-enter");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")) {
                break;
            }
        }

        scan.close();
    }
}
