package day09_IfStatements2;

public class NameDay {

    public static void main(String[] args) {

        int n = 3; //1~7
        // we can assign condition: String day;
        if (n==1){
            System.out.println("Monday");
            //day = "Monday" ==> it is coming from assignment: String
        }else if (n==2){
            System.out.println("Tue");
        }else if (n==3){
            System.out.println("Wen");
        }else if (n==4){
            System.out.println("Thu");
        }else if (n==5){
            System.out.println("Fri");
        }else if (n==6) {
            System.out.println("Sat");
        }else{
            System.out.println("Sun");
        }



    }
}
