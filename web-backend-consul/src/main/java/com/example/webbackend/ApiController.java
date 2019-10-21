package com.example.webbackend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;


@RestController
public class ApiController {

    @Value("${app.id}")
    private String app_id;

    @Value("${app.message}")
    private String app_message;

    @RequestMapping("/")
    public String message() {
        return app_message + " from " + app_id;
    }
}