package day07_Operators;

public class ShorthandOperator {

    public static void main(String[] args) {
        //assignment: =

        int num1 = 100;

        System.out.println("number =" + num1); //100

        num1 = 200;
        System.out.println("number =" + num1); //200

        String word = "Java";

        System.out.println("word =" + word);

        word = "program";

        System.out.println("word =" + word);

        //addition assignment

        int x = 100;

        System.out.println("x = " + x); //100
        //x = x+200;// 300

        x+=200; // 300

        System.out.println("x = " + x);

        String str = "Wooden";

        str += " Spoon";

        System.out.println(str);

        double num2 = 2.5;

        num2 +=5.5;

        System.out.println(num2);

        double availBalance = 100.5;

        availBalance = 300; //300

        availBalance += 1000;

        System.out.println(availBalance);

        //withdrawing 500

        availBalance -= 500;
        System.out.println(availBalance);

        // withdrawing $200, then deposit $400

        availBalance -=200;
        availBalance +=400;
        System.out.println(availBalance);

        double salary = 50000.50;

        salary *= 2;

        System.out.println(salary);

        double bitcoin = 0.000001;

        bitcoin *= 1000000;

        System.out.println(bitcoin);

        double num3 = 25000;

        num3 /= 2;

        System.out.println(num3);

        double num4 = 100;

        num4 %= 3;

        System.out.println(num4);

        int amount = 127; //cents
        int quarters = 127 / 25;
        int cents = 127 % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        int y = 300;
        y %= 16;

        System.out.println("y = " + y);

        int balance = 3500;
        //insurance fee: $153
        balance %= 153;

        System.out.println("balance = " + balance);







    }

}
