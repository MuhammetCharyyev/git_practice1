package day24_CustomMethod_Return;

import java.util.Arrays;

public class IsAnagramCustomMethod_Task {

    public static void main(String[] args) {

        String str1 = "wcba",
        str2 = "bac";
        System.out.println(isAnagram(str1,str2));

    }

    public static boolean isAnagram (String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1); //{a,b,c,d}
        Arrays.sort(ch2); //{a,b,c,d}



        if(Arrays.equals(ch1, ch2)){ // Arrays.equals always return to boolean
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        return Arrays.equals(ch1, ch2);
                
            }

    }



/*
create a method named isAnagram that passes two String parameters, the method returns true
if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
 */