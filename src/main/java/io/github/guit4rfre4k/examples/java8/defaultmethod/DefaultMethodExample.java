package io.github.guit4rfre4k.examples.java8.defaultmethod;

/**
 * The basic example of default methods in Java8.
 */
public class DefaultMethodExample {

    public static void main(String[] args) {

        InterfaceA instanceA = new ClassA();
        instanceA.methodA();
        instanceA.defaultMethodA();
        // Output:
        // Implemetation from ClassA
        // Default method
    }

}

interface InterfaceA {

    void methodA();

    default void defaultMethodA() {  // default method
        System.out.println("Default method");
    }
}

class ClassA implements InterfaceA {

    @Override
    public void methodA() {
        System.out.println("Implemetation from ClassA");
    }

    // We can override the default method but we don't have to:
    /*
    @Override
    public void defaultMethodA() {
        System.out.println("Default method from class A");
    }
    */
}
