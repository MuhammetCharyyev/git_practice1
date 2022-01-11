package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        String firstName="cyDEo", lastName = "SCHOOL";

       //firstName= firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase(); ==>one option
        firstName= (""+ firstName.charAt(0)).toUpperCase() +firstName.substring(1).toLowerCase(); // ==>another one
        // to covert char to String you have to "" +

        System.out.println(firstName);

        lastName = lastName.substring(0, 1).toUpperCase() +lastName.substring(1).toLowerCase();

        System.out.println(lastName);



    }

}
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */