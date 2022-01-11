package day10_NestedIf;

public class TernairesNestedIf {

    public static void main(String[] args) {

        int s= -5995;

       /* if(s>=0&&s<=100){

            if(s>=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{
            System.out.println("Invalid");
        }
        */

        String result=  (s>=0&&s<=100)? (s>=60)? "Passed" : "Failed" : "Invalid";

        System.out.println(result);

    }
}
