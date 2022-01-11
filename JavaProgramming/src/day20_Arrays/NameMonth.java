package day20_Arrays;

import java.util.Arrays;

public class NameMonth {

    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov","Dec"};

        //System.out.println(Arrays.toString(months));

        int num = 11;

        if(num<1||num>12){
            System.err.println("invalid");
            System.exit(0);
        }

        System.out.println(months[0]); // if just want to print out one of the month, just change index num

        System.out.println( months[num-1]);

        System.out.println("___________________________________________________");

        // you can also create a loop for huge value to not indicate list of arrays data

        for (int i = 0; i < months.length; i++) { // add length if you dont know the length of value
            System.out.println( months[i]);
        }

        System.out.println("___________________________________________________");

        for (int i = months.length-1; i >=0 ; i--) { // i: represents index of array starting from last index
            System.out.println(months[i]);
        }


    }
}
