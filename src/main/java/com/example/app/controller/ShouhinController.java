package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShouhinController {

    @RequestMapping("shouhin")
    String load() {
        return "shouhin";
    }
}
