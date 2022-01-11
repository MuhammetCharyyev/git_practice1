package day23_CustomMethod_Void;

import java.util.Arrays;

public class Anagram_Task {

    public static void main(String[] args) {

anagram("lent", "listen");

    }

    public static void anagram (String first, String second){

        char[] ch1 = first.toCharArray();
        char[] ch2 = second.toCharArray();

        Arrays.sort(ch1); //{a,b,c,d}
        Arrays.sort(ch2); //{a,b,c,d}


        if(Arrays.equals(ch1, ch2)){ // Arrays.equals always return to boolean
            System.out.println(first+ " and "+second + " are anagram");
        }else{
            System.out.println(first+ " and "+second + " are not anagram");
        }


    }

}
/*
create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */