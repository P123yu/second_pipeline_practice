package com.pipeline_2.pipeline2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pipeline2")
public class pipe2 {

    @GetMapping
    public String getPipelineMessage(){
        return "pipeline message 2 by piyush kumar";
    }
}
