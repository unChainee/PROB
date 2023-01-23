package com.company;

import java.io.Serializable;

public class Fraction implements Serializable {
    private int dominator;
    private int denominator;

    public Fraction(int dominator, int denominator){
        this.dominator=dominator;
        this.denominator=denominator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "dominator=" + dominator +
                ", denominator=" + denominator +
                '}';
    }
}
