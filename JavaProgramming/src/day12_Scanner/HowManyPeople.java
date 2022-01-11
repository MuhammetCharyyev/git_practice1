package day12_Scanner;

import java.util.Scanner;

public class HowManyPeople {

    public static void main(String[] args) {

        Scanner count = new Scanner(System.in);
        String howManyPeople = "";

        /*
        Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
         */

        System.out.println("enter qty of people");
        int enterQty = count.nextInt();
        if (enterQty < 3) {
            howManyPeople = "Live with less than 3 people";
        } else if (enterQty >= 3 && enterQty <= 6) {
            howManyPeople = "Live with 3 - 6 people";
        } else {
            howManyPeople = "Live with more than 6 people";
        }
        System.out.println(howManyPeople);

        count.close();
    }
}
