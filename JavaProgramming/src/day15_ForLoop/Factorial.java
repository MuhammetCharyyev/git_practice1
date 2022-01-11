package day15_ForLoop;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num ; i++) {
            factorial *= i;

        }
        System.out.println(factorial);
        scan.close();

    }
}
