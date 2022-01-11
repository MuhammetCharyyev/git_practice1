package day30_CustomClass;

public class Car {

    //make attributes for 'Car' object
    public String brand;
    public String model;
    public int year;
    public int price;
    public String color;

    public void setInfo(String carBrand, String carModel, int carYear, int carPrice,
                         String carColor) { // method is created to
                                                          // avoid repetition steps
                                                         // in indicating info
        brand=carBrand;
        model=carModel;
        year= carYear;
        price = carPrice;
        color =carColor;
    }
    //creat methods for exact name
    public void drive(){
        System.out.println(brand+ " " +model+ " is driving");
    }

    public void start(){
        System.out.println(brand+ " " + model + " is starting");
    }

    public void stop(){
        System.out.println(brand+ " " + model + " has stopped");
    }

    public String toString() {// generated method to print out all object
        //right button->Generate->select toString-> remove Insert @Overide->push OK
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= $" + price +
                ", color='" + color + '\'' +
                '}';


    }
}
