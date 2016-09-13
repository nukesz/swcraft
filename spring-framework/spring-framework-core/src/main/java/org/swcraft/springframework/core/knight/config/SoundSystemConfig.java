package org.swcraft.springframework.core.knight.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.swcraft.springframework.core.knight",
        excludeFilters = {@Filter(Configuration.class)})
public class SoundSystemConfig {
}
