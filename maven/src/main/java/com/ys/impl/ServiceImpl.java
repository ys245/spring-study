package com.ys.impl;

import com.ys.Service;

public class ServiceImpl implements Service {
    public  ServiceImpl(){
        System.out.println("ServiceImpl被创建了");
    }
    @Override
    public void doSome() {
        System.out.println("service的doSome方法实现了！");
    }
}
