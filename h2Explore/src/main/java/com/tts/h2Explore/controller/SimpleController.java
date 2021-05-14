package com.tts.h2Explore.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
	//this value is coming from the variable defined in application.properties
    @Value("${spring.application.name}")
    String appName;
	// Below we are using an object of type model
    //this describes a UI element that will appear in html
    //typically, these are used for template eengine solutions
    // such as thymeleaf
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
}

