package com.disnoire.git_demo_masters_degree;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping(path = "/index")
    public String getIndex() {
        return "Hello world";
    }
}
