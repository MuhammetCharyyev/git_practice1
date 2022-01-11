package day10_NestedIf;

public class NameMonth {

    public static void main(String[] args) {

        int mon = 6;

        String month = (mon ==1)? "Jan" :(mon ==2)? "Feb" :(mon ==3)? "Mar" :(mon ==4)? "Apr" :(mon ==5)? "May":(mon ==6)? "Jun"
                :(mon ==7)? "Jul" :(mon ==8)? "Aug" :(mon ==9)? "Sep" :(mon ==10)? "Oct" :(mon ==11)? "Nov" : "Dec";

        System.out.println(month);

        // String month = mon ==1? "Jan" :mon ==2? "Feb" :mon ==3? "Mar" :mon ==4? "Apr" :mon ==5? "May":mon ==6? "Jun"
        //                :mon ==7? "Jul" :mon ==8? "Aug" :mon ==9? "Sep" :mon ==10? "Oct" :mon ==11? "Nov" : "Dec";
        // you can code with not brackets but for reading it should be


    }
}
