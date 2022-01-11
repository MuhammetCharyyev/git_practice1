package day09_IfStatements2;

public class EligibleVote {

    public static void main(String[] args) {

        String name = "Sonya";
        int age = 18;
        String citizen = "UK";

        if (age >=18&&citizen=="USA"){
            System.out.println(name +" is eligible to vote");
        }else{
            System.out.println(name +" is not eligible to vote");
        }


    }

}
//Write a program that can check if the person is eligible to vote