package day17_WhileLoop;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter user name");
        String u = scan.next();

        System.out.println("enter password");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("Cydeo123")){ // if all valid
            System.out.println("Logged in");
        }else {
            int attempts = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) { // while the credentials are invalid
                //and user attempts are
                if(attempts==1){
                    System.err.println("this is your last chance");
                }
                System.out.println("Incorrect username or password, re-enter");
                System.out.println("enter user name");
                u = scan.next();
                System.out.println("enter password");
                p = scan.next();
                attempts--;
            }
            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("Logged in");

            } else {
                System.out.println("account locked");
            }
        }

    }
}

/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                 to enter correct credentials and if all three attempts are failed, then print
                  "Your account is lucked."
 */
