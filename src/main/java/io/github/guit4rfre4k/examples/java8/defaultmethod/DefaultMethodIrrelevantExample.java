package io.github.guit4rfre4k.examples.java8.defaultmethod;

/**
 * This exmaple ilustrates a case where default method is not relevant due to the same
 * method in the inheritance tree.
 */
public class DefaultMethodIrrelevantExample {

    public static void main(String[] args) {
        ImplementingClass implClass = new ImplementingClass();
        implClass.theMethod();

        // Output:
        // Method from the class
    }
}

class ImplementingClass extends TheClassChildA implements TheInterface1 {
    /* some class body... */

    // Default method from Interface is irrelevant as TheClassChildA provides already
    // a theMethod() method which is more important.
    // This is also why we cannot use Object's method names for default methods - they would never be invoked.

}

interface TheInterface1 {
    default void theMethod() {
        System.out.println("Method from the interface (default) ");
    }
}

class TheClassA {
    public void theMethod() {
        System.out.println("Method from the class");
    }
}

class TheClassChildA extends TheClassA {
    /* some class body... */
}

