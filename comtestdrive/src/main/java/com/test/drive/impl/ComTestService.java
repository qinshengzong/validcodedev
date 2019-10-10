package com.test.drive.impl;

import com.test.drive.IComTestService;
import org.springframework.stereotype.Service;

@Service
public class ComTestService implements IComTestService {

    public void systemOutString(String word) {
        System.out.println(word);
    }
}
