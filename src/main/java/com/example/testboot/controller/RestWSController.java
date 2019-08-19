package com.example.testboot.controller;

import java.io.Console;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class RestWSController {
    @RequestMapping(value = "/remote/openweather")
    public Object actionMethod() {
        RestTemplate restTemplate = new RestTemplate();
        String keyId = "54a7edfd4863e36fc26b7a4615f9100c";
        String targetUri = "https://samples.openweathermap.org/data/2.5/forecast/hourly?q=M%C3%BCnchen,DE&appid="
                + keyId;
        Object resultObject = restTemplate.getForObject(targetUri, Object.class);
        return resultObject;
    }
}