package com.sbb;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "redirect:/question/list";
    }
}
