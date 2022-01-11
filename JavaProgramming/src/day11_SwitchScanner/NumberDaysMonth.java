package day11_SwitchScanner;

public class NumberDaysMonth {

    public static void main(String[] args) {
// We can also assign leap year int year =2000
        int num = 1;

        if (num >=1 && num<=12) {

            switch (num) {

                case 2:

                    /* if (year%4==0){ leap year
                    sout ("29 days")
                     }else{
                    sout ("28 days")
                    }
                    break;
                    */

                    System.out.println("28 days");
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;
                default:
                    System.out.println("31 days");
            }
        }else{
            System.out.println("invalid");
        }


    }
}
