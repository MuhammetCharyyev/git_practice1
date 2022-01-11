package day09_IfStatements2;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2001;

        boolean leapYear = year%4 ==0;

        if (leapYear){
            System.out.println("Year " + year+ " is leap year");
        }
        if (!leapYear) {
            System.out.println("Year " + year + " is not leap year"); // for single if statement
        }

            System.out.println("_________________________");

            if (leapYear) {
                System.out.println("Year " + year + " is leap year");
            }else{ // means otherwise
                System.out.println("Year " + year+ " is not leap year");
            }


    }

}
