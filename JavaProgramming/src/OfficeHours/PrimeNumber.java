package OfficeHours;

public class PrimeNumber {

    public static void main(String[] args) {
        for(int i=0; i<100; i++){ // checking all numbers from 0~100 if it's prime num
            if (isPrime(i)){
                System.out.print(i+" ");
                //2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
            }
        }

    }

    public static boolean isPrime(int num) {
        if (num < 2) { // check if num is less than 2, then it is not prime
            return false;
        }
        for (int i = 2; i < num; i++) { // starting from 2
            if (num % i == 0) {
         // checking if num is divisible by i and no remainders, if yes then it's not prime
                return false;
            }
        }

        return true; // if prime number then return true
    }

}
/*  (PrimeNumber)

 Task 1 :   Write a method that can check if a number is prime or not
Note : Prime numbers are special numbers, greater than 1, that have exactly two factors,
themselves and 1
  10 -- 10 and 1 it is Prime     10 / 1-2-5-10         it is not Prime
  7                              7  / 1-7             PrimeNumber
  13                             13/  1-13             PrimeNumber
  9                              9 /  1-3-9           it is not Prime

 */