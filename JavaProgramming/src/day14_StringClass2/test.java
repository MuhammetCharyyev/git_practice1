package day14_StringClass2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below

        String id = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1 );
        char at = '@';

        if(!email.contains("@")){
            System.out.println("invalid email: "+ email);
        }else if(at>2){
            System.out.println("invalid email: "+ email);
        }else {
            System.out.println("Email id: "+id+"\nEmail domain: "+ domain);
        }



    }
}
