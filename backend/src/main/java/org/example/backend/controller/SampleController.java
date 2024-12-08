package org.example.backend.controller;

import org.example.backend.dto.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public ApiResponse hello() {
        return new ApiResponse("Hello World!");
    }

}

