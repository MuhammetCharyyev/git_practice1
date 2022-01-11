package day24_CustomMethod_Return;

import java.util.Arrays;

public class MergeTwoArrays_Task {

    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Ayse"};
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};
        String[] merged = merged(group1, group2);

        System.out.println(Arrays.toString(merged));
    }

    public static String[] merged(String[] group1, String[] group2) {

        String[] result = new String[group1.length + group2.length];

        int i = 0; // represents each index

        for (String each : group1) { // check every name from the beginning
            result[i++] = each;
        }

        for (String each : group2) {
            result[i++] = each;
        }

        return result;

    }


}
