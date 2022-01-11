package day11_SwitchScanner;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "sfdsf";
        if (size=="tall" || size== "grande" || size =="venti") {

            switch (size){
                case "tall":
                    System.out.println("price is $3.69" +"\n"+ "90 calories");
                    break;
                case"grande":
                    System.out.println("price is $3.99" +"\n"+ "120 calories");
                    break;
                default:
                    System.out.println("price is $4.29" +"\n"+ "150 calories");

            }

        }else{
            System.out.println("invalid");
        }


    }
}

/*
 Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display
  the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */