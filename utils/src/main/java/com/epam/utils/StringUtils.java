package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        Integer i = Integer.valueOf(str);
        return i > 0;
    }
}
