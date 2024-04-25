package org.pago.ggdrop.controller;

import org.pago.ggdrop.entity.*;
import org.pago.ggdrop.repository.CaseRepository;
import org.pago.ggdrop.repository.ItemRepository;
import org.pago.ggdrop.repository.UserItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.pago.ggdrop.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CaseRepository caseRepository;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private UserItemRepository userItemRepository;



    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("ggdrop", "Open Cases");
        return "index";
    }

    @GetMapping("/inventory")
    public String viewInventory(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetail userDetails = (CustomUserDetail) authentication.getPrincipal();
        model.addAttribute("user_items", userDetails.getUser_item());

        return "inventory";
    }

    @GetMapping("/case")
    public String viewCaseOpen(Model model){
        //model.addAttribute("snakebitecase", "");//caseRepository.findByName("Snakebite Case"));

        List<Item> case_drop = new ArrayList<>(itemRepository.findAll());
        model.addAttribute("case_drop", case_drop);
        return "case";
    }

    @GetMapping("/case-open")
    public String case_open(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetail userDetails = (CustomUserDetail) authentication.getPrincipal();
        if(userDetails.getBalance() < 1){
            return "redirect:/case";
        }
        userDetails.setBalance(userDetails.getBalance() - 1);
        model.addAttribute("item",userOpenCase(authentication, userDetails));
        return "case-open";
    }

    @GetMapping("/add-balance")
    public String add_balance(@RequestParam("number") double number, Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetail userDetails = (CustomUserDetail) authentication.getPrincipal();
        userDetails.setBalance(userDetails.getBalance() + number);
        userRepository.save(userDetails.getUser());
        return "redirect:/inventory";
    }
    @GetMapping("/remove-balance")
    public String remove_balance(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetail userDetails = (CustomUserDetail) authentication.getPrincipal();
        userDetails.setBalance(0);
        userRepository.save(userDetails.getUser());
        return "redirect:/inventory";
    }
    @GetMapping("/sell-item")
    public String sell_item(@RequestParam("id") int number, Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetail userDetails = (CustomUserDetail) authentication.getPrincipal();
        //Добавление баланса и удаление предмета + сохранение БД
        return "redirect:/inventory";
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

    private Item userOpenCase(Authentication user, CustomUserDetail userDetail){
        List<Item> case_drop = new ArrayList<>(itemRepository.findAll());
        Item drop = case_drop.get((int) Math.floor(Math.random()*case_drop.size()));
        User_item user_item = new User_item(userDetail.getUser(), drop);
        userDetail.addItem(user_item);
        userItemRepository.save(user_item);
        userRepository.save(userDetail.getUser());
        return drop;
    }

}
