package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Jimmy Joe",
                buildingNumber = "95 ",
                streetName = "Elm Street,",
                city = "Chicago, ",
                state = "Il, ",
                zipCode = "60016";
        String shippingAddress = name + "\n" + "\t" +buildingNumber + " " + streetName + "\n" + "\t" + city + " " + state + " " + zipCode;

        System.out.println(name + "\n" + shippingAddress);
        System.out.println("Shipping Address:" + "\n" + "\t" + shippingAddress);


    }
}

/*
Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address
 */