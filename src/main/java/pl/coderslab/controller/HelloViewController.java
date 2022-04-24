package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class HelloViewController {

    @GetMapping("/helloView")
    public String hello() {
        return "home";
    }

    @GetMapping("/daynight")
    public String dayNight(Model model) {
        String bgColor = "white";
        String fontColor = "black";
        int hour = LocalTime.now().getHour();
        if (hour < 8 || hour > 19) {
            bgColor = "black";
            fontColor = "white";
        }
        model.addAttribute("backgroundColor", bgColor);
        model.addAttribute("fontColor", fontColor);


        return "dn/dayNight";
    }
}

