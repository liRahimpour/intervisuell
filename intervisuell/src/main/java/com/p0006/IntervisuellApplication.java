package com.p0006;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntervisuellApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntervisuellApplication.class, args);
        Logger logger = LoggerFactory.getLogger(IntervisuellApplication.class);
        logger.info("kire khare asbe looke khoshshans");

    }

}
