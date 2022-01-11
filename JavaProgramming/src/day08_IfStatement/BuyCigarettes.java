package day08_IfStatement;

public class BuyCigarettes {

    public static void main(String[] args) {

        byte age =19;
        boolean eligibility = age >=18;
        
        if (eligibility){
            System.out.println("eligible");
        }else{
            System.out.println("not");
        }
        
        

    }
}

/*
Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
 */