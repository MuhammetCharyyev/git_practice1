package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner order = new Scanner(System.in);

        System.out.println("enter product name");
        String productName = order.nextLine();

        System.out.println("enter price");
        double price = order.nextDouble();

        order.nextLine();

        System.out.println("enter qty");
        int qty = order.nextInt();

        order.nextLine();

        System.out.println("enter your first name");
        String name = order.next();

        double total = price * qty;

        System.out.println(name + " your order for " + qty + " " + productName+ " has been placed. Your total is " +total);

        order.close();
        /*
        PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
         */
    }
}
