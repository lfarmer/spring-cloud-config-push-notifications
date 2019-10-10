package uk.co.leafdevelopment.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    private ClientProperties clientProperties;

    @Autowired
    public ClientController(ClientProperties clientProperties) {
        this.clientProperties = clientProperties;
    }

    @GetMapping("/config")
    public String getConfig() {
        return clientProperties.getKey();
    }
}
