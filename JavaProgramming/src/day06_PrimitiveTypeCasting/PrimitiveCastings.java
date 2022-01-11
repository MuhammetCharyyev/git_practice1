package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;

        int x = 55;
        short y = (short) x;

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short)j;

        System.out.println(j+ " : " +k);

        double l = 2.5;
        float m = (float)l;

        System.out.println(l+ " : " +m);

        double n = 10.8;
        int s = (int)n;

        System.out.println(n+ " : " +s);

        double d1 = 20.05;
        short s1 = (short) d1; // push button alt and then push enter to go to shortcut

        System.out.println(d1+ " : " +s1);



    }

}
