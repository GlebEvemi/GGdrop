package org.pago.ggdrop.controller;

import org.pago.ggdrop.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserRepository userRepository;



    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("ggdrop", "Open Cases");
        return "index";
    }


    @GetMapping("/auth")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());

        return "auth";
    }

    @PostMapping("/register")
    public String processRegister(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);

        return "index";

    }
    @PostMapping("/login")
    public String processLogin() {
        return "login";

    }
}
