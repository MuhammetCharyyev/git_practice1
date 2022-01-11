package day24_CustomMethod_Return;

public class ReturnMethod_Practice2_Grade {

    public static void main(String[] args) {
        // create function to calculate the grade
        /*
        check the grade:
        'A' ==> Excelent
        'B' ==> Great
        ...............
         */

        String str1 = grade(10);

        System.out.println(str1);

        if(str1.equals("A")){
            System.out.println("Excel");
        }else if(str1.equals("B")){
            System.out.println("Great");
        }else if (str1.equals("C")){
            System.out.println("Good");
        }else if(str1.equals("D")){
            System.out.println("Passed");
        }else{
            System.err.println("Try again");
        }


    }

    public static String grade (int score){

        String result = "";

        if(score<0||score>100){
            result="invalid";
        }else{

            result = (score >=90)? "A" :(score>=80)? "B" :(score>=70)? "C" :(score>=60)? "D" :"F";
        }
        return result;

    }



}
