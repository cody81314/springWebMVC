package org.cody.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/ecpay")
    public String testEcpay(
            HttpServletRequest request,
            Model model,
            @RequestParam(value="name") String name) {

        model.addAttribute("name", "Cody");

        return "test";
    }
}
