package com.example.seven.jbase.jinterface;


public class Student implements IPerson, INamed {

    /**
     * 知识点:
     * 1、如果一个类实现了两个接口，这两个接口有相同的方法签名，那么这个类必须实现这个方法, 只需要实现一次，不需要重复实现
     */
    @Override
    public String getName() {
        return "Student";

        // 通过接口调用默认方法, 通过接口名.方法名
        // return Person.super.getName();
    }
}
