//package com.example.chapter_08.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class MainController {
//    @RequestMapping("/home/{color}")
//    public String home(/*@RequestParam(required = false) String name,
//                       @RequestParam(required = false) String color,*/
//            @PathVariable String color,
//            Model page) {
//        page.addAttribute("username", "Katy");
//        page.addAttribute("color", color);
////        page.addAttribute("username", name);
////        page.addAttribute("color", color);
//        return "home.html";
//    }
//}
