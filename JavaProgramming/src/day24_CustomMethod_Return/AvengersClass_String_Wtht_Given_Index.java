package day24_CustomMethod_Return;

public class AvengersClass_String_Wtht_Given_Index {

    public static void main(String[] args) {

        /*
         * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
         * The value of n will be a valid index of a char in the original string
         * (do with for loop)
         * input:  kitchen and 2
         * output: kichen
         * input:  kitchen and 0
         * output: itchen
         */

        String word = "kitchen";

        int index = 0; // changable variable to indicate index which will be excluded

        String temp = word.substring(0,index) + word.substring(index+1); // "itchen" // way to remove
        // particular letter

        System.out.println(temp);

        System.out.println("___________________________________________________");

        String temp2 = "";

        for (int i = 0; i < index; i++) { // the other way to get "itchen" using charAt
            temp2+=word.charAt(i);
        }
        for (int i = index+1; i < word.length(); i++) {
            temp2+=word.charAt(i);
        }
        System.out.println(temp2);

        System.out.println("___________________________________________________");

        String temp3 = "";

        for (int i = 0; i < word.length(); i++) {

            if(i==index){
                continue; // one more way to skip the particular index / "itchen"
            }
                temp3+=word.charAt(i);
        }
            System.out.println(temp3);





    }

}
