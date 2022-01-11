package day17_WhileLoop;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scan.next();


        System.out.println("enter your gender(m/f)");
        String gender = scan.next().toLowerCase();

        while (!(gender.equals("m") || gender.equals("f"))) {
            System.err.println("invalid entry, re-enter");
            gender = scan.next().toLowerCase();
        }
        System.out.println("married(y/n)");
        String marStatus = scan.next().toLowerCase();

        while (!(marStatus.equals("y") || marStatus.equals("n"))) {
            System.err.println("invalid entry, re-enter");
            marStatus = scan.next().toLowerCase();
        }

        System.out.println("enter your age");
        int age = scan.nextInt();

        while (!(age >= 1 && age <= 120)) {
            System.err.println("invalid entry, re-enter");
            age = scan.nextInt();
        }

        System.out.println("how many miles you drive in a day");
        int miles = scan.nextInt();

        while (!(miles >= 5 )) {
            System.err.println("invalid entry, re-enter");
            miles = scan.nextInt();
        }

        System.out.println("do you wants full coverage or liability insurance? (full/liability)");
        String typeInsurance = scan.next().toLowerCase();

        while (!(typeInsurance.equals("full") || typeInsurance.equals("liability"))) {
            System.err.println("invalid entry, re-enter");
            typeInsurance = scan.next().toLowerCase();
        }

        System.out.println("did you have any accidents or claims in past 5 years? (Yes/No)");
        String accident = scan.next().toLowerCase();

        while (!(accident.equals("y") || accident.equals("n"))) {
            System.err.println("invalid entry, re-enter");
            accident = scan.next().toLowerCase();
        }

        System.out.println("does your car have an anti-theft device? (Yes/No)");
        String theft = scan.next().toLowerCase();

        while (!(theft.equals("y") || theft.equals("n"))) {
            System.err.println("invalid entry, re-enter");
            theft = scan.next().toLowerCase();
        }

        int liability =0, full = 0;

        if(age<25){
            liability += 90;
            full += 50;
        }else{
            liability += 160;
            full += 120;
        }

        if(miles<10){
            liability +=10;
            full +=20;
        }else if( miles > 10 && miles <= 50){
            liability +=30;
            full +=40;
        }else{
            liability +=50;
            full +=70;
        }

        if(theft.equals("y")) {
            liability -= 5 / 100;
            full -= 5 / 100;
        }


        if(accident.equals("y")){
            liability += 15/100;
            full +=15/100;
        }else{
            liability -=10/100;
             full -= 10/100;
        }

        if(marStatus.equals("y")){
            liability -=5/100;
            full -=5/100;
        }

        System.out.println(liability);
        System.out.println(full);




    }
}
