package com.valid.codedev.impl;

import com.valid.codedev.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {
    @Override
    public void outStr(String word) {
        System.out.println("a:" + word);
    }
}
