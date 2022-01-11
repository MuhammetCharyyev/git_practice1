package day21_Arrays_For_Each_Loop;

public class ReverseName_ForEachLoop {

    public static void main(String[] args) {

        String[] names = {"Jeff Bezos", "Elon Musk", "Bernard Arnault", "Bill Gates", "Pavel Durov"};

        for (String each : names) { // for each loop does not do reverse by itself

            String reversed = " ";

            for (int i = each.length()-1; i >= 0; i--) { // to reverse using the for each loop you have to
                // use nested for loop
                reversed+=each.charAt(i);
            }

            System.out.println(reversed);

        }

    }


    }
