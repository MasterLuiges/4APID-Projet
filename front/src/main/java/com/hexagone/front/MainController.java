package com.hexagone.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
class WebController {

    /**
     * @param path  url route
     * @return      view
     */
    @GetMapping(path = "/")
    public String home() {
        return "home";
    }

    /**
     * @param path  url route
     * @return      view
     */
    @GetMapping(path = "/users")
    public String customers(Principal principal, Model model) {
        model.addAttribute("username", principal.getName());
        return "users";
    }
}
