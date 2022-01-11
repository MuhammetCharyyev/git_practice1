package day24_CustomMethod_Return;

public class FrequencyOfWord_Practice {

    public static void main(String[] args) {

        String sentence = "Java java python python";
        String word = "java";

        System.out.println(frequencyOfWord(sentence,word));

    }

    public static int frequencyOfWord(String sentence, String word) {

        int count = 0;
        for (int i = 0; i <= sentence.length() - 4; i++) {

            String s = sentence.substring(i, i + 4);
            if (s.equalsIgnoreCase(word)) {
                count++;
            }

        }
        return count;
    }

}
/*
create a method named frequencyOfWord that passes two parameters: string sentence and String word,
 then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3

 */