package com.server.model;

import java.io.Serializable;

/**
 * @author zhouxuan
 * @date 2020/7/13 10:07
 */
public class Parent implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
