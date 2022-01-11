package day17_WhileLoop;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z' ; i++) {
            System.out.print(i+" "); // if no break then all letter from A~Z

            if(i=='F'){
                break; // exits the loop including 'F'
            }

            System.out.println("__________________________________________");

            Scanner scan = new Scanner(System.in);

            while(true){ // you can enter number in infinite time
                System.out.println("enter number");
                int num = scan.nextInt();

                if(num<0){
                    break; // if user enter negative number loop will be stopped
                }
            }


        }


    }

}
