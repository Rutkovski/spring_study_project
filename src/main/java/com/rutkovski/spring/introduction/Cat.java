package com.rutkovski.spring.introduction;

public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat was created");
    }

    @Override
    public void say() {
        System.out.println("May-Myau");
    }
}
