package day28_ArrayList;

public class StrongPassword_2ndApproach {

    public static void main(String[] args) {

        String password = "cldeo1990@";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)) {
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            } else {
                countSpecChar++;
            }
        }

        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecChar = " + countSpecChar);

        boolean hasUpperCase = countUpperCase >0;
        boolean hasLowerCase = countLowerCase >0;
        boolean hasDigits = countDigits>0;
        boolean hasSpecChar = countSpecChar>0;

        boolean isStrongPassword = password.length()>=8 && !password.contains(" ")
                && hasSpecChar && hasDigits
                && hasUpperCase && hasLowerCase;

        System.out.println("isStrongPassword = " + isStrongPassword);

        /*
1.Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit
 */

    }
    }
