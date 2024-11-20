package com.arbahi.servicec.controllers;

import com.arbahi.servicec.client.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service-c")
public class ServiceCcontroller {

    private final FeignClient feignClient;

    public ServiceCcontroller(FeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @GetMapping("/call-service-b")
    public String callServiceB() {
        return "Response from Service-B: " + feignClient.getGreetFromServiceB();
    }

}
