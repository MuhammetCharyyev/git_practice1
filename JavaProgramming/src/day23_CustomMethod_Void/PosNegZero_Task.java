package day23_CustomMethod_Void;

public class PosNegZero_Task {

    public static void main(String[] args) {

posNegZero(-2);

    }

    public static void posNegZero (int number){

        if (number>0){
            System.out.println("Positive");
        }else if (number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }


    }

}
//create a method that can if the given integer is positive, negative or zero