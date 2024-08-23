package com.login.controller;


import com.login.controller.backend.Student;
import com.login.controller.backend.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
    @Autowired
    StudentRepository repo;
    @GetMapping("/")
    public String showIndex(){
        return "index";
    }
    @GetMapping("/Login")
    public String showLogin(Model model){
        model.addAttribute("student", new Student());
        return "Login";
    }
    @GetMapping("/Error")
    public String showError(){
        return "Error";
    }
    @GetMapping("/Success")
    public String showSuccess(){
        return "Success";
    }

    //Index Handling
    @PostMapping("/goLogin")
    public String retrieveLogin(Model model){
        model.addAttribute("student", new Student());
        return "Login";
    }

    //Login Handling
    @PostMapping("/loginProcess")
    public String loggingIn(@RequestParam("mail") String email, @ModelAttribute Student student){
        if(email.contains("@mail.valenciacollege.edu")){
            student.setEmail(email);
            repo.save(student);
            return "Success";
        } else {
            return "Error";
        }
    }
}
