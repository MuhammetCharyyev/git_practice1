package day34_GarbageCollection_AccessModifier;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main");
    }

    static {
        System.out.println("Static"); // static block will be executed first
                                    // before the main block and before anything
    }  // you cannot call a static block, executed only one time


}
