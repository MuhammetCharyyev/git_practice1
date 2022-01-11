package day24_CustomMethod_Return;

public class ReturnStatement2_NameMonth {

    public static void main(String[] args) {

nameMonth(13);

    }

    public static void nameMonth (int number){

       if (number<1 || number>12){
           System.out.println("invalid");
           return; //exits the current method right after if statement is true// remaining never gets executed

        }

           String month = (number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "Mar" : (number==4)? "Apr"
                    : (number==5)? "May" :(number==6)? "Jun" : (number==7)? "Jul" :(number==8)? "Aug"
                    :(number==9)? "Sep" : (number==10)? "Oct" :(number==11)? "Nov" :"Dec";


        System.out.println(month);

    }


}
