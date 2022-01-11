package day08_IfStatement;

public class NameOfDay {

    public static void main(String[] args) {
        int numberOfDay = 3;

        boolean a = numberOfDay == 1;
        boolean b = numberOfDay == 2;
        boolean c = numberOfDay == 3;
        boolean d = numberOfDay == 4;
        boolean f = numberOfDay == 5;
        boolean g = numberOfDay == 6;
        boolean h = numberOfDay == 7;

        if (a){
            System.out.println("Monday");
        }
        if (b){
            System.out.println("Tuesday");
        }
        if (c) {
            System.out.println("Wensday");
        }
        if (d){
            System.out.println("Thursday");
        }
        if (f){
            System.out.println("Friday");
        }
        if (g){
            System.out.println("Saturday");
        }
        if (h){
            System.out.println("Sunday");
        }

    }
}
