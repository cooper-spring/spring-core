package com.cooper.core.config;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfigTest {

    @Test
    void basicScan() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansConfig.class);
    }

}
