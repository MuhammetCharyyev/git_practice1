package day24_CustomMethod_Return;

public class Return_VS_SystemExit_Method {

    public static void main(String[] args) {

        nameMonth(5);

        System.out.println("hello"); // execution of other methods will be proceeded despite the "return"


    }

    public static void nameMonth (int number){

        if (number<1 || number>12){
            System.out.println("invalid");
            return; //exits the current (only) method right after if statement is true
            // remaining never gets executed
             // break; use only inside the loop or switch
            //System.exit(0) will exit from all executions
        }

        String month = (number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "Mar" : (number==4)? "Apr"
                : (number==5)? "May" :(number==6)? "Jun" : (number==7)? "Jul" :(number==8)? "Aug"
                :(number==9)? "Sep" : (number==10)? "Oct" :(number==11)? "Nov" :"Dec";


        System.out.println(month);

    }

}
