package day17_WhileLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCC";

        String result = ""; //remove duplicates to ABC

        for (char i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i); //"A", "A", "B", "B", "C", "C"

            if (result.contains(ch)) {
                continue; //skips similar character and add to the result

            }
            result += ch;
        }


            System.out.println(result);

        }


    }

