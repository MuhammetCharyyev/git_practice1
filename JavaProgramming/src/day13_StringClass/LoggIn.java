package day13_StringClass;

import java.util.Scanner;

public class LoggIn {

    public static void main(String[] args) {
/*
You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
 */

        Scanner login = new Scanner(System.in);
        System.out.println("Enter username");
        String username = login.nextLine();
        System.out.println("Enter password");
        String password = login.next();

        String correctUsername = "Cydeo";
        String correctPassword = "WoodenSpoon";

        if (username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("You Logged in");
        }else{
            System.err.println("Incorrect username or password");
        }

login.close();

    }
}
