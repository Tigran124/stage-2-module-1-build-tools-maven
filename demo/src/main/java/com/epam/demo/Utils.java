package com.epam.demo;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args) {
            if (!StringUtils.isNumeric(arg)){
                return false;
            }
        }
        for (String arg : args) {
            if (Integer.parseInt(arg) <= 0){
                return false;
            }
        }
        return true;
    }
}