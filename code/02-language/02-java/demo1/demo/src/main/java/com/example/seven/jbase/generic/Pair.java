package com.example.seven.jbase.generic;

public class Pair <T extends Employee> {

    // 通过Pair<Manager> 和 Pair<Employee> 是两个完全不同的类，两个类型的Pair对象调用print方法
    // 使用通配符 ? extends Employee,可以接受任何Employee的子类
    public static void print(Pair<? super Employee> pair) {
        System.out.println(pair.getFirst() + " " + pair.getSecond());
    }

    // 不能创建静态变量的泛型
    //static T singleInstance;

    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }
}
