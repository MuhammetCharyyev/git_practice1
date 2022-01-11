package day34_GarbageCollection_AccessModifier;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("static"); // static will be executed first
    }

    public Constructor_vs_StaticBlock(){
        System.out.println("constr");
        // constructor will not be executed if you dont assign any variables and objects
    }

    public static void main(String[] args) {
        System.out.println("main"); // the main block will be executed second after static

        new Constructor_vs_StaticBlock();
        // this is an object and execution of the constructor inside the main block

    }

}
