package day19_LoopsPractices;

public class ExercisesString {

    public static void main(String[] args) {

        String str="CYDEO";
        int lastsecondOfChar = str.length() -2;
        String chars = str.substring(lastsecondOfChar);
        System.out.println(chars.repeat(3));

        System.out.println("____________________________________");

      String str2 = "Hello"; // we need to print "ell" only
       /*String str3= str2.substring(1, str2.length()-1); // will give me "ell"
        System.out.println(str3);

       */

        char firstChar = str2.charAt(0);
        char lastChar = str2.charAt(str2.length()-1);
        str2= str2.replace(firstChar, ' '); // with space in the beginning
        str2 = str2.replace(lastChar, ' '); // with space at the end

        System.out.println(str2.trim()); // remove unused spaces



    }
}
