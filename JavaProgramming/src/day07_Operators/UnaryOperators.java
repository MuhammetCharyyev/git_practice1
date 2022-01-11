package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 5;
        ++a; //pre increment: increase the value by 1 right away
        --a; // pre decrement: decrease the value by 1 right away

        System.out.println(a);

        int b = 100;

        System.out.println(b++); // post increment: first passes the current value then increase by 1
        System.out.println(b); // 101

        int c = 200;

        System.out.println(c--); // post decrement: first passes the current value then decrease by 1
        System.out.println(c); // 199

        int z = 45;

        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);

        int y = 30;

        System.out.println(--y);
        System.out.println(y--);
        System.out.println(y);


    }

}
