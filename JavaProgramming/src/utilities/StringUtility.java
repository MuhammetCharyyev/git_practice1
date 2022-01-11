package utilities;

import java.util.Arrays;

public class StringUtility {


    // this method prints each character of the give string
    public static void printEachChar (String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }



    }


    // this method can be used to reverse any string// just to import it to others class
    public static String reverse (String str){

        String result ="";

        for(int i =str.length()-1; i >=0; i-- ){
            result+=str.charAt(i);

        }

        return result;

    }

    // this method can be used to check is given string a palindrome ==> returns boolean at the end

    public static boolean isPalindrome (String str){

        return reverse(str).equalsIgnoreCase(str); // just called reverse from above method

    }


    // crate method to check if the given string is anagram, returns boolean
    public static boolean anagram (String str1, String str2){ // "acb", "bca"
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    // create method to remove all duplicates from given string, returns String
    public static String removeDuplicates (String str){ // "aaabbcccdee" "abcde"

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result+=each;
            }
        }
        return result;



    }

    // check if password is strong
    public static boolean isStrongPassword (String password){ // creat a method to check strong password

        boolean r1 = password.length() >= 8 && !password.contains(" "); // must be more than 8 symbols
        // and with no space
        boolean r2 = false; // check if it has upper case
        boolean r3 = false; // check if it has lower case
        boolean r4 = false; // check if it has special char
        boolean r5 = false; // check if it has digit

        char[] chars = password.toCharArray(); // convert to array and will check every char

        for (char each : chars) { // each character of the array
            if(Character.isUpperCase(each)){ // check if each char has upper case
                r2=true; // if contains then true
            }else if (Character.isLowerCase(each)){ // check if each char has lower case
                r3=true; // if contains then true
            }else if (Character.isDigit(each)){  // check if each char has digit
                r5 =true; // if contains then true
            }else{ // check if each char has special char
                r4 =true; // if contains then true
            }

        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }


}
