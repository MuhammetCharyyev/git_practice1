package day12_Scanner;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner stock = new Scanner(System.in);

        System.out.println("enter how many shares you have");
        int shares = stock.nextInt();

        if (shares >=1){

        }else{
            System.out.println("invalid number");
        }

        stock.nextLine();

        System.out.println("how much your total value in the stock market");
        double totalValue = stock.nextDouble();

        stock.nextLine();

        System.out.println("enter name the company you have the most shares");
        String company = stock.nextLine();

        System.out.println("Your total stock market holding is $" + totalValue + " which is made up of " + shares +
                ". " + company + " is your company holdings.");

        stock.close();




        /*
        StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
         */

    }
}
