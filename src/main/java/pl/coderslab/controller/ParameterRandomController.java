package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("random")
public class ParameterRandomController {

    @GetMapping("/{max}")
    @ResponseBody
    public String randomMax(@PathVariable int max) {
        int random = new Random(System.currentTimeMillis()).nextInt(max + 1) + 1;
        String response = String.format("User set max to: %s, random number is: %s", max, random);
        return response;
    }

    @GetMapping(value = "/{min}/{max}")
    @ResponseBody
    public String randomMinMax(@PathVariable int min ,@PathVariable int max) {
        int random = new Random(System.currentTimeMillis()).nextInt(max - min + 1) + min;
        String response = String.format("User set min to: %s and max to: %s, random number is: %s", min, max, random);
        return response;
    }


}
