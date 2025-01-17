package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("personBean",Person.class);
        person.callYourPer();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

//        Cat cat = context.getBean("catBean",Cat.class);
//        cat.say();
        context.close();
    }
}
