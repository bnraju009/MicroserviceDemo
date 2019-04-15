package com.prerana.ms.producer;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProducerServerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ProducerServerApplication.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}