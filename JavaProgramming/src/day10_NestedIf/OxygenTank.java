package day10_NestedIf;

public class OxygenTank {

    public static void main(String[] args) {

        /*
         Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
          and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
         */

        int level = 0;

        String oxygenTank = (level >=0 && level<=100)? (level >=90 && level<100)? "Your tank is full" :(level >=80 && level<90)?
        "Still okay" :(level >=70 && level<80)? "Don't go too far" :(level >=60 && level<70)? "Start to head back"
                :(level >=50 && level<60)?"Be careful now you at 50%" : "Your oxy level is critical" : "invalid";

        System.out.println(oxygenTank);

    }
}
