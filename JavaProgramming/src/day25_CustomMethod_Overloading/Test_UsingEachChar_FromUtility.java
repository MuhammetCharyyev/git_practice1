package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test_UsingEachChar_FromUtility {

    public static void main(String[] args) {

        String str = "Java Programing Language";

        StringUtility.printEachChar(str); // method we crated in other class StringUtility to print each char

        System.out.println("________________________________");

        String str2 = "Wooden Spoon";

        System.out.println(StringUtility.reverse(str2));
        // method we crated in other class StringUtility to reverse string


        System.out.println("________________________________");

        String str3 = "java";

        boolean palindrome = StringUtility.isPalindrome(str3);
        //method we crated in other class StringUtility to check palindrome

        System.out.println(palindrome);

        System.out.println("________________________________");

        String[] names = {"Tatyana", "Alex", "Sam", "Pam"}; // check how many palindrome

        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }

        }
        System.out.println(count);

        System.out.println("________________________________");

        String s2 = "aaabbcccdee";

        String remove = StringUtility.removeDuplicates(s2);

        System.out.println(remove);

    }

}
