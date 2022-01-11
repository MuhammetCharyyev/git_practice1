package day14_StringClass2;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "     batch 25     "; //white spaces (unused spaces)
                                            // at the beginning or at the end but not in the middle
        str1 = str1.trim(); // create new string object without white spaces

        System.out.println(str1);

        System.out.println("__________________________________________________");

        String str2 = "Cydeo School";
        int n1 = str2.indexOf('h'); // or "h" does not matter // find the letter by index

        System.out.println(n1);

        int n2 = str2.indexOf("oo"); // find the second "o"
        System.out.println("n2 = " + n2);


        String str3 = "Java Programming language";
        int n3 = str3.indexOf("a ");
        int n4 = str3.indexOf("am"); // make this unique to find the right index , put the next letter or space

        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);

        int n5 = str3.indexOf('g');
        System.out.println("n5 = " + n5);
        int n6 = str3.indexOf("g ");

        System.out.println("n6 = " + n6);

        int n7 = str3.lastIndexOf("g"); // find index from the left or from the end of sentence

        System.out.println("n7 = " + n7);

        System.out.println("__________________________________________________");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a"); //find first "a"
        int lastA = s.lastIndexOf("a"); //find the las "a" in sentence
        int secondA = s.indexOf("a "); //find the second "a" , make it unique with adding the second symbol in sentence
        int thirdA = s.indexOf("a C"); //find the third "a" with adding three symbols to make it unique in compare with
                                       // finding the second "a"
        int fourthA = s.lastIndexOf("av"); // find "ava" from the end, also you may s.indexOf("ava W")
        // another method to find fourth "a" ==> s.indexOf("Ca") +1

        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw"); // use the shortest path to find, in this case from right to left
        int seventhA = s.lastIndexOf("a "); // finding from the right

        System.out.println(firstA);
        System.out.println(lastA);
        System.out.println(secondA);
        System.out.println(thirdA);
        System.out.println(fourthA);
        System.out.println(fifthA);
        System.out.println(sixthA);
        System.out.println(seventhA);





    }
}
