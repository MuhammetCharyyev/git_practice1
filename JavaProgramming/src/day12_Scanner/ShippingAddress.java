package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter name");
        String name = input.nextLine();

        System.out.println("enter building num");
        String buildNum = input.next();

        input.nextLine();

        System.out.println("enter street");
        String street = input.nextLine();

        System.out.println("enter city");
        String city = input.nextLine();

        System.out.println("enter state");
        String state = input.next();

        input.nextLine();

        System.out.println("enter zip");
        String zip = input.next();

        input.close();








    }
}
