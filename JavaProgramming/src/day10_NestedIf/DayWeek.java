package day10_NestedIf;

public class DayWeek {

    public static void main(String[] args) {

        int day =7;

        String dayWeek = (day==1)?"Mon" :(day==2)?"Tue" :(day==3)?"Wen" :(day==4)? "Thu" :(day==5)? "Fri" :(day==6)? "Sat" :"Sun";


            System.out.println(dayWeek);

        System.out.println("_____________________________________");


        }
}
