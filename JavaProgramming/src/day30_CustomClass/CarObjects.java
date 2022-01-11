package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Mercedes", "AMG GT", 2021, 20000,"black");

        Car car2 = new Car();
        car2.setInfo("BMW", "335is", 2020, 45000, "Black");

        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", 40000, 2019, "Red");

        System.out.println(car3);


        System.out.println(car1);
        car1.start();
        car1.drive();
        car1.stop();

// Car[] cars = { car1, car2, car3 };

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2, car3));

        for(Car each:carsList){
            System.out.println(each.brand+" : " +each.price); //to print each brand and its price
        }

        System.out.println("____________________________________________");

        /* if you want to recall some models for some year of production
             Recall:
            BMW: 2005 ~ 2008
            Toyota: 1995 ~ 1997

         */

        carsList.removeIf(p-> p.brand.equals("BMW") && p.year>=2005 && p.year<=2008);
        carsList.removeIf(p-> p.brand.equals("Toyota") && p.year>=1995 && p.year<=1997);

    }
}
