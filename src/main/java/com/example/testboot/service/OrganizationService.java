package com.example.testboot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrganizationService {
    public Object actionMethod() {
        RestTemplate restTemplate = new RestTemplate();
        Object resultObject = new Object();
        String keyId = "54a7edfd4863e36fc26b7a4615f9100c";
        String targetUri = "https://samples.openweathermap.org/data/2.5/forecast/hourly?q=London,us&mode=xml&appid="
                + keyId;
        resultObject = restTemplate.getForObject(targetUri, Object.class);

        return resultObject;
    }
}