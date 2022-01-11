package day23_CustomMethod_Void;

public class EligibleAlcohol_Task {

    public static void main(String[] args) {

eligibleAlco(18);

    }

    public static void eligibleAlco (int age){

        if(age >=18){
            System.out.println("you're eligible to buy alco");
        }else{
            System.out.println("you're not eligible");
        }

    }

}
//create a method that can check if a person is eligible to buy alcohol