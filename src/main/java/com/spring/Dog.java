package com.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class Dog implements Pet{
    private String name;
    public Dog() {
        System.out.println("Собака создана!");
    }

    @Override
    public void say(){
        System.out.println("Гав!");
    }

//    @PostConstruct
    public void init(){
        System.out.println("Class Dog: init method");
    }

//    @PreDestroy
    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
