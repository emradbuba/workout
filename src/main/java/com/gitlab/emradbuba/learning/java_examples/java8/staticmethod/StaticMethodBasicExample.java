package com.gitlab.emradbuba.learning.java_examples.java8.staticmethod;

/**
 * Very easy example of a static interface method introduced in Java 8.
 */
public class StaticMethodBasicExample {

    public static void main(String[] args) {
        InterfaceA instance = new ImplementingClass();
        InterfaceA.staticMethod();
        // instance.staticMethod();             // <-- compilation error
        // ImplementingClass.staticMethod();    // <-- compilation error
    }

}

interface InterfaceA  {

    /**
     * This method does not have to be implemented/overridden in implementing classes.
     */
    static void staticMethod() {
        System.out.println("Static method of the interface A");
    }

    /**
     * Usual interface method which has to be implemented as always.
     */
    void nonStaticMethod();
}


class ImplementingClass implements InterfaceA {

    @Override
    public void nonStaticMethod() {
        // some implementation goes here...
    }
}
