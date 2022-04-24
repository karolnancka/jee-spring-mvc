package pl.coderslab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/second")
public class SecondController {

    @GetMapping("/handle")
    @ResponseBody
    public String handler(){
        return "path_to_view";
    }
}
