package day23_CustomMethod_Void;

public class ConvertDollarEuro_Task {

    public static void main(String[] args) {

convertDollTo_Euro(12, 60, 0.89, 0.78);

    }

    public static void convertDollTo_Euro (double doll, double euro, double dollEur, double eurDoll){

        System.out.println(doll*dollEur);
        System.out.println(euro/eurDoll);

    }

}
//create a method that can convert dollar to euro