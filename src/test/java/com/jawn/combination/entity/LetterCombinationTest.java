package com.jawn.combination.entity;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * 实体类单元测试
 */
public class LetterCombinationTest {

    /**
     * 实体值测试
     */
    @Test
    void valueTest() {
        LetterCombination letterCombination = new LetterCombination(2);
        Assert.assertTrue(2 == letterCombination.getDigit());

        String[] arr = letterCombination.getParams();
        Assert.assertTrue("a".equals(arr[0]));
    }

    /**
     * 校验是否包含映射value
     */
    @Test
    void checkDigitTest() {
        LetterCombination letterCombination = new LetterCombination(3);
        Assert.assertTrue(letterCombination.getContainLetter() == true);

        LetterCombination letterCombination2 = new LetterCombination(0);
        Assert.assertTrue(letterCombination2.getContainLetter() == false);
    }
}
