package day36_Inheritance.phoneTask;

public class Iphone extends Phone{

    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color); // as Apple is constant for all iPhones
        // then we can make it static here and remove from constructor for iPhone
    }

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber+" is calling by face time of "+ brand+" "+model);

    }

    public void faceTime(String email){
        System.out.println(brand+" "+model+ " has received email by face time from "+email);
    }

}
/*
Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */