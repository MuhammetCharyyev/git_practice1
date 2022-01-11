package day37_Inheritance2;

class A {

    public A(int a) {
        System.out.println("A");
    }
}
class B extends A{
        public  B  (){
            super(9); // inherited from A class
            // if constructor with argument like (int a) in this case then we need super()
            System.out.println("B");
        }
    }



public class ConstructorPractice {

    public static void main(String[] args) {

        B obj = new B();

    }

}
