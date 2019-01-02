package io.github.guit4rfre4k.examples.java8.defaultmethod;

/**
 * Simple example of name conflicts between default methods from different interfaces.
 */
public class DefaultMethodConflictExample {


    public static void main(String[] args) {

        ClassXY classXY = new ClassXY(); // InterfaceX classXY = new ClassXY();  // <-- also works
        classXY.defaultMethod();

        // Output:
        // ClassXY will invoke default methods from both interfaces:
        // Default method from interface X
        // Default method from interface Y
    }


}

interface InterfaceX {

    void methodX();

    default void defaultMethod() {
        System.out.println("Default method from interface X");
    }
}

interface InterfaceY {

    void methodY();

    default void defaultMethod() {
        System.out.println("Default method from interface Y");
    }
}

/**
 * As this class implements Interface X and Y, both containing the defaultMethod(), this class
 * has to implement/override the defaultMethod.
 */
class ClassXY implements InterfaceX, InterfaceY {

    @Override
    public void methodX() {
        // impl
    }

    @Override
    public void methodY() {
        // impl
    }

    @Override
    public void defaultMethod() {  // we have to implement this method or we have a complication error.
        System.out.println("ClassXY will invoke default methods from both interfaces:");
        InterfaceX.super.defaultMethod();
        InterfaceY.super.defaultMethod();

        // NOTE: The compilation problem will not occur if ClassXY would extend a CLASS defining a "defaultMethod()"
        //  as well - the class implementation would have priority in such case.
    }
}



