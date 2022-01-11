package day16_ForLoopStringPractice;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str = "aabbaacc"; // should be output "abc"

        String result = "";

        for (int i=0; i<=str.length()-1; i++) { // or i<str.length() without -1
            String str2 = "" + str.charAt(i); // represents each Character of str

            if (!result.contains(str2)) { // if the character is not contained in the result
                result += str2; // the character will be added to the result
            }
        }

            System.out.println(result);




        /*
        Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding
         */

    }
}
