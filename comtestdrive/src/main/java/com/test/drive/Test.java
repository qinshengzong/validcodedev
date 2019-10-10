package com.test.drive;

import javax.annotation.Resource;

public class Test {
    @Resource(name = "s1")
    static IComTestService comTestService;

    public static void main(String[] args) {
        comTestService.systemOutString("abc");
        System.out.println("test");
    }
}
