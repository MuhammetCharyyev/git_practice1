package day23_CustomMethod_Void;

public class EligilbleToVote_Task {

    public static void main(String[] args) {

        eligibleVote(19,"so");

    }

    public static void eligibleVote (int age, String citizen){

        if (age >=18 && citizen.equalsIgnoreCase("USA")){
            System.out.println("you're eligible to vote");
        }else{
            System.out.println("you're not eligible to vote");
        }

    }

}
