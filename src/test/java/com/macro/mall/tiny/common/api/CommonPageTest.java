package com.macro.mall.tiny.common.api;

import cn.hutool.json.JSONUtil;
import com.github.pagehelper.Page;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author aabo
 * @createTime 2022/9/12 18:22
 */
public class CommonPageTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(CommonPageTest.class);

    @Test
    public void pageHelperTest() {

        List<Object> list = new ArrayList<>();
        Page<Object> page = new Page<>();

        System.out.println(list instanceof Page);
        System.out.println(page instanceof List);
        System.out.println(page instanceof Collection);

    }

    @Test
    public void restPageTest() {

        List<Object> list = new ArrayList<>();
        list.add("xxx");
        list.add("yyy");
        list.add("zzz");

        CommonPage<Object> page = CommonPage.restPage(list);

        LOGGER.info("page: {}", JSONUtil.toJsonStr(page));

    }

}