package day04_Variables;

public class Circle {

    public static void main(String[] args) {
        double radius = 3.6;
        double PI = 3.14;
        double area = PI * radius * radius;
        double diameter = radius * 2;
        double perimeter = PI * diameter;

        System.out.println("radius = " + radius);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("diameter = " + diameter);

    }

}

/*
Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI
 */
