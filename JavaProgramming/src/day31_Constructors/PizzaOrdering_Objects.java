package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering_Objects {

    public static void main(String[] args) {

        ArrayList<Pizza_Task> pizzas = new ArrayList<>();

        //create 100 pizza objects: size - 'S', cheese topping - 2, pepperoni topping - 3
        // create 100 pizza objects: size - 'M', cheese topping - 3, pepperoni topping - 4
        // create 100 pizza objects: size - 'L', cheese topping - 4, pepperoni topping - 5

        for (int i = 0; i < 100; i++) { // create a for loop to calculate 100 pizzas
            Pizza_Task smallPizza = new Pizza_Task('S', 2,3);
            Pizza_Task mediumlPizza = new Pizza_Task('M', 3,4);
            Pizza_Task largePizza = new Pizza_Task('L', 4,5);

            pizzas.addAll(Arrays.asList(smallPizza, mediumlPizza, largePizza));

        }

        System.out.println("Total number of pizza: "+ pizzas.size());

        double totalPrice = 0;

        for (Pizza_Task pizza : pizzas) {
            totalPrice+=pizza.calcCost(); // price of each pizza
        }

        System.out.println("totalPrice = " + totalPrice);

    }

}
