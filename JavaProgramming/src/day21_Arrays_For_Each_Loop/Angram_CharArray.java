package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class Angram_CharArray {

    public static void main(String[] args) {

        String str1 = "asdb";
        String str2 = "dbca";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str1.toCharArray();

        Arrays.sort(ch1); //{a,b,c,d}
        Arrays.sort(ch2); //{a,b,c,d}

        boolean anagram = Arrays.equals(ch1, ch2); // Arrays.equals always return to boolean

        System.out.println(anagram);

    }
}
