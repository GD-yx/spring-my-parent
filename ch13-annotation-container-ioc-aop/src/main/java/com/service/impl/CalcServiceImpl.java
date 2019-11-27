package com.service.impl;

import org.springframework.stereotype.Service;

/**
 * @author 南八
 */
@Service
public class CalcServiceImpl {
    public int add(int x,int y){
        System.out.println("do cal add");
        throw new RuntimeException("re");
    }
}
