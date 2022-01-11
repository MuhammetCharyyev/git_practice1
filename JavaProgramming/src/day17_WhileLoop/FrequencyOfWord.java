package day17_WhileLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJava";

        int frequency = 0;

        for (int i = 0; i <= str.length()-4 ; i++) {
           String each = str.substring(i, i+4);
            System.out.println(each);

        }
    }
}
