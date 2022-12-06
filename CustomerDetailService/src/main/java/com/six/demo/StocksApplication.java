package com.six.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.six")
public class StocksApplication {

	public static void main(String[] args) {
		SpringApplication.run(StocksApplication.class, args);
	}
        
        // ADDED REST TEMPLATE - makes calls to Producer's REST API
        @Bean
        public RestTemplate getTemplate() {
            return new RestTemplate();
        }

}
