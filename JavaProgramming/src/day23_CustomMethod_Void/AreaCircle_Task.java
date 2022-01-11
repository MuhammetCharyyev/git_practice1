package day23_CustomMethod_Void;

public class AreaCircle_Task {

    public static void main(String[] args) {

areaCircle(3.16, 20);

    }

    public static void areaCircle (double pi, double radius){

        if(pi==3.14){
           double area = pi*(radius*radius);
            System.out.println(area);
        }else{
            System.out.println("wrong input");
        }

    }

}
//create a method that can calculate the area of a circle