package com.rutkovski.spring.introduction;

public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog bean is crated");
    }

    @Override


    public void say(){
        System.out.println("Bow-Wow");
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("Class Dog: init method");
//    }
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class Dog: destroy method");
//    }
}
