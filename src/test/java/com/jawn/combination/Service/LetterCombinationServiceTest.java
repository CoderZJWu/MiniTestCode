package com.jawn.combination.Service;

import com.jawn.combination.Service.Impl.CombinationServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LetterCombinationServiceTest {

    /**
     * 逻辑计算：携带非2-9
     */
    @Test
    void calculateTest() {
        CombinationService combinationService = new CombinationServiceImpl();
        List<String> list = combinationService.letterCombinations("31");
        Assert.assertTrue(list.size() == 0);
    }

    /**
     * 逻辑计算：携带>=2位数字的计算
     */
    @Test
    void calculateTest2() {
        CombinationService combinationService2 = new CombinationServiceImpl();
        List<String> list2 = combinationService2.letterCombinations("234");
        String value = "[adg, adh, adi, aeg, aeh, aei, afg, afh, afi, bdg, bdh, bdi, beg, beh, bei, bfg, bfh, bfi, cdg, cdh, cdi, ceg, ceh, cei, cfg, cfh, cfi]";
        Assert.assertTrue(value.equals(list2.toString()));
    }

    /**
     * 逻辑计算：携带1位数字的计算
     */
    @Test
    void calculateTest3() {
        CombinationService combinationService3 = new CombinationServiceImpl();
        List<String> list3 = combinationService3.letterCombinations("2");
        Assert.assertTrue(list3.get(0).equals("a") && list3.get(1).equals("b") && list3.get(2).equals("c"));
    }

    /**
     * 逻辑计算：空值计算
     */
    @Test
    void calculateTest4() {
        CombinationService combinationService4 = new CombinationServiceImpl();
        List<String> list4 = combinationService4.letterCombinations("");
        Assert.assertTrue(list4 == null || list4.size() == 0);
    }

}
