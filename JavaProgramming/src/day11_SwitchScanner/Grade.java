package day11_SwitchScanner;

public class Grade {

    public static void main(String[] args) {

        char grade = 'f';

        switch (grade){
            case 'A':
                System.out.println("exc"); // you can also assign String result ="" and then result = "exc" and then sout (result)
                break;
            case 'B':
                System.out.println("grt");
                break;
            case'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("pass");
                break;
            case 'E':
                System.out.println("fail");
                break;
            default:
                System.out.println("invalid");
                break;
        }

    }
}
