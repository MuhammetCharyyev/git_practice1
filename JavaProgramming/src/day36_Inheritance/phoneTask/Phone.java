package day36_Inheritance.phoneTask;

public class Phone {
//Variables:brand, model, size, price, color
    public String brand, model;
    public String size;
    public double price;
    public String color;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }



    public void call(long phoneNumber){
        System.out.println(phoneNumber + " is calling to " + brand+" "+model);
    }

    public void text(long phoneNumber){
        System.out.println(phoneNumber+ " is texting to " +brand+" "+model);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
 Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */