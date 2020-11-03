package com.atguigu.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ADvancedCZ
 * @CreateTime 2020/11/3 23:01
 * @Description
 */
@MapperScan("com.atguigu.edu.mapper")
@SpringBootApplication
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class, args);
    }
}
