package day19_LoopsPractices;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // i: 0,1,2,3,4
            if(i==3){
              //  break; // terminates the loop before 3
               //continue; // scip 3 (current iteration) and other will be printer
                System.exit(0); // terminates entire program (everything)
            }
            System.out.println(i);
        }

        System.out.println("Wooden Spoon"); // will not be printed if System.exit()

    }

}

