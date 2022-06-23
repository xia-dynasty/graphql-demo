package com.xia.yu.graphqldemo.domain.entity;

/**
 * description:
 *
 * @author wanghaoxin
 * date     2022/6/23 00:17
 * @version 1.0
 */
public class Actor {
    private final String name;
    private final Integer age;

    public Actor(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
