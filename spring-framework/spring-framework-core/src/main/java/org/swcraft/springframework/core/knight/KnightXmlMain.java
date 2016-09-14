package org.swcraft.springframework.core.knight;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightXmlMain {

    public static void main(String[] args) throws Exception {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("minstrel.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
