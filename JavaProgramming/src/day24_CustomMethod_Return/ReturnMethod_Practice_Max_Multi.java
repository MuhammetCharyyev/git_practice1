package day24_CustomMethod_Return;

public class ReturnMethod_Practice_Max_Multi {

    public static void main(String[] args) {
        // find the max num between 100~200

       int maxNum= max(100, 200);

        System.out.println(maxNum);

        //multiply by 2

        int multi = maxNum*2;

        System.out.println(multi);



    }

    public static int max( int number1, int number2) {


        int result = 0;

        if( number1>number2){
            result = number1;
        }else{
            result=number2;
        }

        return result;

    }



}
