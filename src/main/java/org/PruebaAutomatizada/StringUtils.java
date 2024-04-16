package org.PruebaAutomatizada;

public class StringUtils {
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public int countCharacters(String str) {
        return str.length();
    }

    public String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
