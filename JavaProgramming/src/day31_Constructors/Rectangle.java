package day31_Constructors;

public class Rectangle {
//Attributes:  length, width
    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //calculateArea(): calculates the area of the rectangle, returns it as double
    public double calcArea(){
        return length*width; //formula to find area of rectangle
    }
    // calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
    public double calcPerimeter(){
        return 2*(length+width); //formula to find perimeter of rectangle
    }
//toString(): displays the width, length, area and perimeter of the rectangle
//         when an object of rectangle passed in the print statement
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calcArea() + //added as new parameter
                ", perimeter=" + calcPerimeter() + //added as new parameter
                '}';
    }
}
/*
create a custom class named Rectangle
    Attributes:
        length, width

    Add a constructor that can set all the fields

    Actions:
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
        toString(): displays the width, length, area and perimeter of the rectangle
         when an object of rectangle passed in the print statement
 */