package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Admin;

 
@Controller
@RequestMapping("/registration")
public class AdminRegController {

 

    @GetMapping("/")
    public String showHome(Model model) {
        return "index";
    }
    
    @GetMapping("/registr")
    public String showRegistration(Model model) {
        Admin admin=new Admin();
        model.addAttribute("admin", admin);
        
        return "Registration";
    }
    
    @PostMapping("/save")
    public String saveAdmin(@ModelAttribute Admin admin,Model model) {
        model.addAttribute("admin", admin);
        return "display";
    }

}
