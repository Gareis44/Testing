package org.PruebaAutomatizada;

public class NumberUtils {
    public String getResult(int number) {
        if (number == 0) {
            return "Zero";
        } else if (number < 0) {
            return "Negative";
        } else if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

}
