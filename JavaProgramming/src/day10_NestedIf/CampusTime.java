package day10_NestedIf;

public class CampusTime {

    public static void main(String[] args) {

        /*
        Create a class called CampusTime, an integer variable named time is given with a number between 1~24 has been
        initialized, write a program that can find out if the campus is open or not.
        Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open time they should see message:
         “open”  but if the time entered is outside of operating hours they should see: “ closed”
         */

        int time = 0;

        String operHours = (time >=0 && time <=24)? (time >=8 && time <=23) ? "open" : "closed" : "invalid";

        System.out.println(operHours);



        /*String operHours = "";

        if (time >= 0 && time <= 24) {

            operHours = (time >= 8 && time <=23) ? "Open" : "Closed";

        } else { // if the s is NOT valid
            operHours = "Invalid";
        }

        System.out.println(operHours);

         */

    }
}
