package day17_WhileLoop;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter age");
        int age = scan.nextInt(); // what if he entered 150 instead 15 or -15 // valid age 1~120//

        while (!(age>=1 && age<=120)){
            System.err.println("invalid entry, re-enter");
            System.err.println("enter age");
            age = scan.nextInt();
        }

        System.out.println("are you US citizen? yes/no");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes"))||(answer.equals("no"))){
            System.err.println("invalid entry, re-enter");
            System.err.println("are you US citizen? yes/no");
            answer = scan.next().toLowerCase();
        }

        if (age>=18&&answer.equals("yes")){
            System.out.println("you're eligible");
        }else{
            System.out.println("you're not eligible");
        }

    }
}
