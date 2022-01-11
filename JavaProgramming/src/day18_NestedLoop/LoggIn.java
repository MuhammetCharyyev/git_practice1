package day18_NestedLoop;

import java.util.Scanner;

public class LoggIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");
        String u = scan.next();

        System.out.println("Enter password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { // if all valid
            System.out.println("Logged in");
        } else {
            for (int i = 1; i < 4; i++) {
                System.out.println("Incorrect username or password, re-enter");
                System.out.println("enter user name");
                u = scan.next();
                System.out.println("enter password");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;
                }
            }


            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                System.err.println("account locked");
            }
        }

        scan.close();

    }
}
