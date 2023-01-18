package com.rutkovski.spring.introduction;

import org.springframework.beans.factory.annotation.Value;

public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
   // }


    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }


//    public Person() {
//        System.out.println("Person bean is crated");
//    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();

    }

//    @Autowired
//    public void setPet(Pet pet) {
//        this.pet = pet;
//    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

}
