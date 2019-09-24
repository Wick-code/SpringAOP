package com.example;

import com.example.service.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Knights.xml");
        Knight knight = (Knight)applicationContext.getBean("braveKnight");
        knight.embarkOnQuest();
    }
}
