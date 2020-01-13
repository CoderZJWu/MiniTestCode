package com.jawn.combination.utils;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LetterCombinationUtilsTest {
    /**
     * 获取key映射的value的值测试：冒烟
     */
    @Test
    void valueTest() {
        String[] arr = LetterCombinationUtils.getLetterArray(2);
        Assert.assertTrue("a".equals(arr[0]));
    }

    /**
     * 获取key映射的value的值测试:空值
     */
    @Test
    void valueTest2() {
        String[] arr = LetterCombinationUtils.getLetterArray(0);
        Assert.assertTrue(arr == null || arr.length == 0);
    }

    /**
     * 是否是数字测试
     */
    @Test
    void isNumericTest() {
        boolean result = LetterCombinationUtils.isNumeric("2");
        Assert.assertTrue(result);

        boolean result2 = LetterCombinationUtils.isNumeric("a");
        Assert.assertTrue(!result2);
    }

    /**
     * 是否是2-9的数字测试
     */
    @Test
    void checkContainLetterTest() {

        boolean result = LetterCombinationUtils.checkContainLetter(0);
        Assert.assertTrue(!result);

        boolean result2 = LetterCombinationUtils.checkContainLetter(2);
        Assert.assertTrue(result2);

    }
}
