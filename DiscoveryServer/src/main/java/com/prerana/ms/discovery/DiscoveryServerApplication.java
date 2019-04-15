package com.prerana.ms.discovery;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DiscoveryServerApplication.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
