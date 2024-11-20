package com.arbahi.servicec.client;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.openfeign.FeignClient(name = "service-b",url = "${service.b.url}")
public interface FeignClient {
    @GetMapping("/api/service-b/call-service-a")
    String getGreetFromServiceB();
}
