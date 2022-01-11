package day35_Encapsulation.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory_Task {

    public static void main(String[] args) {
       Candies_Task candy1 = new Candies_Task("M&Ms", 100, 10, false);
       Candies_Task candy2 = new Candies_Task("Reels", 200, 8, true);
       Candies_Task candy3 = new Candies_Task("Choc", 400, -5, true);
       Candies_Task candy4 = new Candies_Task("Zoz", 10, 0, false);
       Candies_Task candy5 = new Candies_Task("Bram", 100, 15, false);

       String[] candies = {String.valueOf(candy1), String.valueOf(candy2), String.valueOf(candy3),
               String.valueOf(candy4), String.valueOf(candy5)};
        ArrayList<String> candyFactory = new ArrayList<>(Arrays.asList(candies));


        for (String each : candyFactory) {
            System.out.println(each);
        }
    }
}
/*
 1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */