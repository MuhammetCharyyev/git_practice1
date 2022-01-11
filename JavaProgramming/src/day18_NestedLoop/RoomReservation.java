package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int priceK = 120, priceQ = 100, priceS = 80, total=0;


        while (true) {

            System.out.println("which bedroom does you want to reserve?\n(King ==> 120$\n Queen ==> 100$\nSingle ==> 80$)");
            String choice = scan.next().toLowerCase();
            System.out.println("how many nights are going to stay?");
            int nights = scan.nextInt();

            if (choice.equals("king") || choice.equals("queen") || choice.equals("single") && (nights > 0)) {
                if (choice.equals("king")) {
                    total = nights *priceK;
                } else if (choice.equals("queen")) {
                    total =nights * priceQ;
                } else {
                    total=nights * priceS;
                }
                System.out.println("Good choice! you've chosen " + nights + " nights in our " + choice + " bedroom. Total price is: " +total);
            } else {
                for (int i = 1; i < 5; i++) {
                    System.out.println("we don't have such a bedroom and nights, please, re-enter");
                    System.out.println("which bedroom does you want to reserve?\n(King ==> 120$\nQueen ==> 100$\nSingle ==> 80$)");
                    choice = scan.next().toLowerCase();
                    System.out.println("how many nights are going to stay?");
                    nights = scan.nextInt();
                }
            }

                if (!(choice.equals("king") || choice.equals("queen") || choice.equals("single"))
                        && nights > 0) {
                    System.err.println("please try again later");
                }

                System.out.println("would you like to reserve another room?");
                String a = scan.next().toLowerCase();

                while (!(a.equals("yes") || (a.equals("no")))) { // if the answer is invalid
                    System.err.println("invalid, pls re-enter");
                    a = scan.next().toLowerCase();
                }

                if (a.equals("no")) {
                    break;
                }


            }


        }



}



/*
Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

 the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
 Then Ask the user "would you like to reserve another room?""
 if yes ==> repeat the entire steps
if no ==> return the  total price

If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */

