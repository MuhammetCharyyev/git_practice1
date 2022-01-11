package day15_ForLoop;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("enter word");
        String str = new Scanner(System.in).nextLine();

        String str2 = "";

        for (int i = str.length()-1; i>=0; i--){
            str2+=str.charAt(i);
        }


        if (str2.equalsIgnoreCase(str)){ // or you may create boolean palindrome = (str2.equalsIgnoreCase(str))
            // and then sout "palindrome"
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
