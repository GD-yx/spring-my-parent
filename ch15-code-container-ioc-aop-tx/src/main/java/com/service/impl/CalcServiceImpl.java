package com.service.impl;


/**
 * @author 南八
 */

public class CalcServiceImpl {
    public int add(int x,int y){
        System.out.println("do cal add");
        throw new RuntimeException("re");
    }
}
