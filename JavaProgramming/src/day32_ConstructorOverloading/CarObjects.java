package day32_ConstructorOverloading;

public class CarObjects {

    public static void main(String[] args) {
        Car car1 = new Car("toyota");

        Car car2 = new Car("Honda", "Accord");

        Car car3 = new Car("lexus", "RX350", 2021);

        Car car4 = new Car("BMW", "X6", 2020, 5000);

        Car car5 = new Car ("tesla", "mdel3", 2019, 70000, "white");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }

}
