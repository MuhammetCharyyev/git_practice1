package day33_Statics;

public class Iphone {

    public static String brand = "Apple"; // unchanged value that's why static

    public String model; //changeable value

    public int price;

    public static String operSystem = "iOS";

    public String color;

    public String size;

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;

    public static void printModelPrice() { // you cannot accept in static any instance objects
        // System.out.println(model+" : "+price); // you cannot print in static any instance objects
    }

    public void method1() {
        System.out.println(model + " : " + price); // if there is no static then you can print
        System.out.println(operSystem); // you can also accept static objects as well but not in opposite
    }


    public static void printOpsSystem() { //it is better to create separate static to static objects
        System.out.println(operSystem);

    }
}
