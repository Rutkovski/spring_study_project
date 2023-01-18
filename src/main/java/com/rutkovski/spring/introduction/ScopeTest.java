package com.rutkovski.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog myDog = context.getBean("dog",Dog.class);
        myDog.say();
        context.close();
//        Dog yourDog = context.getBean("dog",Dog.class);
//
//        System.out.println("ссылаются на один и тот же объект?" + (myDog == yourDog));

    }
}
