package day17_WhileLoop;

public class FrequencyOfJava {
    public static void main(String[] args) {
        String str = "Java java java python python";

        int count = 0;
        for(int i= 0 ; i <= str.length()-4; i++){ //i:0 , 1, 2,3, 4

            String s = str.substring(i, i+4);
            if(s.equalsIgnoreCase("java")){
                count++;
            }

        }

        System.out.println(count);
    }
}
/*
4. write a program that can return the frequency of the a word Java from the sentence
        Ex:
            sentence = "Java Java";
            output:
                2
            Hint: you need to create
 */

