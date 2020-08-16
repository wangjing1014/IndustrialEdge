package com.siemens.mindsphere.edge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mindsphere {

    @GetMapping("/")
    public String mindsphere() {
        return "mindsphere";
    }
}
