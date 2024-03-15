package com.example.seven.jbase.jinterface;

public interface IPerson {

    //知识点1: 接口可以声明变量，但是变量默认是 public static final
    String NAME = "interfaceTest";

    //知识点2: 接口可以声明默认方法，但是方法默认是 public abstract
    default String getName() {
        return "Person";
    }

    /**
     * 默认方法
     */
    default void showAge() {
        System.out.println("Named");
    }
}
