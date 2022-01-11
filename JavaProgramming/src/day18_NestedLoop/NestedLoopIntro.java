package day18_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon"); // repeat 5 times
        }

        System.out.println("__________________________________");

        for (int j = 0; j < 4; j++) { // j: 0,1,2,3 / 4 times to repeat
            for (int i = 0; i < 5; i++) { // 5 times to repeat multiply by 4 =20 times
                System.out.println("Wooden Spoon");

            }
        }

    }
}
