package io.github.guit4rfre4k.examples.java8.defaultmethod;

public class DefaultMethodInSubinterface {

    public static void main(String[] args) {
        InterfaceBase instance = new MyClass();
        instance.theDefaultMethod();  // <-- which implementation will be invoked?

        // Answer: In such case the nearest from the inheritance tree.

        // Output:
        // Default method from SubSubBase interface
    }
}


class MyClass implements InterfaceBase, InterfaceSubBase, InterfaceSubSubBase {
    /* Class body...  */
}

interface InterfaceBase {
    default void theDefaultMethod() {
        System.out.println("Default method from Base interface");
    }
}

interface InterfaceSubBase extends InterfaceBase {
    default void theDefaultMethod() {
        System.out.println("Default method from SubBase interface");
    }
}

interface InterfaceSubSubBase extends InterfaceSubBase {
    default void theDefaultMethod() {
        System.out.println("Default method from SubSubBase interface");
    }
}
