package com.jawn.combination.entity;

import com.jawn.combination.utils.LetterCombinationUtils;

/**
 * 字母组合对象
 */

public class LetterCombination {


    //private LetterCombinationUtils utils = new LetterCombinationUtils();
    /**
     * 组合的数字映射key
     */
    private Integer digit;

    /**
     * 组合的数字映射value
     */
    private String[] params;

    /**
     * 标识，是否存在映射value
     */
    private boolean containLetter = false;

    public LetterCombination(Integer digit) {
        this.digit = digit;
        this.containLetter = LetterCombinationUtils.checkContainLetter(digit);
        if (containLetter) {
            this.params = LetterCombinationUtils.getLetterArray(digit);
        }
    }

    public Integer getDigit() {
        return digit;
    }


    public String[] getParams() {
        return params;
    }


    public boolean getContainLetter() {
        return containLetter;
    }

}
