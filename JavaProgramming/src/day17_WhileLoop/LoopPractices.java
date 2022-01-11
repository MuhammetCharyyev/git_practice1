package day17_WhileLoop;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i); // prints from 1 to 10

        }

        System.out.println("________________________________");

        int j=1; // in while loop you should give declare this starting point before
        while (j<=10){
            System.out.println(j); // increasing 1 by 1
            j++;

        }

        System.out.println("________________________________");

        int k =1;

        do{
            System.out.println(k);
            k++; // after the statement in comparison with while loop
        }while(k<=10);
    }
}
