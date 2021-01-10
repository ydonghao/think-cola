package com.amos.think;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Spring Boot Starter
 *
 * @author Frank Zhang
 */
@EnableScheduling
@EnableJpaAuditing
@SpringBootApplication(scanBasePackages = {"com.amos.think", "com.alibaba.cola"})
@MapperScan("com.amos.think.tunnel.database.**.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}