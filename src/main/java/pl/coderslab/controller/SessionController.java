package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/session")
public class SessionController {
    @GetMapping("/start")
    @ResponseBody
    public String loginStart(HttpSession session){
       LocalDateTime loginStart = (LocalDateTime) session.getAttribute("loginStart");
       if (loginStart == null){
           loginStart = LocalDateTime.now();
           session.setAttribute("loginStart", loginStart);
       }
       return loginStart.toString();
    }
}
