package day24_CustomMethod_Return;

public class AvengersClass_Wtht_X {

    public static void main(String[] args) {
        //get "red" and "blue" from words
        String word = "redxx";
        String temp = "";

        if(word.startsWith("red")){
            temp="\"red\""; // slashes will give you "" in output
        }
        else if(word.startsWith("blue")){
            temp="\"blue\"";
        }else{
            temp="\"\"";
        }
        System.out.println(temp);

        System.out.println("_____________________________________________");

        /* string without 'x' first and last
         input :"xHix" → "Hi"
     input :"xHi" → "Hi"
     input :"Hxix" → "Hxi"
         */

        String word2 = "xHxix";

        String temp2 = "";

        if (word2.charAt(0)=='x' && word2.charAt(word2.length()-1)=='x'){
           /* for (int i = 1; i < word2.length()-1; i++) {
                temp2+=word2.charAt(i); // charAt method to remove first and last 'x'
            }
            */
            temp2=word2.substring(1, word2.length()-1); // substring method

        }else if (word2.charAt(0)=='x'){
            for (int i = 1; i < word2.length(); i++) {
                temp2+=word2.charAt(i);
            }
        }else if (word2.charAt(word2.length()-1)=='x'){
            for (int i = 0; i < word2.length()-1; i++) {
                temp2+=word2.charAt(i);
            }
        }
        System.out.println(temp2);


    }

}
