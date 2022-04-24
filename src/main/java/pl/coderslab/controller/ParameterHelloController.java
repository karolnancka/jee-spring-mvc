package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class ParameterHelloController {
    @GetMapping(value = "/{firstName}/{lastName}")
    @ResponseBody
    public String sayHello(@PathVariable String firstName, @PathVariable String lastName){
        return String.format("Hello %s %s", firstName, lastName);
    }
}
