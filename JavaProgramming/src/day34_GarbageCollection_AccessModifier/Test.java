package day34_GarbageCollection_AccessModifier;
import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {
        // you will get nulls if you try to call this from main static, you need only static

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("_____________________________________________");

        // find a sum of 10 and 20 => needs to call static from the MathUtility
       int r1= sumOf2Nums(20,10); // called due to import static utilities.MathUtility.*;

        // find sum of 100 and 200 => needs to call static from the MathUtility
        int r2=sumOf2Nums(100,200); // called due to import static utilities.MathUtility.*;

    }

}
