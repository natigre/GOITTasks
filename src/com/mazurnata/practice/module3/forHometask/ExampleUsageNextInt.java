package com.mazurnata.practice.module3.forHometask;

import java.time.DayOfWeek;
import java.util.InputMismatchException;
import java.util.regex.MatchResult;

import static com.sun.corba.se.impl.util.Utility.clearCaches;
import static java.time.temporal.TemporalAdjusters.next;

/*
DOTO
 */
public class ExampleUsageNextInt {
    private boolean radix;

    public static void main(String[] args) {

    }

//    public int nextInt(int radix) {
    // Check cached result
//        Object typeCache;
//        if ((typeCache != null) && (typeCache instanceof Integer)
//                && this.radix == radix) {
//            int val = ((Integer) typeCache).intValue();
//            useTypeCache();
//            return val;
//        }
//        setRadix(radix);
//        clearCaches();
//        // Search for next int
//        MatchResult matcher;
//        try {
//            String s = next(integerPattern());
//            if (matcher.group(SIMPLE_GROUP_INDEX) == null)
//                s = processIntegerToken(s);
//            return Integer.parseInt(s, radix);
//        } catch (NumberFormatException nfe) {
//            position = matcher.start(); // don't skip bad token
//            throw new InputMismatchException(nfe.getMessage());
//        }
//    }
//
//    private String processIntegerToken(String s) {
//    }
//
//    private DayOfWeek integerPattern() {
//    }
//
//    private void useTypeCache() {
//
//    }
//
//    public void setRadix(int radix) {
//        this.radix = radix;
}
