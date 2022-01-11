package day11_SwitchScanner;

public class DayWeek {

    public static void main(String[] args) {

        int num = 0;

        switch (num){ // I want to compare with other numbers 1~7, only == operator can be used not others operators
            case 1 :
                System.out.println("Mon");
                break; //exits the switch after executing the case block
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wen");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid");
                break; //it is not neseserily to put break here if it is the end

        }

    }
}
