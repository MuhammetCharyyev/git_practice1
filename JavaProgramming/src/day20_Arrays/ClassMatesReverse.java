package day20_Arrays;


import java.util.Arrays;

public class ClassMatesReverse {

    public static void main(String[] args) {

        String[] classmates = {"Bezos", "Musk", "Arnault", "Gates", "Buffett", "Brin", "Zuckerberg", "Ellison",
                "Page", "Ballmer"};


        // i: index numbers of string (starting last index to index 0)
       for (int i = 0; i < classmates.length; i++) {
           String reverse = "";

           for (int j = classmates[i].length() - 1; j >= 0; j--) {

              reverse+=classmates[i].charAt(j);

           }
           System.out.print(reverse);
       }




    }
}
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */