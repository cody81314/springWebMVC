package org.cody.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/ecpay")
    public String testEcpay(
            HttpServletRequest request,
            Model model,
            @RequestParam(value="name") String name) {

        model.addAttribute("name", "<h1>ABCDE</h1>");

        return "test";
    }

    @RequestMapping(value = "/hello")
    @ResponseBody
    public User testEcpay() {

        User user = new User();
        user.setId("cody81314");
        user.setName("Cody");

        return user;
    }

    public class User {
        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
