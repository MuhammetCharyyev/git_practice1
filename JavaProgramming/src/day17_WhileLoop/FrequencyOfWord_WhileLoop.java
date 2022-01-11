package day17_WhileLoop;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);


        System.out.println("______________________________________");

        String sentence = "cat cat dog cat dog dog cat cat dog";
        int countCat = 0;

        while (sentence.contains("cat")){
            sentence=sentence.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println(countCat);

        System.out.println("_____________________________________________");

        String s = "java java python python";

        int countJava = 0, countPython = 0;

        while(s.contains("java")||s.contains("python")){
            if (s.contains("java")){
                s=s.replaceFirst("java", "");
                countJava++;
            }
            if(s.contains("python")){
                s=s.replaceFirst("python", "");
                countPython++;
            }
        }

        System.out.println(countJava);
        System.out.println(countPython);



    }
}
