package day24_CustomMethod_Return;

public class ReturnStatement_Branching {

    public static void main(String[] args) {

        nameDay(6);

    }

    public static void nameDay (int number) {
        if (number < 1 || number > 7) { // if the number is invalid
            System.out.println("invalid");
            return; // exits nameOfDay statement , no need }else{
        }

            String day = "";

            day = (number == 1)? "Mon" :(number == 2)? "Tue" :(number == 3)? "Wen" :(number == 4)? "Thu"
                    : (number == 5) ? "Fri" : (number == 6)? "Sat" : "Sun";

        System.out.println(day);
        }



}
