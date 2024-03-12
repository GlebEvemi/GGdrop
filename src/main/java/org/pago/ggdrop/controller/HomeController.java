package org.pago.ggdrop.controller;

import org.pago.ggdrop.dto.UserDto;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.pago.ggdrop.entity.User;
import org.pago.ggdrop.repository.UserRepository;


@Controller
public class HomeController {



    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("ggdrop", "Open Cases");
        return "index";
    }

    @GetMapping("/auth")
    public String viewAuthPage(Model model){
        return "auth";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());

        return "registration";
    }

    @PostMapping("/process_register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        //UserRepository.save(user);

        return "register_success";
    }

}
