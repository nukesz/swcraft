package org.swcraft.springframework.core.knight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.swcraft.springframework.core.knight.BraveKnight;
import org.swcraft.springframework.core.knight.Knight;
import org.swcraft.springframework.core.knight.Quest;
import org.swcraft.springframework.core.knight.SlayDragonQuest;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}
