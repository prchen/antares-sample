package com.github.prchen.antares.sample;

import com.github.prchen.antares.starter.AntaresScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AntaresScan
@SpringBootApplication
public class SampleApp {

    public static void main(String[] args) {
        SpringApplication.run(SampleApp.class, args);
    }

}
