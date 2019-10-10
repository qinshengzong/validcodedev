package com.valid.codedev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class comb {

    @Autowired
    ITestService testService;

    public static void main(String[] args) {
//        testService.outStr("waht");
        System.out.println("end");
    }
}
