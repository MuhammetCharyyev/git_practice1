package day10_NestedIf;

public class Grade {

    public static void main(String[] args) {

        byte n1 = 8;
        String result = "";

        if (n1 >= 0 && n1 <= 18) {

            if (n1 >= 1 && n1 <=5) {
                result = "Elementary school";
            } else if (n1 >= 6 && n1 <=8) {
                result = "Middle school";
            } else if (n1 >= 9 && n1 <=12) {
                result = "High school";
            } else if (n1 >=13 && n1 <=16) {
                result = "College";
            } else {
                result = "Grad School";
            }


        } else {
            result = "Invalid grade level given";
        }


        System.out.println(result);


    }
}
