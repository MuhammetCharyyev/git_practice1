package day15_ForLoop;

    /*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
                     To convert char to number:
                                            '0' - 48   ==> 0
                                            '1' - 48   ==> 1
                                                    ...
 */
import java.util.Scanner;

    public class SumOfDigitsFromString {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int sum = 0;
            int length;

            System.out.println("Enter a string: ");
            String str = scan.nextLine();

            length = str.length();

            for (int i = 0; i <= length - 1; i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    sum += str.charAt(i) - 48;
                }
            }
            System.out.println(sum);
            scan.close();
        }
}
