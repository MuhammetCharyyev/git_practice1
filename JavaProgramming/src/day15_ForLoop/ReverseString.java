package day15_ForLoop;

import java.util.Scanner;

public class ReverseString {


    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();

        for (int i = str.length() - 1; i >= 0; i--) { // i: index numbers of string (starting last index to index 0)

            char str2 = str.charAt(i); // or you may create empty String abc ="" and then assign abc+=str.charAt(i);

            System.out.print(str2);
        }


         /*
        result += str.charAt(11); //n
        result += str.charAt(10); //o
        result += str.charAt(9); //o
        result += str.charAt(8); //p
        result += str.charAt(7); //S
        result += str.charAt(6); //' '
        result += str.charAt(5); //n
        result += str.charAt(4); //e
        result += str.charAt(3); //d
        result += str.charAt(2); //o
        result += str.charAt(1); //o
        result += str.charAt(0); //W
*/
            /*
            Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
             */

    }

}
