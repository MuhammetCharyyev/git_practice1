package day09_IfStatements2;

public class Calculator {

    public static void main(String[] args) {

        int n1 =100, n2=200;
        char mathOperator ='+';


        if(mathOperator=='-'){
            System.out.println(n1-n2);
        }else if(mathOperator == '+'){
            System.out.println(n1+n2);
        }else if(mathOperator=='/'){
            System.out.println(n1/n2);
        }else{
            System.out.println(n1*n2);
        }


    }
}
