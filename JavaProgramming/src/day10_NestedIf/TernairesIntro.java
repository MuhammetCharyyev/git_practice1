package day10_NestedIf;

public class TernairesIntro {

    public static void main(String[] args) {

        int n =100;

       if(n%2 ==0) {
            System.out.println("even");// String
        }else{
            System.out.println("odd");// String
        }

        System.out.println("______________________");

        String result1 = (n%2==0)? "even": "odd";

        System.out.println(result1);

        System.out.println("______________________");

        int age = 17;

        String eligiblility = (age >=21) ? "eligible":"not eligible";

        System.out.println(eligiblility);

        // or you can just ==> System.out.println ((age >=21) ? "eligible":"not eligible");
        System.out.println("______________________");

        int number = 0;

        String output = (number >0)? "positive" : (number <0)? "negative" : "zero";

        System.out.println(output);



    }
}
