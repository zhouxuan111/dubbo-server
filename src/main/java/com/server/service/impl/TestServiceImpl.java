package com.server.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.server.service.TestService;

/**
 * @author zhouxuan
 * @date 2020/7/7 17:44
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public List<String> test() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        return list.subList(0, 1);
    }
}
