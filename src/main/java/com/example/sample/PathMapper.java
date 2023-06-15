package com.example.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PathMapper {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
