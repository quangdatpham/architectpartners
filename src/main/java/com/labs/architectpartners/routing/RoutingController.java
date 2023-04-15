package com.labs.architectpartners.routing;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class RoutingController {

    @ModelAttribute
    public void addAttributes(Model model, final HttpServletRequest request) {
        model.addAttribute("servletPath", request.getServletPath());
    }

    @GetMapping(value = "/")
    public String home() {
        return "index";
    }

    @GetMapping(value = "/projects")
    public String projects() {
        return "projects";
    }

    @GetMapping(value = "/about-us")
    public String aboutUs() {
        return "about-us";
    }

    @GetMapping(value = "/contact")
    public String contact() {
        return "contact";
    }
}
