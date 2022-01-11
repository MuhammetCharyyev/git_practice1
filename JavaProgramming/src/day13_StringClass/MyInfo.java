package day13_StringClass;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Enter age");
        int age = info.nextInt();

        System.out.println("Enter gender");
        String gender = info.next();

        info.nextLine();

        System.out.println("Enter full name");
        String fullName = info.nextLine();

        System.out.println("Enter phone num");
        long phoneNum = info.nextLong();

        info.nextLine();

        System.out.println("Enter zipcode");
        int zipCode = info.nextInt();

        info.nextLine();
        System.out.println("Enter school name");
        String schoolName = info.nextLine();

        System.out.println("Enter city name");
        String cityName = info.nextLine();

        System.out.println("Enter state name");
        String state = info.next();

        info.nextLine();

        System.out.println("Enter building num");
        int buildNum = info.nextInt();

        info.nextLine();

        System.out.println("Enter street name");
        String street = info.nextLine();

        String address = ("address: " + "\n\t\t\t" + buildNum + " " + street + "\n\t\t\t" + cityName + " "
                + state + " " + zipCode);

        System.out.println("1. " + age+ "\n" + "2. " + gender + "\n" + "3. " + fullName + "\n" + "4. " + phoneNum + "\n"
        + "5. " + address + "\n"+ " 6. " + schoolName);

        info.close();


        /*
        Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in separate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name
         */

    }

}
