package uk.co.leafdevelopment.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RestController;
import uk.co.leafdevelopment.config.controller.ClientProperties;

@SpringBootApplication
@EnableConfigurationProperties(ClientProperties.class)
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
