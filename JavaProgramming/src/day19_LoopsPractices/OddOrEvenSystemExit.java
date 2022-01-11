package day19_LoopsPractices;

import java.util.Scanner;

public class OddOrEvenSystemExit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

            System.out.println("would you like to enter another number? y/n");
            String a = scan.next();

            if(!(a.equalsIgnoreCase("yes")) ||(a.equalsIgnoreCase("no"))) {
                System.err.println("invalid entry");
                System.exit(0);
            }

            if (a.equalsIgnoreCase("no")) {
                System.out.println("thank you");
                break;
            }

        }
    }


}
