package day31_Constructors;

public class Pizza_Task {
    // Attributes:
    //            size, numberOfCheeseTopping, numberOfPepperoniTopping
    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;
//constructor that can set all the fields
    public Pizza_Task(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    // Pizza cost is determined by:
    //                        S: $10 + $2 per topping
    //                        M: $12 + $2 per topping
    //                        L: $14 + $2 per topping
    public double calcCost(){
        double startingPrice = (size=='S')? 10 :(size=='M')? 12 : 14;
                              // statement to find price for exact size of pizza
        double totalPrice = startingPrice + (numberOfCheeseTopping+numberOfPepperoniTopping)*2;
        // topping - 2 times, that's why *2
        return totalPrice;
    }
    // toString():returns a String containing the pizza size, quantity of each topping,
    public String toString() {
        return "Pizza_Task{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price= $" + calcCost() + // added aditionaly based on calculation above
                '}';
    }

    //Actions:
    //            calcCost(): returns the totalCost of the pizza

    //             and the pizza cost as calculated by calcCost()



}
/*Pizza Task:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping,
             and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */