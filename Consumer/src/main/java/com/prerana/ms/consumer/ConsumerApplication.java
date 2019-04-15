package com.prerana.ms.consumer;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.prerana.ms.consumer.repo.ProfileRepository;
import com.prerana.ms.consumer.repo.RemoteProfileRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication implements CommandLineRunner {

    public static final String PROFILES_SERVICE_URL = "http://PROFILES-MICROSERVICE-PRODUCER";

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ConsumerApplication.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run(args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ProfileRepository profileRepository() {
        return new RemoteProfileRepository(PROFILES_SERVICE_URL);
    }

    @Override
    public void run(String... arg0) throws Exception {
    }
}