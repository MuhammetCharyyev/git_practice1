package day08_IfStatement;

public class NameOfMonth {

    public static void main(String[] args) {

        String currentMonth = "January";

        boolean january = currentMonth =="January";
        boolean february = currentMonth =="February";
        boolean march = currentMonth =="March";
        boolean april = currentMonth =="April";
        boolean may = currentMonth =="May";
        boolean june = currentMonth =="June";
        boolean july = currentMonth =="July";
        boolean august = currentMonth =="August";
        boolean september = currentMonth =="September";
        boolean october = currentMonth =="October";
        boolean november = currentMonth =="November";
        boolean december = currentMonth =="December";

        if(january){
            System.out.println("Current month is January");
        }
        if (february){
            System.out.println("Current month is February");
        }
        if (march){
            System.out.println("Current month is March");
        }
    }

}
