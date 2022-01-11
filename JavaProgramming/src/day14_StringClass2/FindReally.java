package day14_StringClass2;

import java.util.Scanner;

public class FindReally {

    public static void main(String[] args) {

        Scanner find = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = find.next();

        String lastTwoChars = word.substring( word.length()-2 );

        if(lastTwoChars.equals("ly")){
            System.out.println("really???");
        }else{
            System.out.println("Never mind");
        }

        find.close();



    }
}
