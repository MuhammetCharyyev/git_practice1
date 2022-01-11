package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(10+20);
        System.out.println(20-10);
        System.out.println(20*10);
        System.out.println(10.0/4); //to have a decimal result be sure that one of the figure is decimal
        System.out.println(10d/4); // adding lower or upper "D" to return to decimal as well

        int a = 100;
        double b = a/6; // 16.0

        System.out.println(b);

        double c = a/6d;

        System.out.println(c);

    }


}

/*
+ : addition
-: substruction
/: division
*: multiplication
%: remainder
 */