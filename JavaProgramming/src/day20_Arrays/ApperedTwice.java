package day20_Arrays;

public class ApperedTwice {

    public static void main(String[] args) {

        char[] ch = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};

        for (int j = 0; j < ch.length; j++) {

            char chars = ch[j];
            int frequency = 0;

            for (int i = 0; i < ch.length; i++) {
                if(ch[i]==chars){
                    frequency++;
                }
            }

            if(frequency==2){
                System.out.println(chars);
            }

        }



    }

}
