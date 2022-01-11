package day36_Inheritance.phoneTask;

public class Nokia extends Phone{

    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);// as Apple is constant for all Nokias
        // then we can make it static here and remove from constructor for Nokia
    }

    public void selfDefense(){
        System.out.println(brand+" "+model+ " is for self defense");
    }

}
/*
Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()
 */