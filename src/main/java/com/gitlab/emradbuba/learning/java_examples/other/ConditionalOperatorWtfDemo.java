package com.gitlab.emradbuba.learning.java_examples.other;

import java.util.logging.Logger;

/**
 * This class demonstrates the problem with implicit unboxing in the conditional ? : operator which
 * leads to quite unexpected NullPointerException.
 * As a background see: https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.25
 */
public class ConditionalOperatorWtfDemo {

    private static final Logger LOG = Logger.getLogger(ConditionalOperatorWtfDemo.class.getName());

    public static void main(String[] args) {

        Double valueIfTrue = null;
        double valueIfFalse = 1.0;
        boolean isTrue = true;

        // According to JLS, the resulting value of the conditional expression is double (see: JLS -> 15.25.")
        // As a consequence, while evaluating a final value of the conditional expression,
        // Java tries to unbox the second operand what (because it's null) leads to a NPE.
        //
        Double resultValue = isTrue ? valueIfTrue : valueIfFalse;  // boolean ? Double : double  --> Java tries to unbox the Double which is null
        LOG.info("Result value is: " + resultValue);
    }


}
