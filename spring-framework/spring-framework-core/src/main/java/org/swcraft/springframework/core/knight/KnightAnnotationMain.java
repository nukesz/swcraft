package org.swcraft.springframework.core.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.swcraft.springframework.core.knight.config.KnightConfig;

public class KnightAnnotationMain {

	public static void main(String[] args) { 
		ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
	}
}
