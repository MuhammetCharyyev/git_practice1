package day21_Arrays_For_Each_Loop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String[] words = {"Java Programing", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String each : words){
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1)); // the first and last char of each word
            // + is addition but not concatination
        }


    }

}
