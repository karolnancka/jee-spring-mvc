package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MultiplyController {

    @GetMapping("/multiply/{size}")
    public String multiply(Model model, @PathVariable int size){
        model.addAttribute(size);
        return "multiply";
    }

    @GetMapping(value = "/multiplyParam/{rows}/{cols}")
    public String multiplyParam(Model model, @PathVariable int rows, @PathVariable int cols){
        model.addAttribute(cols);
        model.addAttribute(rows);
        return "multiplyParam";
    }

}
