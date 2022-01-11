package day36_Inheritance.phoneTask;

public class Samsung extends Phone {

    public Samsung( String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);// as Samsung is constant for all samsungs
        // then we can make it static here and remove from constructor for Samsung
    }

    public void freeze(){
        System.out.println(brand+" "+model+ " is freezing");
    }

}
/*
Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */