package uk.co.leafdevelopment.config.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "client")
public class ClientProperties {

    private String key;

}
