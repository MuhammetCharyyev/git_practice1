package day19_LoopsPractices;

import java.util.Scanner;

public class FirstDuplicatedChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("enter you word");
        String str = scan.next();

        String result = "";

            for (int i = 0; i < str.length(); i++) {
               String each = ""+str.charAt(i);

                if (result.contains(each)) {
                    break;
                }
                result = each;
            }

        System.out.println(result);

        System.out.println("____________________________________________________");


        System.out.println("enter you word");
        String str2 = scan.next();

        String result2 = "";


        for (int i = 0; i < str2.length(); i++) {
           String each2 = ""+str2.charAt(i);

            if (result2.contains(each2)) {
                break;
            }
            result2 = each2;

        }
        int indexNum = str.indexOf(result2);
        System.out.println(indexNum);


    }

}
/*
Tasks:
    1. Write a program that can return the first duplicated character from a string
    2. Write a program that cna return the index number of the first duplicated character from a string
    3. Write a program that can display all the characters that appeared twice in the string.
    4. Write a program that can return the index number of the first unique character.
 */