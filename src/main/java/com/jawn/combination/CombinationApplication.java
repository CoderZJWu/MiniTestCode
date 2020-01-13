package com.jawn.combination;

import com.jawn.combination.Service.CombinationService;
import com.jawn.combination.utils.LetterCombinationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

/**
 * @author Jawn
 */
@SpringBootApplication
public class CombinationApplication implements ApplicationRunner {

    @Autowired
    private CombinationService combinationService;

    public static void main(String[] args) {
        SpringApplication.run(CombinationApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("请输入 ‘start’ 开始计算组合，或者 ‘end’ 结束程序");
            String inputs = scanner.nextLine();
            if (!"start".equals(inputs) && !"end".equals(inputs)) {
                System.out.println("请输入正确的字符!");
                continue;
            } else if ("end".equals(inputs)) {
                //结束程序
                flag = false;
                continue;
            }
            //开始计算组合
            System.out.println("请输入2-9的数字组合序列,例如：23");
            String digits = scanner.nextLine();
            if (digits == null || digits.length() == 0 || !LetterCombinationUtils.isNumeric(digits)) {
                System.out.println("非法字符!");
                continue;
            }
            //开始计算
            List<String> list = combinationService.letterCombinations(digits);
            if (list == null || list.size() == 0) {
                System.out.println("此数字组合序列没有字母组合\r\n");
                continue;
            } else {
                System.out.println("字母组合:");
                System.out.println(list);
            }
        }
    }

}
