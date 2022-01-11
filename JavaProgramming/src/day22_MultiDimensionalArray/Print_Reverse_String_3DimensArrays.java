package day22_MultiDimensionalArray;

import java.util.Arrays;

public class Print_Reverse_String_3DimensArrays {

    public static void main(String[] args) {

        String[][] items = { {"Apple", "Banana", "Grape", "Avocado"},
                             {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                             {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"} };

        for (String[] each1dArray : items) { // represent each dimensional array
            for (String eachElement : each1dArray) { // each element
                System.out.print(eachElement+"\t");
            }
        System.out.println();
        }

        System.out.println("_____________________________________________________________");

        for(int i = 0; i<items.length; i++) {//i: index of single dimensional array
            for (int j = items[i].length-1; j >=0 ; j--) { // j: index of each elements
                // [i] represents index of each array // will get in reverse order each element

                System.out.print(items[i][j] +"\t");
            }
            System.out.println();
        }

        System.out.println("_____________________________________________________________");

        for(int i = items.length-1; i >=0 ; i--) {//i: index of single dimensional array
            for (int j = 0; j<items[i].length; j++) { // j: index of each elements
                // [i] represents index of each array // will get in reverse order each element


                System.out.print(items[i][j] +"\t");
            }
            System.out.println();
        }


    }

}
/*

Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */