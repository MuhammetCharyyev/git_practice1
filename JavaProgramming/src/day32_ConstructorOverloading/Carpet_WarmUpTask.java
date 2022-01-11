package day32_ConstructorOverloading;

public class Carpet_WarmUpTask {

    public double width, length, unitPrice;
    public boolean isPersian;

    public Carpet_WarmUpTask(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public void customOrder(){
        System.out.println(width+ " " + length + " " + unitPrice + " " + isPersian);
    }

    public double calcCost(){
        double totalPrice = (width*length)*unitPrice;
        if(isPersian){
            totalPrice+=200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalCost= $" + calcCost() +
                '}';
    }

}
/*
Carpet Task:
5.1create a custom class for the Carpet class that should contain
the following:
instance variables:
width, length, unitPrice, isPersian (boolean)
instance methods:
customOrder(): sets the carpet' width, length,
unitprice, & isParsian
calcCost(): should be able to caculate the total
cost of the carpet and return it as double
toString(): should be able to display all the info
of the carpet including the total cost of the carpet as calculated by
calcCost()
total price of carpet = (width*length)*unitprice
if the carpet is persian  carpet, add 200$ to the totalPrice
 */