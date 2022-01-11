package OfficeHours;

public class Deeper {

    public static void main(String[] args) {
        System.out.println("Not Deep"); // this will be printed first as it is main   /1
        deep(); // called 'deep' method as stated below, printed second
        System.out.println("Not Deep");// printed at 5th turn   /5

    }

    public static void deep() {
        System.out.println(" Deep");   //2
        deeper();// called 'deeper' method as stated below, printed third
        System.out.println(" Deep"); // printing in fourth   /4

    }

    public static void deeper() {
        System.out.println(" Deeper");   //3

    }

}
