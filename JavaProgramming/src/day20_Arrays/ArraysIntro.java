package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create variables that capable enough to contain 5 names

       String[] myGroup = new String[5]; // default data for string  is [null]
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";

       // int[] myGroup = new int[5]; // default value for int  is [0] as well as for byte, short, long
        // default value for float and double  is [0.0]
        // default value for boolean  is [false]

        System.out.println(Arrays.toString(myGroup));

        System.out.println("________________________________________________________");

        String[] days = {"Mon", "Tue", "Wen", "Thu", "Fri", "Sat", "Sun"};

        System.out.println(Arrays.toString(days));

        int num = 6;

        if(num<1||num>7){
            System.err.println("invalid");
            System.exit(0);
        }

        System.out.println( days[num-1]);

    }

}

