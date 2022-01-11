package day08_IfStatement;

public class SwapTwoVariables {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int c = b;
        b = a;
        a = c;



        System.out.println("b = " + b);
        System.out.println("a = " + a);

    }

}
