package day17_WhileLoop;

public class BranchingStatement2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if(i=='C'){
                continue; // skip this
            }
            System.out.println(i);
        }
            System.out.println("____________________________________");

        for (int i = 0; i <= 10; i++) {

            if(i%2!=0){ // skip odd numbers
                continue;
            }

            System.out.println(i);



        }



    }
}
