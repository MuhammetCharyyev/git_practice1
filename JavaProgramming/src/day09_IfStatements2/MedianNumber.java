package day09_IfStatements2;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 20, b= 30, c=10;
        boolean aIsMedian = (a<b && a>c) || (a>b && a<c),
        bIsMedian =  (b<a && b>c) || (b>a && b<c),
        cIsMedian = (c<b && c>a) || (c>b && c<a); // or just !aIsMedian && !bIsMedian

        if (aIsMedian) {
            System.out.println(a+ " is a median");
        }
        if (bIsMedian) {
            System.out.println(b + " is a median");
        }

        if (cIsMedian) {
            System.out.println(c + " is a median");
        }



    }

}

/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */