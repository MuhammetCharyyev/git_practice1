package day11_SwitchScanner;

public class Elevator {

    public static void main(String[] args) {

        int floorNum = 1;

         if (floorNum >=1 && floorNum<=3 ){

             switch (floorNum){
                 case 1:
                     System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                     break;
                 case 2:
                     System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                     break;
                 default:
                     System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
             }


        }else{
            System.out.println("invalid");
        }


    }
}

/*
Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */
