package io.github.guit4rfre4k.wtfs;

import java.util.logging.Logger;

/**
 * This class demonstrates the problem with implicit unboxing in the conditional ? : operator which
 * leads to quite unexpected NullPointerException.
 * As a background see: https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.25
 */
public class ConditionalOperatorWtfDemo {

    private static final Logger LOG = Logger.getLogger(ConditionalOperatorWtfDemo.class.getName());

    public static void main(String[] args) {

        Double doubleValue1 = null;
        boolean booleanValue = true;

        // According to JLS, the resulting value of the conditional expression is double (see: JLS -> 15.25.")
        // As a consequence, while evaluating a final value of the conditional expression,
        // Java tries to unbox the second operand what (because it's null) leads to a NPE.
        //
        Double resultValue = booleanValue ? doubleValue1 : 1.0;  // boolean ? Double : double  --> Double is tired to be unboxed
        LOG.info("Result value is: " + resultValue);
    }


}
