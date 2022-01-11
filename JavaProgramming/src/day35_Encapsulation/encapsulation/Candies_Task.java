package day35_Encapsulation.encapsulation;

public class Candies_Task {
//brand (String), quantity (int), price (double), hasPeanuts (boolean)
    private String brand; // private to make it secure// you own it and you control it
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    //Encapsulate All the private fields

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }
// (quantity of candy can not be set to zero or negative)
    public void setQuantity(int quantity) {
        if(quantity<=0){
            return;
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
//(price of candy can not be set to negative)
    public void setPrice(double price) {
        if(price<0) {
            return;
        }else if(price==0){
           // if the price is zero, print "free" instead of 0
            System.out.println("free");
            }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }
// Add a constructor that allows user to set all the fields when the object is created.
//               (If the arguments not valid it should not be set to the instances)
    public Candies_Task(String brand, int quantity, double price, boolean hasPeanuts) {
       setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String toString() {
        return "Candies_Task{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price= $" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
/*
CandiesTask
         1.1 Create a custom class named Candy
                private variables:
                    brand (String), quantity (int), price (double), hasPeanuts (boolean)

                Encapsulate All the private fields
                        (price of candy can not be set to negative)
                        (quantity of candy can not be set to zero or negative)

        Add a constructor that allows user to set all the fields when the object is created.
               (If the arguments not valid it should not be set to the instances)

                Extra methods:
                    toString():
                        if the price is zero, print "free" instead of 0


 */