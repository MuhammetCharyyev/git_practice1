package day09_IfStatements2;

public class NumberToWord {

    public static void main(String[] args) {

        int num = 5;
        String word;

        if (num == 1) {
            word = "One";
        } else if (num == 2) {
            word = "Two";
        } else if (num == 3) {
            word = "Three";
        } else if (num == 4) {
            word = "Four";
        } else if (num == 5) {
            word = "Five";
        } else if (num == 6) {
            word = "Six";
        } else if (num == 6) {
            word = "Seven";
        } else if (num == 6) {
            word = "Eight";
        } else {
            word = "Nine";
        }

        System.out.println(num + " is convert to the word - " + word);


    }

}


/*
Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */