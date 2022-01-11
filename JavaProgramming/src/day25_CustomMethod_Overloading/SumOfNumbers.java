package day25_CustomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum = sumOf2Nums(10, 20);
        int sum2 = sumOf3Nums(10, 20, 30);
        int sum3 = sumOf4Nums(10, 20, 30, 40);

        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);
    }

    public static int sumOf2Nums(int num1, int num2) {

        return num1 + num2;
    }

    public static int sumOf3Nums(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }

    public static int sumOf4Nums(int num1, int num2, int num3, int num4) {

        return num1 + num2 + num3 + num4;
    }

}
