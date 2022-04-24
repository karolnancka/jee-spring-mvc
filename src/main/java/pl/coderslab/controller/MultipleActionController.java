package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MultipleActionController {
    @GetMapping("/form")
    public String firstAction() {
        return "form.jsp";
    }

    @PostMapping("/form")
    @ResponseBody
    public String secondAction(@RequestParam String paramName, @RequestParam String paramDate) {

        return paramName + " " + paramDate;

    }

}
