package com.onready.springreactssr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

  @GetMapping({"/", "/contact"})
  String index(Model model, HttpServletRequest httpServletRequest) {
    String location = String.format("%s?%s", httpServletRequest.getServletPath(), httpServletRequest.getQueryString());
    model.addAttribute("location", location);
    return "index";
  }
}
