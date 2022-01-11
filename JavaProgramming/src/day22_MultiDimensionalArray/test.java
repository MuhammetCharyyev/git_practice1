package day22_MultiDimensionalArray;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        //Enter your code here:
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!\nPlease enter your personal information\nEnter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        System.out.println("Enter your email");
        String email = scan.next();
        System.out.println("Enter your street");
        String street = scan.next();
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();
        if (isMarried) {
        } else {
            System.out.println("false");
        }


        String fullName = "Full name: " + lastName + ", " + firstName;
        String contacts = "Contacts: work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email:" + email;
        String address = " Address: " + street + ", " + city + ", " + state + " " + zipcode;

        System.out.println("Patient personal information " + fullName + address + contacts + " Age: " + age + "Height: " + height + " Weight: " + weight + " pounds Married?: " + isMarried);
    }
}
