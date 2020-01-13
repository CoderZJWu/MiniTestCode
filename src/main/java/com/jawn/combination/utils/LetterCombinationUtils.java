package com.jawn.combination.utils;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jawn
 */
@Component
public class LetterCombinationUtils {
    private static Map<Integer, String> params = Collections.unmodifiableMap(new HashMap<Integer, String>() {
        {
            put(2, "abc");
            put(3, "def");
            put(4, "ghi");
            put(5, "jkl");
            put(6, "mno");
            put(7, "pqrs");
            put(8, "tuv");
            put(9, "wxyz");
        }
    });

    public static String[] getLetterArray(Integer digit) {
        String str = params.get(digit);
        return str == null ? new String[]{} : str.split("");
    }

    public static boolean checkContainLetter(Integer digit) {
        if (!StringUtils.isEmpty(digit) && digit.toString().matches("[2-9]")) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
