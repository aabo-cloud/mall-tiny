package com.macro.mall.tiny.dto;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author aabo
 * @createTime 2022/9/24 14:01
 */
public class AdminUserDetailsTest {

    @Test
    public void getAuthorities() {

        List<String> labelsFromDUCC = new ArrayList<>();
//        labelsFromDUCC.add("自动加黑");
        List<String> labelsFromCdr = new ArrayList<>();
        labelsFromCdr.add("自动加黑");
        labelsFromCdr.add("肯定");

//        long count = labelsFromCdr.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return labelsFromDUCC.contains(s);
//            }
//        }).count();

        long count = labelsFromCdr.stream().filter(s -> labelsFromDUCC.contains(s)).count();
        boolean b = labelsFromCdr.stream().noneMatch(s -> labelsFromDUCC.contains(s));
        System.out.println(b);

        System.out.println(count);

    }

}