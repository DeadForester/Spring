package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

////    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Перонаж создан!");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Перонаж создан!");
        this.pet = pet;
    }


    public Person() {
        System.out.println("Перонаж создан!");
    }

    public void callYourPer(){
        System.out.println("Привет, мой любимый зверь!");
        pet.say();
    }

//   @Autowired
//   @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Set pet!");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Класс Person setSurname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Класс Person setAge");
        this.age = age;
    }
}
