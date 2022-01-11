package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        String[] group1 ={"Ali", "Layan", "Ayse"};
        String[] group2 ={"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

        // method to merge 2 arrays

        String[] students = new String[group1.length+group2.length]; // .length is just to make sure that third
        // string has enough capacity to include above two

        int i =0; // represents each index

        for (String each : group1) { // check every name from the beginning
            students[i++] = each;
        }

        for (String each : group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));

        System.out.println("________________________________________");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2= {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length+ch2.length];

        int j=0;

        for (char each : ch1) { // check every name from the beginning
            chars[j++] = each;
        }

        for (char each : ch2) {
            chars[j++] = each; // or chars[j] = each
                               //    j++
        }

        System.out.println(Arrays.toString(chars));






    }

}
