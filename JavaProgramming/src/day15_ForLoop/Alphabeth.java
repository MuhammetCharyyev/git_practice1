package day15_ForLoop;

public class Alphabeth {

    public static void main(String[] args) {

        for (int i =65; i<=90; i++) { //print A~Z // char 65~90
            System.out.print((char) i + " ");
        }

        System.out.println();

        System.out.println("___________________________________");

        for (char i = 'A'; i<='Z'; i++) { // another option ==> use char
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("___________________________________");

        for (char i ='a'; i<='z'; i++) { // another option ==> use char
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("___________________________________");

        for (char i ='Z'; i>='A'; i--){ // in reverse order
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("___________________________________");

        for (char i ='z'; i>='a'; i--){ // in reverse order
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("___________________________________");

        for (char i =1; i<=40000; i++){
            System.out.print(i + " ");
        }


    }
}
