package day24_CustomMethod_Return;

import java.util.SortedMap;

public class ReturnMethod_Practice4_RemoveDuplicates {

    public static void main(String[] args) {
        /* 1. create a method that can remove duplicated characters from a string and
         returns the new value
         */
        String str ="cccfffgttthhhrrrjjjaltt";
        str = removeDuplicates(str);

        System.out.println(str);


    }

    public static String removeDuplicates(String str){ // "aaabbcc" ==> "abc"

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result+=each;
            }
        }
        return result;

    }

}
