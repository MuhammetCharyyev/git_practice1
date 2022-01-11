package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class StringMethods_CharArray {

    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars)); // [J,a,v,a]

        for (char each : chars ) { // to see all characters
            System.out.println(each);
        }

        System.out.println("_________________________________");

        String sentence = "Wooden Spoon";

        String[] word = sentence.split(" "); // split by space

        System.out.println(Arrays.toString(word));

        System.out.println("_________________________________");

        String email = "WoodenSpoon@Cydeo.com";

        String [] separate = email.split("@"); // split till @ ==> and @ not included

        System.out.println(Arrays.toString(separate));

        System.out.println("_________________________________");

        String s = "Today is nice day. Today is Monday. Today we learn Java";

        String[] sent = s.split("\\. "); // in case to be splited by dot we have to add backslash

        System.out.println(Arrays.toString(sent));


    }

}
