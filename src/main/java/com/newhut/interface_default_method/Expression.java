package com.newhut.interface_default_method;

/**
 *
 * @author Ummu Hanisah
 */
public interface Expression {

    double evaluate();

    default double signum() { // both default and static method no need to be implemented by the concrete class
        return signum(evaluate());
    }

    static double signum(double value) {
        return Math.signum(value);
    }
}
