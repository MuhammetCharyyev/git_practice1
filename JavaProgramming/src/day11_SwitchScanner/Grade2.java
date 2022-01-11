package day11_SwitchScanner;

public class Grade2 {

    public static void main(String[] args) {

        char ch = 'F';

        switch (ch){
            case 'A':  case 'B':  case 'C': case 'D':
                System.out.println("pass");
                break;
            case 'F':
                System.out.println("fail");
                break;
            default:
                System.out.println("invalid");
        }

    }
}
