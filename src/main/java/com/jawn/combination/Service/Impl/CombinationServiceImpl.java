package com.jawn.combination.Service.Impl;

import com.jawn.combination.Service.CombinationService;
import com.jawn.combination.entity.LetterCombination;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class CombinationServiceImpl implements CombinationService {

    @Override
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<String>();
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        } else {
            letterCombinations(digits, 0, "", list);
        }
        return list;
    }

    private void letterCombinations(String digits, int index, String str, List<String> list) {
        Integer num = digits.charAt(index) - '0';
        LetterCombination letterCombination = new LetterCombination(num);
        String[] arr = null;
        if (!letterCombination.getContainLetter()) {
            return;
        } else {
            arr = letterCombination.getParams();
        }
        if (index == digits.length() - 1) {
            for (int j = 0; j < arr.length; j++) {
                list.add(str + arr[j]);
            }
            return;
        } else {
            for (int j = 0; j < arr.length; j++) {
                letterCombinations(digits, index + 1, str + arr[j], list);
            }
        }
    }
}
