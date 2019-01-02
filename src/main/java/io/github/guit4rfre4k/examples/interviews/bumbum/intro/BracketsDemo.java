package io.github.guit4rfre4k.examples.interviews.bumbum.intro;

/**
 * Having a method taking a string, check if the brackets in the given string are opened and closed properly.
 * Each opening bracket should have a corresponding closing bracket in a proper sequence.
 * Example of possible inputs and result:
 * - "([ ])" --> true
 * - "[ ( ] ) " --> false
 * - "[( ala  (  ma  )  kota )]"  --> true
 * - "[ala [ma kota]]" --> true
 * - "(Ala ma (kota)" --> false
 * - "[ Ala ma ( kota ] )" --> false
 */
public class BracketsDemo {

    public static void main(String[] args) {
        System.out.println(checkBrackets("([ ])"));
        System.out.println(checkBrackets("[ ( ] ) "));
    }

    private static boolean checkBrackets(String input) {
        return false;
    }




}
