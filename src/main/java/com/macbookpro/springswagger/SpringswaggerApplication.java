package com.macbookpro.springswagger;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author fangchangbin
 */
@SpringBootApplication
@EnableEncryptableProperties
@EnableOpenApi
@MapperScan(basePackages = "com.macbookpro.springswagger.mapper")
public class SpringswaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringswaggerApplication.class, args);
    }

}
