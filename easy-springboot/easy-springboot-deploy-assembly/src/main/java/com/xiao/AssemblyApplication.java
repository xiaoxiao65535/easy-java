package com.xiao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc: 功能描述：（）
 * @author： jianjun.xiao
 * @E-mail： xiaoxiao65535@163.com
 * @createTime： 2018/9/10 13:57
 */
@SpringBootApplication
@RestController
@Slf4j
public class AssemblyApplication {
    public static void main(String[] args) {
        SpringApplication.run(AssemblyApplication.class, args);
    }

    @GetMapping("/test")
    public String test() {
        log.info("info..............");
        log.warn("warn..............");
        log.error("error..............");
        return "test";
    }
}